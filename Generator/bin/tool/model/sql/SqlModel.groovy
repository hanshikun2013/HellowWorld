package tool.model.sql

class SqlModel {
	def String name
	def String sql
	def List<IoItem> params=new ArrayList<IoItem>()
	def List<IoItem> results=new ArrayList<IoItem>()
	 
}
