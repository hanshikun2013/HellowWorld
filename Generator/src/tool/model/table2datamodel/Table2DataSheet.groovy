

package tool.model.table2datamodel

import org.apache.poi.ss.usermodel.Sheet

import tool.common.ComUtility
import tool.model.common.BasicExcel
import tool.model.common.BasicSheet
import tool.model.mapping.common.DataModel
import tool.model.mapping.common.DataModelItem
import tool.model.mapping.common.FuncGroupModel
import tool.model.mapping.common.FuncModel
import tool.model.mapping.common.MappingModel
import tool.model.mapping.common.TableModel
import tool.model.mapping.common.TableModelItem

class Table2DataSheet extends BasicSheet{
	def MappingModel mappingModel ;

	public Table2DataSheet(BasicExcel excel){
		super(excel);
	}
	void init(){
		startX=0;
		startY=3;
		TITLE_NAME=[
			"機能",
			"画面データモデル.モデルID/概要",
			"画面データモデル.入力",
			"画面データモデル.key名",
			"画面データモデル.型",
			"画面データモデル.備考",
			"テーブル.テーブル(物理/論理)" ,
			"テーブル.項目名(論理)",
			"テーブル.項目名(物理)",
			"テーブル.属性",
			"テーブル.桁数",
			"テーブル.少数",
			"テーブル.備考"
			];
	}

	public parse(Sheet sheet){
		super.parse(sheet);
		List<HashMap> items2=new ArrayList<HashMap>();
		//filer out no mapping item
		for(HashMap item:items){
			if(skip( item)){
				continue;
			}else{
				items2.add(item)
			}
		}
		//copy 機能

		String temp1="";
		for(HashMap item:items2){
			if("".equals(item.get("機能"))){
				item.put("機能",temp1)
			}else{
				temp1=item.get("機能")
			}
		}

		
		String temp2="";
		for(HashMap item:items2){
			if("".equals(item.get("画面データモデル.モデルID/概要"))
			||!ComUtility.isIdentifier(item.get("画面データモデル.モデルID/概要"))
			){
				item.put("画面データモデル.モデルID/概要",temp2)
			}else{
				temp2=item.get("画面データモデル.モデルID/概要")
			}
		}
//		//fix テーブル(物理/論理)
//		String temp3="";
//		for(HashMap item:items2){
//			if( skipTable( item)){
//				//Nothing todo
//			}
//			else{
//				if("".equals(item.get("テーブル.備考"))
//				||!ComUtility.isIdentifier(item.get("テーブル.備考"))){
//					item.put("テーブル.備考",temp3)
//				}else{
//					temp3=item.get("テーブル.備考")
//					//System.out.println ("テーブル.備考"+item.get("テーブル.備考"))
//				}
//			}
//
//		}
		//dumpItems(items2)
		//fix テーブル(物理/論理)
		String temp4="";
		for(HashMap item:items2){
			if( skipTableColLogical( item)){
				//Nothing todo
			}
			else{
				if("".equals(item.get("テーブル.テーブル(物理/論理)"))
				||!ComUtility.isIdentifier(item.get("テーブル.テーブル(物理/論理)"))){
					item.put("テーブル.テーブル(物理/論理)",temp4)
				}else{
					temp4=item.get("テーブル.テーブル(物理/論理)")
					//System.out.println ("テーブル.備考"+item.get("テーブル.備考"))
				}
			}

		}
		dumpItems(items2)
		mappingModel=buildMappingMode( items2)
 
	}
	
	
	
	MappingModel buildMappingMode(List<HashMap> items){
	 
		MappingModel mappingModel=new MappingModel();
		//build TableModels
		for(HashMap item:items){
			//lookup TableModel
			
			if("".equals(item.get("テーブル.テーブル(物理/論理)"))
			||!ComUtility.isIdentifier(item.get("テーブル.テーブル(物理/論理)"))){
				//skip
			}else{
				String modelId=item.get("テーブル.テーブル(物理/論理)")
				TableModel tableModel=mappingModel.lookupTableModel(modelId)
				if(tableModel==null){
					tableModel=new TableModel();
					tableModel.setName(modelId)
					mappingModel.addTableModel(tableModel)
				}
	
				//lookup TableModel item
				String key=item.get("テーブル.項目名(物理)")
				TableModelItem tableModelItem=tableModel.lookupByKey(key)
				if(tableModelItem==null){
					tableModelItem=new TableModelItem();
					tableModelItem.setPhysicalName(item.get("テーブル.項目名(物理)"))
					tableModel.addItem(tableModelItem)
					//copy attributes
					//item.get("テーブル.テーブル(物理/論理)")
					
					tableModelItem.setTableName(item.get("テーブル.テーブル(物理/論理)"))
					tableModelItem.setLogicalName(item.get("テーブル.項目名(論理)"))
					tableModelItem.setAttr(item.get("テーブル.属性"))
					tableModelItem.setNumberDigits(item.get("テーブル.桁数"))
					tableModelItem.setNumberPoints(item.get("テーブル.少数"))
					tableModelItem.setRemark(item.get("テーブル.備考"))
				}else{
					//Nothing tod if duplicated
				}
			}
			if("".equals(item.get("画面データモデル.モデルID/概要"))
			||!ComUtility.isIdentifier(item.get("画面データモデル.モデルID/概要"))){
				//skip
			}else{

				//lookup DataModel
				String colLogical=item.get("画面データモデル.モデルID/概要")

				DataModel dataModel=mappingModel.lookupDataModel(colLogical)
				if(dataModel==null){
					dataModel=new DataModel();
					dataModel.setName(colLogical)
					mappingModel.addDataModel(dataModel)
				}
				//lookup DataModel item
				String attr=item.get("画面データモデル.key名")
				DataModelItem dataModelItem=dataModel.lookupByAttr(attr)
				if(dataModelItem==null){
					dataModelItem=new DataModelItem();
					dataModelItem.setKey(attr)
					dataModel.addItem(dataModelItem)
					//copy attributes

					dataModelItem.setName(item.get("テーブル.備考"))
					dataModelItem.setModelId(item.get("画面データモデル.モデルID/概要"))
					dataModelItem.setInput(item.get("画面データモデル.入力"))
					//dataModelItem.setAttr(item.get("画面データモデル.key名"))
					dataModelItem.setDataType(item.get("画面データモデル.型"))
					dataModelItem.setRemark(item.get("画面データモデル.備考"))
					
				}else{
					//Nothing tod if duplicated
				}
			}
		}
	 
		//build funcs
		
		for(HashMap item:items){
			String funcName=item.get("機能")
			FuncModel funcModel=mappingModel.lookupFuncModel(funcName)
			if(funcModel==null){
				funcModel=new FuncModel();
				funcModel.setName(funcName)
				mappingModel.addFuncModel(funcModel)
			}
			
			//lookup TableModel item
			String modelId=item.get("画面データモデル.モデルID/概要")
			FuncGroupModel funcGroupModel=funcModel.lookupByName(modelId)
			if(funcGroupModel==null){
				funcGroupModel=new FuncGroupModel();
				funcGroupModel.setName(modelId)
				funcModel.addItem(modelId,funcGroupModel)
				//copy attributes
				funcGroupModel.addItem( item)
			}else{
				//Nothing tod if duplicated
				funcGroupModel.addItem( item)
			}
		}
		
		
		return mappingModel;
	}

	boolean skipTableColLogical(HashMap item){
		
		if( "".equals(item.get("テーブル.項目名(物理)").trim())
		){
			return true;
		}
		return false;
	}

	boolean skipTable(HashMap item){
		if( "".equals(item.get("画面データモデル.入力").trim())
		){
			return true;
		}
		return false;
	}
	boolean skip(HashMap item){

		if("".equals(item.get("画面データモデル.入力".trim()).trim())
		//||"".equals(item.get("テーブル.項目名(物理)".trim()).trim())
		){
			return true;
		}
		return false;

	}
	static public class Func{
		public List<Mapping> mappings=new ArrayList<Mapping>();
	}
	static public class Mapping{
		public List<HashMap> items=new ArrayList<HashMap>();

	}
}
