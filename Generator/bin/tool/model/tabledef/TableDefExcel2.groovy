package tool.model.tabledef

import org.apache.poi.ss.usermodel.Sheet

import tool.common.ExcelUtility
import tool.model.common.BasicExcel
import tool.model.common.BasicSheet

class TableDefExcel2 extends BasicExcel {
	def List<TableSheet2> tableSheets=new ArrayList<TableSheet2>();
	public TableDefExcel2(String path){
		super(path)
	}
	public BasicSheet loadSheet(Sheet sheet){
		if("表紙".equals(sheet.getSheetName())
			|| "改訂履歴".equals(sheet.getSheetName())
			||"テーブル定義書".equals(sheet.getSheetName())
			||"変更履歴".equals(sheet.getSheetName())
			||"単語".equals(sheet.getSheetName())
			||"単語辞書".equals(sheet.getSheetName())
			||"ドメイン".equals(sheet.getSheetName())
			||"テーブルスペース".equals(sheet.getSheetName())
			
			)
		{
			//return super.loadSheet(sheet)
			return null;
			
		}

			TableSheet2 tableSheet=new TableSheet2(this);
			tableSheets.add(tableSheet);
			tableSheet.parse(sheet)
			
			def cellValue=ExcelUtility.getStr(null,sheet.getRow(1).getCell(8))
			tableSheet.setTableName(cellValue)
			tableSheet.setTableNamePhyiscal(ExcelUtility.getStr(null,sheet.getRow(1).getCell(15)))
			
			return tableSheet;
	}
	
}
