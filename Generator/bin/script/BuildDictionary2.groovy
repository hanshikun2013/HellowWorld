package script;
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*
import org.apache.velocity.VelocityContext

import tool.common.StringUtil
import tool.common.TemplateGenerator
import tool.model.tabledef.TableDefExcel2


//String path =args[0]
//String outputPath=args[1]
//String template = "./template"
String path ="C:/Users/cap/git/HellowWorld/Generator/input/tabledef/LNAS_テーブル定義書.xlsx"
String outputPath="C:/Users/cap/Desktop/working"
String template = "C:/Users/cap/git/HellowWorld/Generator/template"


TableDefExcel2 excel=new TableDefExcel2(path);
excel.load()

VelocityContext context = new VelocityContext();
context.put("excel", excel);
context.put("StringUtil", new StringUtil());

new TemplateGenerator(template).generateFile(context, "table/ddl2.vm",outputPath+"/report.sql")
