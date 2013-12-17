package script;
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*
import org.apache.velocity.VelocityContext

import tool.common.Config
import tool.common.StringUtil
import tool.common.TemplateGenerator

import org.apache.velocity.VelocityContext


import tool.common.Config
import tool.common.StringUtil
import tool.common.TemplateGenerator
import tool.model.table2datamodel.Table2DataExcel


//String path =args[0]
//String outputPath=args[1]
//String template = "./template"
//Config.namingMap.put("共通部_PlanFamily", "共通部_PlanFamily")
//Config.namingMap.put("共通部_LtPension", "共通部_LtPension")
//Config.namingMap.put("経営者リスク分析_lbsc0009", "経営者リスク分析_lbsc0009")
//Config.namingMap.put("経営者リスク分析_lbsc0008", "経営者リスク分析_lbsc0008")
//Config.namingMap.put("経営者リスク分析_lbsc0002", "経営者リスク分析_lbsc0002")
//Config.namingMap.put("役員退職慰労金試算_lbsc0010", "役員退職慰労金試算_lbsc0010")
//Config.namingMap.put("役員退職慰労金試算_lbsc0003", "役員退職慰労金試算_lbsc0003")
//Config.namingMap.put("役員退職慰労金試算_lbsc0004", "役員退職慰労金試算_lbsc0004")
//Config.namingMap.put("キャッシュフロー改善試算_lbsc00011", "キャッシュフロー改善試算_lbsc00011")
//Config.namingMap.put("キャッシュフロー改善試算_lbsc00005", "キャッシュフロー改善試算_lbsc00005")
//Config.namingMap.put("キャッシュフロー改善試算_lbsc00006", "キャッシュフロー改善試算_lbsc00006")
//Config.namingMap.put("役員退職慰労金試算キャッシュフロー改善試算_lbsc00013", "役員退職慰労金試算キャッシュフロー改善試算_lbsc00013")



//LRMS_相続:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/tablemodel2datamodel/LRMS_相続_データモデル←テーブルマッピング.xlsx"
//	
//	gen( path, "souzoku" )
//}
//LRMS_共通:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/tablemodel2datamodel/LRMS_共通_データモデル←テーブルマッピング.xlsx"
//	gen( path, "kyotsu"   )
//}
//LRMS_介護:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/tablemodel2datamodel/LRMS_介護_データモデル←テーブルマッピング.xlsx"
//	gen( path, "kaigo"  )
//}

LRMS_セカンドライフ:{
	String path ="C:/Users/cap/git/HellowWorld/Generator/input/tablemodel2datamodel/LRMS_セカンドライフ_データモデル←テーブルマッピング.xlsx"
	gen( path, "secondlife"  )
}



public static  gen(String path,String base ) {
	 String tableModelPackage=String.format("temp.t2d.%s.entity.gen",base)
	 String dataModelPackage=String.format("temp.t2d.%s.datamodel.gen",base)
	 String copierPackage=String.format("temp.t2d.%s.copier.gen",base)
	 
	 
//	 String tableModelPackage=String.format("jp.co.axa.life.app.lt.model.autogen",base)
//	 String dataModelPackage=String.format("jp.co.axa.life.app.lt.common.domain",base)

 	
	String table2DatamodelCopierName="Table2DatamodelCopier"
	String outputPath="C:/Users/cap/git/HellowWorld/Generator/dist"
	String template = "C:/Users/cap/git/HellowWorld/Generator/template"
	Table2DataExcel excel=new Table2DataExcel(path);
	excel.load()

	VelocityContext context = new VelocityContext();
	context.put("mappingModel", excel.table2DataSheet.mappingModel);
	context.put("tableModelPackage", tableModelPackage);
	context.put("dataModelPackage", dataModelPackage);
	context.put("copierPackage", copierPackage);
	context.put("StringUtil", new StringUtil());
	context.put("table2DatamodelCopierName", table2DatamodelCopierName);

	new TemplateGenerator(template).generateFile(context, "mapping/table2Data.vm",outputPath+"/list/t2d/"+base+"/list.txt")
	
	for(tableModel in excel.table2DataSheet.mappingModel.tableModels){
		context.put("tableModel", tableModel);
		new TemplateGenerator(template).generateFile(context, "mapping/tableModel.vm",outputPath+"/src/main/java/"+tableModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toCamelCase(tableModel.name)+".java")
	}
	for(dataModel in excel.table2DataSheet.mappingModel.dataModels){
		context.put("dataModel", dataModel);
		new TemplateGenerator(template).generateFile(context, "mapping/dataModel.vm",outputPath+"/src/main/java/"+dataModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toUpperCaseInitial(dataModel.name)+".java")
	}
	new TemplateGenerator(template).generateFile(context, "mapping/table2DataCopier.vm",outputPath+"/src/main/java/"+copierPackage.replaceAll("\\.", "/")+"/"+table2DatamodelCopierName+".java")
	new TemplateGenerator(template).generateFile(context, "mapping/table2DataCopierTest.vm",outputPath+"/src/test/java/"+copierPackage.replaceAll("\\.", "/")+"/"+table2DatamodelCopierName+"Test.java")
	
	//new TemplateGenerator(template).generateFile(context, "mapping/dataModelRoot.vm",outputPath+"/src/main/java/"+dataModelPackage.replaceAll("\\.", "/")+"/"+"DataModelRoot.java")
}
