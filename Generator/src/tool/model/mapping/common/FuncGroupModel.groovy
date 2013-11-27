package tool.model.mapping.common

import tool.common.ComUtility
import tool.common.StringUtil

class FuncGroupModel {
	def String name
	def List<Map> items=new ArrayList<Map>()
	 
	public addItem(Map item){
		items.add(item)
		
	}
 	public List<String> getDataModelList(){
		 List<String> checkList=new ArrayList<String>()
		 for(Map item:items){
			 String tempName=item.get("画面データモデル.モデルID/概要")
			 tempName=StringUtil.toUpperCaseInitial(tempName)
			 if(ComUtility.isIdentifier(tempName)){
				 if(!checkList.contains(tempName)){
					 checkList.add(tempName)
				 }
			 }
				 
		 }
		 return checkList;
	 }
	 public List<String> getTableModelList(){
		 List<String> checkList=new ArrayList<String>()
		 for(Map item:items){
			 String tempName=item.get("テーブル.テーブル(物理/論理)")
			 tempName=StringUtil.toPascalCase(tempName)
			 if(ComUtility.isIdentifier(tempName)){
				 if(!checkList.contains(tempName)){
					 checkList.add(tempName)
				 }
			 }
				 
		 }
		 return checkList;
	 }
}
