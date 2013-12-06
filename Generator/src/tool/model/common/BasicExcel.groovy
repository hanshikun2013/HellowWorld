package tool.model.common

import org.apache.poi.ss.usermodel.FormulaEvaluator
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import tool.model.mapping.common.MappingModel;

class BasicExcel {
	def XSSFWorkbook book
	def String path;
	def FormulaEvaluator evaluator
	def List<BasicSheet> sheets=new ArrayList<BasicSheet>();
	def Map<String,BasicSheet> name2Sheets=new HashMap<String,BasicSheet>()

	public BasicExcel(String path){
		this.path=path
	}
	public load(){
		FileInputStream fi = new FileInputStream(path);
		book = new XSSFWorkbook(fi);
		evaluator = book.getCreationHelper().createFormulaEvaluator();
		//evaluator.evaluateAll();
		fi.close();

		for (Sheet sheet : book) {
			BasicSheet basicSheet=loadSheet(sheet)
			sheets.add(basicSheet)
			name2Sheets.put(sheet.getSheetName(), sheet);
		}
	}
	public BasicSheet loadSheet(Sheet sheet){

		BasicSheet parsedSheet=new BasicSheet(this);

		parsedSheet.parse(sheet)
		return parsedSheet;
	}
}
