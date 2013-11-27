package tool.model.mapping.common

import tool.common.ComUtility
import tool.common.StringUtil

class MappingModel {

	def List<DataModel> dataModels=new ArrayList<DataModel>()
	def List<TableModel> tableModels=new ArrayList<TableModel>()
	def Map<String,DataModel> key2DataModel=new HashMap<String,DataModel>()
	def Map<String,TableModel> key2TableModel=new HashMap<String,TableModel>()
	def Map<String,FuncModel> key2FuncModel=new HashMap<String,FuncModel>()

	def List<FuncModel> funcs=new ArrayList<FuncModel>()

	public addFuncModel(FuncModel funcModel){
		funcs.add(funcModel)
		key2FuncModel.put(funcModel.getName(), funcModel)
	}

	public addDataModel(DataModel dataModel){
		dataModels.add(dataModel)
		key2DataModel.put(dataModel.getName(), dataModel)
	}
	public addTableModel(TableModel tableModel){
		tableModels.add(tableModel)
		key2TableModel.put(tableModel.getName(), tableModel)
	}

	public DataModel lookupDataModel(String name){
		return key2DataModel.get(name)
	}
	public TableModel lookupTableModel(String name){
		return key2TableModel.get(name)
	}

	public FuncModel lookupFuncModel(String name){
		return key2FuncModel.get(name)
	}

	public List<String> getTableModelList(){
		List<String> checkList=new ArrayList<String>()
		for(FuncModel funcModel:funcs){

			for(FuncGroupModel group:funcModel.items){
				for(Map item:group.items){
					String tempName=item.get("テーブル.テーブル(物理/論理)")
					tempName=StringUtil.toUpperCaseInitial(tempName)
					if(ComUtility.isIdentifier(tempName)){
						if(!checkList.contains(tempName)){
							checkList.add(tempName)
						}
					}
				}
			}
		}
		return checkList;
	}
	
	public List<String> getDataModelList(){
		List<String> checkList=new ArrayList<String>()
		for(FuncModel funcModel:funcs){

			for(FuncGroupModel group:funcModel.items){
				for(Map item:group.items){
					String tempName=item.get("画面データモデル.モデルID/概要")
					tempName=StringUtil.toUpperCaseInitial(tempName)
					if(ComUtility.isIdentifier(tempName)){
						if(!checkList.contains(tempName)){
							checkList.add(tempName)
						}
					}
				}
			}
		}
		return checkList;
	}
}
