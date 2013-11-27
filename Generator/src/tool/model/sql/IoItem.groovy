package tool.model.sql

class IoItem {
	 def String name;
	 def String type;
	 def String jdbcType;
	 def String column;
	 
	public IoItem(String name,String type,String jdbcType,String column) {
		this.name = name;
		this.type = type;
		this.jdbcType = jdbcType;
		this.column = column;
		
	}
}
