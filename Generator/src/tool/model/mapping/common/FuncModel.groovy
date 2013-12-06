package tool.model.mapping.common

import tool.common.ComUtility
import tool.common.StringUtil


class FuncModel {
	def String name
	def List<FuncGroupModel> items=new ArrayList<FuncGroupModel>()
	def Map<String,FuncGroupModel> key2Item=new HashMap<String,FuncGroupModel>()

	public addItem(String name,FuncGroupModel item){
		items.add(item)
		key2Item.put(name, item)
	}
 
	public lookupByName(String name){
		return key2Item.get(name)
	}
	public List<String> getDataModelList(){
		List<String> checkList=new ArrayList<String>()
		for(FuncGroupModel group:items){
		for(Map item:group.items){
			String tempName=item.get("画面データモデル.モデルID/概要")+"Collection"
			tempName=StringUtil.toUpperCaseInitial(tempName)
			if(ComUtility.isIdentifier(tempName)){
				if(!checkList.contains(tempName)){
					checkList.add(tempName)
				}
			}
				
		}
		}
		return checkList;
	}
}
