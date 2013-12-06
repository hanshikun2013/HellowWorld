package tool.model.datamodel2table

import org.apache.poi.ss.usermodel.Sheet;

import tool.model.common.BasicExcel
import tool.model.common.BasicSheet;

class Data2TableExcel extends BasicExcel {
	def Data2TableSheet table2DataSheet
	public Data2TableExcel(String path){
		super(path)
	}
	public BasicSheet loadSheet(Sheet sheet){
		if(sheet.getSheetName().contains("マッピング")){
			table2DataSheet=new Data2TableSheet(this);
			table2DataSheet.parse(sheet)
			return table2DataSheet;
		}else{
			//return super.loadSheet(sheet)
		return null;
		}
		
	}
}
