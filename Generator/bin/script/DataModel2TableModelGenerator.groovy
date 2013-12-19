package script;
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*
import org.apache.velocity.VelocityContext

import tool.common.Config
import tool.common.StringUtil
import tool.common.TemplateGenerator
import tool.model.datamodel2table.Data2TableExcel


//String path =args[0]
//String outputPath=args[1]
//String template = "./template"
//String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/法人統合_テーブル←データモデルマッピング.xlsx"
//Config.namingMap.put("共通部_T_CORP_PLAN_FAMILY", "method1")
//Config.namingMap.put("共通部_T_CORP_PFAMLY_NENKIN_DET", "method2")
//Config.namingMap.put("経営者リスク分析_T_CORP_KIHON_INFO", "method3")
//Config.namingMap.put("経営者リスク分析_T_CORP_KEIEISHA_RBUNSEKI", "method4")
//Config.namingMap.put("役員退職慰労金試算_T_CORP_KIHON_INFO", "method5")
//Config.namingMap.put("キャッシュフロー改善試算_T_CORP_KIHON_INFO", "method6")
//Config.namingMap.put("キャッシュフロー改善試算_T_CORP_CASHF_KAIZE", "method7")
//Config.namingMap.put("退職金＋キャッシュフロー改善試算_T_CORP_KIHON_INFO", "method8")

//LRMS_相続:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/LRMS_相続_テーブル←データモデルマッピング.xlsx"
//	gen( path, "souzoku")
//}
//LRMS_共通:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/LRMS_共通_テーブル←データモデルマッピング.xlsx"
//	gen( path, "kyotsu")
//}
//LRMS_介護:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/LRMS_介護_テーブル←データモデルマッピング.xlsx"
//	gen( path,"kaigo")
//}

//LRMS_セカンドライフ:{
//	String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/LRMS_セカンドライフ_テーブル←データモデルマッピング.xlsx"
//	gen( path,"secondlife")
//}


LRMS_死亡:{
	String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/LRMS_死亡_テーブル←データモデルマッピング.xlsx"
	gen( path,"shibohosyou")
}

LRMS_医療:{
	String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/LRMS_医療_テーブル←データモデルマッピング.xlsx"
	gen( path,"iryou")
}

public static  gen(String path,String base ) {
	 String tableModelPackage=String.format("temp.d2t.%s.entity.gen",base)
	 String dataModelPackage=String.format("temp.d2t.%s.datamodel.gen",base)
	 //String tableModelPackage=String.format("jp.co.axa.life.app.lt.model.autogen",base)
	 //String dataModelPackage=String.format("jp.co.axa.life.app.lt.common.domain",base)
	 
	 String copierPackage=String.format("temp.d2t.%s.copier.gen",base)
	 
	String datamodel2TableCopierName="Datamodel2TableCopier"
	String outputPath="C:/Users/cap/git/HellowWorld/Generator/dist"
	String template = "C:/Users/cap/git/HellowWorld/Generator/template"
	Data2TableExcel excel=new Data2TableExcel(path);
	excel.load()

	VelocityContext context = new VelocityContext();
	context.put("mappingModel", excel.table2DataSheet.mappingModel);
	context.put("tableModelPackage", tableModelPackage);
	context.put("dataModelPackage", dataModelPackage);
	context.put("copierPackage", copierPackage);
	context.put("StringUtil", new StringUtil());

	context.put("datamodel2TableCopierName", datamodel2TableCopierName);

	new TemplateGenerator(template).generateFile(context, "mapping/table2Data.vm",outputPath+"/list/d2t/"+base+"/list.txt")

	for(tableModel in excel.table2DataSheet.mappingModel.tableModels){
		context.put("tableModel", tableModel);
		new TemplateGenerator(template).generateFile(context, "mapping/tableModel.vm",outputPath+"/src/main/java/"+tableModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toCamelCase(tableModel.name)+".java")
	}
	for(dataModel in excel.table2DataSheet.mappingModel.dataModels){
		context.put("dataModel", dataModel);
		new TemplateGenerator(template).generateFile(context, "mapping/dataModel.vm",outputPath+"/src/main/java/"+dataModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toUpperCaseInitial(dataModel.name)+".java")
	}
	new TemplateGenerator(template).generateFile(context, "mapping/data2TableCopier.vm",outputPath+"/src/main/java/"+copierPackage.replaceAll("\\.", "/")+"/"+datamodel2TableCopierName+".java")
	new TemplateGenerator(template).generateFile(context, "mapping/data2TableCopierTest.vm",outputPath+"/src/test/java/"+copierPackage.replaceAll("\\.", "/")+"/"+datamodel2TableCopierName+"Test.java")
	
	//new TemplateGenerator(template).generateFile(context, "mapping/dataModelRoot.vm",outputPath+"/src/main/java/"+dataModelPackage.replaceAll("\\.", "/")+"/"+"DataModelRoot.java")
}
