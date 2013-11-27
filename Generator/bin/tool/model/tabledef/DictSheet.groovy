package tool.model.tabledef

import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet

import tool.common.ComUtility
import tool.model.common.BasicExcel;
import tool.model.common.BasicSheet

class DictSheet extends BasicSheet{
	
 
	public DictSheet(BasicExcel excel){
		super(excel);
		 
	}
	void init(){
		startX=0;
		startY=1;
		TITLE_NAME=[
			"名称",
			"テーブル・カラム名",
			"ドメイン",
			"型",
			"桁数①",
			"桁数②",
			"単語①",
			"単語②",
			"単語③",
			"単語④",
			"単語⑤",
			"単語⑥",
			"名称①",
			"Blank1",
			"名称②",
			"Blank2",
			"名称③",
			"Blank3",
			"名称④",
			"Blank4",
			"名称⑤",
			"Blank5",
			"名称⑥",
			"文字数",
		];
	}

	public parse(Sheet sheet){
		super.parse(sheet);
		dumpItems(items)
	}
	boolean ignoreItem(HashMap item ){
		return "".equals(item.get("名称"))&&"".equals(item.get("テーブル・カラム名"))
	}
}
