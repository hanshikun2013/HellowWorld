package tool.model.tabledef

import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet

import tool.common.ComUtility
import tool.model.common.BasicExcel;
import tool.model.common.BasicSheet

class TableSheet2 extends BasicSheet{
	
	def tableName;
	def tableNamePhyiscal;
	
	public TableSheet2(BasicExcel excel){
		super(excel);
		 
	}
	void init(){
		startX=0;
		startY=4;
		TITLE_NAME=[
			"No",
			"項目名（論理）",
			"",
			"",
			"",
			"",
			"項目名（物理）",
			"",
			"",
			"",
			"属性",
		];
	}

	public parse(Sheet sheet){
		super.parse(sheet);
		dumpItems(items)
	}

}
