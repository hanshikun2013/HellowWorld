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
String path ="C:/Users/cap/git/HellowWorld/Generator/input/datamodel2tablemodel/法人統合_テーブル←データモデルマッピング_no_formula.xlsx"

String outputPath="C:/Users/cap/git/HellowWorld/Generator/dist"
String template = "C:/Users/cap/git/HellowWorld/Generator/template"

String tableModelPackage="sample.table.entity.gen"
String dataModelPackage="sample.table.datamodel.gen"
String copierPackage="sample.table.copier.gen"

Config.namingMap.put("共通部_T_CORP_PLAN_FAMILY", "method1")
Config.namingMap.put("共通部_T_CORP_PFAMLY_NENKIN_DET", "method2")
Config.namingMap.put("経営者リスク分析_T_CORP_KIHON_INFO", "method3")
Config.namingMap.put("経営者リスク分析_T_CORP_KEIEISHA_RBUNSEKI", "method4")
Config.namingMap.put("役員退職慰労金試算_T_CORP_KIHON_INFO", "method5")
Config.namingMap.put("キャッシュフロー改善試算_T_CORP_KIHON_INFO", "method6")
Config.namingMap.put("キャッシュフロー改善試算_T_CORP_CASHF_KAIZE", "method7")
Config.namingMap.put("退職金＋キャッシュフロー改善試算_T_CORP_KIHON_INFO", "method8")


Data2TableExcel excel=new Data2TableExcel(path);
excel.load()

VelocityContext context = new VelocityContext();
context.put("mappingModel", excel.table2DataSheet.mappingModel);
context.put("tableModelPackage", tableModelPackage);
context.put("dataModelPackage", dataModelPackage);
context.put("copierPackage", copierPackage);
context.put("StringUtil", new StringUtil());

new TemplateGenerator(template).generateFile(context, "mapping/table2Data.vm",outputPath+"/mapping/table2data/"+"classlist.txt")

for(tableModel in excel.table2DataSheet.mappingModel.tableModels){
	context.put("tableModel", tableModel);
	new TemplateGenerator(template).generateFile(context, "mapping/tableModel.vm",outputPath+"/src/main/java/"+tableModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toCamelCase(tableModel.name)+".java")
}
for(dataModel in excel.table2DataSheet.mappingModel.dataModels){
	context.put("dataModel", dataModel);
	new TemplateGenerator(template).generateFile(context, "mapping/dataModel.vm",outputPath+"/src/main/java/"+dataModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toUpperCaseInitial(dataModel.name)+".java")
}
new TemplateGenerator(template).generateFile(context, "mapping/data2TableCopier.vm",outputPath+"/src/main/java/"+copierPackage.replaceAll("\\.", "/")+"/"+"Datamodel2TableCopier.java")

