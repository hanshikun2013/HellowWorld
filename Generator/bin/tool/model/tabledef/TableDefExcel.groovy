package tool.model.tabledef

import org.apache.poi.ss.usermodel.Sheet

import tool.common.ExcelUtility
import tool.model.common.BasicExcel
import tool.model.common.BasicSheet

class TableDefExcel extends BasicExcel {
	def DictSheet dictSheet;
	def List<TableSheet> tableSheets=new ArrayList<TableSheet>();
	public TableDefExcel(String path){
		super(path)
	}
	public BasicSheet loadSheet(Sheet sheet){
		if("Version Control".equals(sheet.getSheetName())
			|| "Data Classification".equals(sheet.getSheetName())
			||"テーブル一覧".equals(sheet.getSheetName())
			)
		{
			//return super.loadSheet(sheet)
			return null;
			
		}
		if(  "単語".equals(sheet.getSheetName())){
			dictSheet=new DictSheet(this);
			dictSheet.parse(sheet)
			return dictSheet;
		}else{
			TableSheet tableSheet=new TableSheet(this);
			tableSheets.add(tableSheet);
			tableSheet.parse(sheet)
			
			def cellValue=ExcelUtility.getStr(null,sheet.getRow(4).getCell(6))
			tableSheet.setTableName(cellValue)
			
			return tableSheet;
		}
	}
	
}
