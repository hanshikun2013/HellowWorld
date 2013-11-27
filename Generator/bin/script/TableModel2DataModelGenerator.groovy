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
String path ="C:/Users/cap/git/HellowWorld/Generator/input/tablemodel2datamodel/法人統合_データモデル←テーブルマッピング.xlsx"

String outputPath="C:/Users/cap/git/HellowWorld/Generator/dist"
String template = "C:/Users/cap/git/HellowWorld/Generator/template"

String tableModelPackage="sample2.table.entity.gen"
String dataModelPackage="sample2.table.datamodel.gen"
String copierPackage="sample2.table.copier.gen"


Config.namingMap.put("共通部_PlanFamily", "共通部_PlanFamily")
Config.namingMap.put("共通部_LtPension", "共通部_LtPension")
Config.namingMap.put("経営者リスク分析_lbsc0009", "経営者リスク分析_lbsc0009")
Config.namingMap.put("経営者リスク分析_lbsc0008", "経営者リスク分析_lbsc0008")
Config.namingMap.put("経営者リスク分析_lbsc0002", "経営者リスク分析_lbsc0002")
Config.namingMap.put("役員退職慰労金試算_lbsc0010", "役員退職慰労金試算_lbsc0010")
Config.namingMap.put("役員退職慰労金試算_lbsc0003", "役員退職慰労金試算_lbsc0003")
Config.namingMap.put("役員退職慰労金試算_lbsc0004", "役員退職慰労金試算_lbsc0004")
Config.namingMap.put("キャッシュフロー改善試算_lbsc00011", "キャッシュフロー改善試算_lbsc00011")
Config.namingMap.put("キャッシュフロー改善試算_lbsc00005", "キャッシュフロー改善試算_lbsc00005")
Config.namingMap.put("キャッシュフロー改善試算_lbsc00006", "キャッシュフロー改善試算_lbsc00006")
Config.namingMap.put("役員退職慰労金試算キャッシュフロー改善試算_lbsc00013", "役員退職慰労金試算キャッシュフロー改善試算_lbsc00013")


Table2DataExcel excel=new Table2DataExcel(path);
excel.load()

VelocityContext context = new VelocityContext();
context.put("mappingModel", excel.table2DataSheet.mappingModel);
context.put("tableModelPackage", tableModelPackage);
context.put("dataModelPackage", dataModelPackage);
context.put("copierPackage", copierPackage);
context.put("StringUtil", new StringUtil());

new TemplateGenerator(template).generateFile(context, "mapping/table2Data.vm",outputPath+"/mapping/data2table/"+"classlist.txt")

for(tableModel in excel.table2DataSheet.mappingModel.tableModels){
	context.put("tableModel", tableModel);
	new TemplateGenerator(template).generateFile(context, "mapping/tableModel.vm",outputPath+"/src/main/java/"+tableModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toCamelCase(tableModel.name)+".java")
}
for(dataModel in excel.table2DataSheet.mappingModel.dataModels){
	context.put("dataModel", dataModel);
	new TemplateGenerator(template).generateFile(context, "mapping/dataModel.vm",outputPath+"/src/main/java/"+dataModelPackage.replaceAll("\\.", "/")+"/"+StringUtil.toUpperCaseInitial(dataModel.name)+".java")
}
new TemplateGenerator(template).generateFile(context, "mapping/table2DataCopier.vm",outputPath+"/src/main/java/"+copierPackage.replaceAll("\\.", "/")+"/"+"Table2DatamodelCopier.java")

