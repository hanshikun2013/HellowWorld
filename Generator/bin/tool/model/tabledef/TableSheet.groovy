package tool.model.tabledef

import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet

import tool.common.ComUtility
import tool.model.common.BasicExcel;
import tool.model.common.BasicSheet

class TableSheet extends BasicSheet{
	
	def tableName;
 
	public TableSheet(BasicExcel excel){
		super(excel);
		 
	}
	void init(){
		startX=0;
		startY=6;
		TITLE_NAME=[
			"項番",
			"フィールド名称",
			"フィールド名",
			"属性",
			"桁数",
			"少数",
			"キー",
			"Null",
			"Unique",
			"INDEX",
			"IDENTITY",
			"備考"
		];
	}

	public parse(Sheet sheet){
		super.parse(sheet);
		dumpItems(items)
	}

}
