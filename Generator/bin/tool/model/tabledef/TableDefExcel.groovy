package tool.model.tabledef

import org.apache.poi.ss.usermodel.Sheet;

import tool.model.common.BasicExcel
import tool.model.common.BasicSheet;

class TableDefExcel extends BasicExcel {
	def DictSheet dictSheet;
	public TableDefExcel(String path){
		super(path)
	}
	public BasicSheet loadSheet(Sheet sheet){
		def name="単語"
		if(  name.equals(sheet.getSheetName())){
			dictSheet=new DictSheet(this);
			dictSheet.parse(sheet)
			return dictSheet;
		}else{
			return super.loadSheet(sheet)
		}
	}
	
}
