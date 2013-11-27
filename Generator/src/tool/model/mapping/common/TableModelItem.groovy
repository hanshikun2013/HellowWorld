package tool.model.mapping.common

class TableModelItem {

	
	
	//テーブル.テーブル(物理/論理)   
	def String tableName;
	
	//テーブル.項目名(論理)   
	def String logicalName;
	//テーブル.項目名(物理)   
	def String physicalName;
	//テーブル.属性   
	def String attr;
	//テーブル.桁数   
	def String numberDigits;
	//テーブル.少数   
	def String numberPoints;
	//テーブル.備考
	def String remark;
	
	def String classType="String" //TODO
	
}
