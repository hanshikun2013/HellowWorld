package script;
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*
import org.apache.velocity.VelocityContext

import tool.common.TemplateGenerator
import tool.model.SampleModel
import tool.model.table2datamodel.Table2DataExcel


//String path =args[0]
//String outputPath=args[1]
//String template = "./template"
String path ="C:/workspaceSSS/workspace/Generator/input/tablemodel2datamodel/法人統合_データモデル←テーブルマッピング.xlsx"
String outputPath="C:/workspaceSSS/workspace/Generator/dist"
String template = "C:/workspaceSSS/workspace/Generator/template"


Table2DataExcel excel=new Table2DataExcel(path);
excel.load()
SampleModel msg = new SampleModel("  ", 100, 1000);
VelocityContext context = new VelocityContext();
context.put("msgObj", msg);

new TemplateGenerator(template).generateFile(context, "t1/sample1.vm",outputPath+"/test/test2/"+"file.txt")
