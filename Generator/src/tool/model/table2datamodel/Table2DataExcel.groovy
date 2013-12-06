package tool.model.table2datamodel

import org.apache.poi.ss.usermodel.Sheet;

import tool.model.common.BasicExcel
import tool.model.common.BasicSheet;

class Table2DataExcel extends BasicExcel {
	def Table2DataSheet table2DataSheet
	public Table2DataExcel(String path){
		super(path)
	}
	public BasicSheet loadSheet(Sheet sheet){
		if(sheet.getSheetName().contains("マッピング")){
			table2DataSheet=new Table2DataSheet(this);
			table2DataSheet.parse(sheet)
			return table2DataSheet;
		}else{
			return super.loadSheet(sheet)
		}
		
	}
}
