package tool.model.dictmodel

class DictItem {
	 def String name;
	 def String type;
	 def String jdbcType;
	 def String column;
	 
	public DictItem(String name,String type,String jdbcType,String column) {
		this.name = name;
		this.type = type;
		this.jdbcType = jdbcType;
		this.column = column;
		
	}
}
