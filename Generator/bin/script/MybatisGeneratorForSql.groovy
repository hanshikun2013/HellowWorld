package script;
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ParameterMetaData
import java.sql.PreparedStatement
import java.sql.ResultSetMetaData

import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.*

import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*
import org.apache.velocity.VelocityContext

import tool.common.StringUtil
import tool.common.TemplateGenerator
import tool.model.dictmodel.SqlModel
import tool.model.sql.IoItem;


//String filePath =args[0]
//String outputPath=args[1]
//String template = "./template"
String filePath ="C:/Users/cap/git/HellowWorld/Generator/input/sql.xml"
String template = "C:/Users/cap/git/HellowWorld/Generator/template"
String outputPath="C:/Users/cap/git/HellowWorld/Generator/dist"

def builder     = DocumentBuilderFactory.newInstance().newDocumentBuilder()
def dom     = builder.parse(filePath)
def xpath = XPathFactory.newInstance().newXPath()
def jdbcConfig = xpath.evaluate( '//jdbcConnection', dom, XPathConstants.NODE)
def connection = xpath.evaluate( '@connectionURL', jdbcConfig )
def user = xpath.evaluate( '@userId', jdbcConfig )
def pass = xpath.evaluate( '@password', jdbcConfig )
//println  "$user/pass@$connection"

def packageConfig = xpath.evaluate( '//package', dom, XPathConstants.NODE)
def packageMapper = xpath.evaluate( '@mapper', packageConfig )
def packageDao = xpath.evaluate( '@dao', packageConfig )

def packageModel = xpath.evaluate( '@model', packageConfig )


def packageService = xpath.evaluate( '@service', packageConfig )
def packageservice_interface = xpath.evaluate( '@service_interface', packageConfig )

def packageController = xpath.evaluate( '@controller', packageConfig )

def packageXml = xpath.evaluate( '@xml', packageConfig )
def packageParameter = xpath.evaluate( '@parameter',  packageConfig)
def packageResult = xpath.evaluate( '@result',  packageConfig)

def packagedao_test_resource = xpath.evaluate( '@dao_test_resource',  packageConfig)
def packageservice_test_resource = xpath.evaluate( '@service_test_resource',  packageConfig)
def packagecontroller_test_resource = xpath.evaluate( '@controller_test_resource',  packageConfig)



def packagedao_test = xpath.evaluate( '@dao_test',  packageConfig)
def packageservice_test = xpath.evaluate( '@service_test',  packageConfig)
def packagecontroller_test = xpath.evaluate( '@controller_test',  packageConfig)
def package_model = xpath.evaluate( '@json_model',  packageConfig)

 


//println  "packageMapper:$packageMapper packageXml:$packageXml packageParameter:$packageParameter packageResult:$packageResult"

Connection conn = null;
DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
conn = DriverManager.getConnection(connection, user, pass);

List<SqlModel> listSqlModel=new ArrayList<SqlModel>();

def nodes = xpath.evaluate( '//sql', dom, XPathConstants.NODESET )
nodes.each{
	SqlModel sqlModel=new SqlModel()
	listSqlModel.add(sqlModel)
	 sqlModel.name = xpath.evaluate( '@id', it )
	// def author = xpath.evaluate( 'author/text()', it )
	// println  "$id  has a $author"
	String sql  = xpath.evaluate( 'text/text()', it )
	sqlModel.sql=sql

	PreparedStatement stat = conn.prepareStatement(sql);
	result:{
		ResultSetMetaData resultSetMetaData = stat.getMetaData();

		int count = resultSetMetaData.getColumnCount();
		for (int i = 0; i < count; i++) {
			String typeName = resultSetMetaData.getColumnTypeName(i + 1);
			String name = resultSetMetaData.getColumnName(i + 1);
			String className = resultSetMetaData.getColumnClassName(i + 1);
			 className=StringUtil.removeJavaLang(className)
			String jdbcType = resultSetMetaData.getColumnTypeName(i + 1);
			if("VARCHAR2".equals(jdbcType))
			jdbcType="VARCHAR"
			if("NUMBER".equals(jdbcType))
			jdbcType="NUMERIC"
			
			//System.out.println(String.format("ResultSet[%s] colName:[%s] typeName:[%s] className:[%s]",i, StringUtil.toCamelCase( name), typeName, className));
			sqlModel.results.add(new IoItem(StringUtil.toCamelCase(name),className,jdbcType,resultSetMetaData.getColumnName(i + 1)))
		}

	}
	parameter:{

		ParameterMetaData pmd = stat.getParameterMetaData();
		int count = pmd.getParameterCount();
		for (int i = 0; i < count; i++) {
			String name = String.format("Param%s", i);// pmd.getParameterTypeName(i
			// + 1);
			String typeName = "String";// pmd.getParameterTypeName(i + 1);
			String className = "String";// pmd.getParameterClassName(i + 1);

			//System.out.println(String.format("ResultSet[%s] colName:[%s] typeName:[%s] className:[%s]",i, StringUtil.toCamelCase(name), typeName, className));
			sqlModel.params.add(new IoItem(StringUtil.toCamelCase(name),className,"",""))

		}
	}
	//override results
	override_results:{
	def results = xpath.evaluate( 'results/result', it, XPathConstants.NODESET )
	results.each {result->
 
		String name=xpath.evaluate( '@name', result )
		String type=xpath.evaluate( '@type', result )
		int index=Integer.parseInt(xpath.evaluate( '@index', result ))
		if(name!=null && !"".equals(name))
		sqlModel.results.get(index).setName(name)
		if(type!=null && !"".equals(type)){

			sqlModel.results.get(index).setType(type)
		}
		
		//println "$name $index $type " 
		
	}
	}

	override_paramters:{
		def results = xpath.evaluate( 'params/param', it, XPathConstants.NODESET )
		results.each {result->
	 
			String name=xpath.evaluate( '@name', result )
			String type=xpath.evaluate( '@type', result )
			int index=Integer.parseInt(xpath.evaluate( '@index', result ))
			if(name!=null && !"".equals(name))
			sqlModel.params.get(index).setName(name)
			if(type!=null && !"".equals(type))
			sqlModel.params.get(index).setType(type)
			
			//println "$name $index $type "
			
		}
	
	}
	for(item in sqlModel.params)
	sqlModel.sql=sqlModel.sql.replaceFirst("\\?",String.format("#{%s}",StringUtil.toLowerCaseInitial(item.name)))
	//TODO:merge same name
	List<IoItem> newParams=new ArrayList<IoItem>();
	List<String> names=new ArrayList<String>()
	for(IoItem checkItem:sqlModel.params){
		if(!names.contains(checkItem.name)){
			println "add $checkItem.name"
			names.add(checkItem.name)
			newParams.add(checkItem)
		}else{
			continue;
		}
	}
	sqlModel.params=newParams
	
}



for(sqlModel in listSqlModel){
	VelocityContext context = new VelocityContext();
	context.put("StringUtil" ,new StringUtil());
	context.put("sqlModel", sqlModel);
	
	context.put("packageMapper", packageMapper);
	context.put("packageDao", packageDao);
	context.put("packagedao_test", packagedao_test);
	context.put("packagedao_test_resource", packagedao_test_resource);
	
	context.put("packageXml", packageXml);
	context.put("packageParameter", packageParameter);
	context.put("packageResult", packageResult);
	context.put("packageservice_interface", packageservice_interface);
	context.put("packageService", packageService);
	context.put("packageController", packageController);
	
	context.put("packageservice_test", packageservice_test);
	context.put("packagecontroller_test", packagecontroller_test);

	
	context.put("packageservice_test_resource", packageservice_test_resource);
	context.put("packagecontroller_test_resource", packagecontroller_test_resource);
	context.put("package_model", package_model);
	
	
	
	new TemplateGenerator(template).generateFile(context, "sql/mapper.vm",outputPath+"/src/main/java/"+packageMapper.replaceAll("\\.", "/")+"/"+sqlModel.name+"Mapper.java")
	new TemplateGenerator(template).generateFile(context, "sql/dao.vm",outputPath+"/src/main/java/"+packageDao.replaceAll("\\.", "/")+"/"+sqlModel.name+"Dao.java")
	new TemplateGenerator(template).generateFile(context, "sql/xml.vm",outputPath+"/src/main/java/"+packageXml.replaceAll("\\.", "/")+"/"+sqlModel.name+"Mapper.xml")
	new TemplateGenerator(template).generateFile(context, "sql/param.vm",outputPath+"/src/main/java/"+packageParameter.replaceAll("\\.", "/")+"/"+sqlModel.name+"Condition.java")
	new TemplateGenerator(template).generateFile(context, "sql/result.vm",outputPath+"/src/main/java/"+packageResult.replaceAll("\\.", "/")+"/"+sqlModel.name+"Record.java")
	
	
	new TemplateGenerator(template).generateFile(context, "sql/service.vm",outputPath+"/src/main/java/"+packageService.replaceAll("\\.", "/")+"/"+sqlModel.name+"Service.java")
	new TemplateGenerator(template).generateFile(context, "sql/service_interface.vm",outputPath+"/src/main/java/"+packageservice_interface.replaceAll("\\.", "/")+"/"+sqlModel.name+"IService.java")
	
	new TemplateGenerator(template).generateFile(context, "sql/controller.vm",outputPath+"/src/main/java/"+packageController.replaceAll("\\.", "/")+"/"+sqlModel.name+"Controller.java")

	
	new TemplateGenerator(template).generateFile(context, "sql/param_json.vm",outputPath+"/src/main/java/"+package_model.replaceAll("\\.", "/")+"/"+sqlModel.name+"JsonCondition.java")
	new TemplateGenerator(template).generateFile(context, "sql/result_json.vm",outputPath+"/src/main/java/"+package_model.replaceAll("\\.", "/")+"/"+sqlModel.name+"JsonRecord.java")

	
	
	new TemplateGenerator(template).generateFile(context, "sql/dao_test.vm",outputPath+"/src/test/java/"+packagedao_test.replaceAll("\\.", "/")+"/"+sqlModel.name+"DaoTest.java")
	new TemplateGenerator(template).generateFile(context, "sql/dao_test_resource.vm",outputPath+"/src/test/resources/"+packagedao_test_resource.replaceAll("\\.", "/")+"/"+sqlModel.name+"DaoTest-context.xml")

	
	new TemplateGenerator(template).generateFile(context, "sql/service_test_resource.vm",outputPath+"/src/test/resources/"+packageservice_test_resource.replaceAll("\\.", "/")+"/"+sqlModel.name+"ServiceTest-context.xml")
	new TemplateGenerator(template).generateFile(context, "sql/controller_test_resource.vm",outputPath+"/src/test/resources/"+packagecontroller_test_resource.replaceAll("\\.", "/")+"/"+sqlModel.name+"ControllerTest-context.xml")
	
	
	new TemplateGenerator(template).generateFile(context, "sql/service_test.vm",outputPath+"/src/test/java/"+packageservice_test.replaceAll("\\.", "/")+"/"+sqlModel.name+"ServiceTest.java")
	new TemplateGenerator(template).generateFile(context, "sql/controller_test.vm",outputPath+"/src/test/java/"+packagecontroller_test.replaceAll("\\.", "/")+"/"+sqlModel.name+"ControllerTest.java")
	
}
