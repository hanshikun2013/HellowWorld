package tool.model.mapping.common

import java.util.List;
import java.util.Map;

class DataModel {
	def String name
	def List<DataModelItem> items=new ArrayList<DataModelItem>()
	def Map<String,DataModelItem> key2Item=new HashMap<String,DataModelItem>()

	public addItem(DataModelItem item){
		items.add(item)
		key2Item.put(item.getKey(), item)
	}
 
	public lookupByAttr(String name){
		return key2Item.get(name)
	}

}
