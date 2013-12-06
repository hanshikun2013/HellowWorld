package tool.model.mapping.common

import java.util.List;
import java.util.Map;

class TableModel {
	def String name
	def List<TableModelItem> items=new ArrayList<TableModelItem>()
	def Map<String,TableModelItem> key2Item=new HashMap<String,TableModelItem>()

	def List funcs=new ArrayList()
	
	public addItem(TableModelItem item){
		items.add(item)
		key2Item.put(item.getPhysicalName(), item)
	}
 
	public TableModelItem lookupByKey(String name){
		return key2Item.get(name)
	}
	
}
