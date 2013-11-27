package tool.model.common
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.FormulaEvaluator
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet

import tool.common.ExcelUtility
class BasicSheet {
	int startX,startY
	String[] TITLE_NAME={}
	List<HashMap> items=new ArrayList<HashMap>();
	BasicExcel excel
	public BasicSheet(BasicExcel excel){
		init();
		this.excel=excel
	}
	public parse(Sheet sheet){
		// 全シートをなめる
		sheet.setForceFormulaRecalculation(true);// 数式解決(※)
		//System.out.println("--- " + sheet.getSheetName() + " ---");
		for (int rowCount = startY; rowCount < sheet.getLastRowNum() + 1; rowCount++) {
		 Row row = sheet.getRow(rowCount);
		 //System.out.println("row:"+rowCount);
		 
		 Iterator<Cell> ite = row.cellIterator();
		 HashMap item =new HashMap();
		 
		 for (int column = startX;column<startX+TITLE_NAME.length;column++) {
			 Cell cell=  row.getCell(column);
			 def cellValue=ExcelUtility.getStr(excel.evaluator,cell)
			 
			 item.put(TITLE_NAME[column], cellValue);
			  //System.out.print(TITLE_NAME[column]+""+item.get(TITLE_NAME[column]) + " @"+column);
		 }
		 if(!ignoreItem( item )){
			 items.add(item)
		 }
		 //System.out.println("");
			 
			
		}
	}
	boolean ignoreItem(HashMap item ){
		return false
	}
	void init(){
		startX=0;
		startY=0;
		TITLE_NAME={};
	}
	void dumpItems(List<HashMap> items){
		 
		for(String label:TITLE_NAME){
			System.out.print(label+" \t");
		}
		System.out.print("\r\n");
		for(HashMap item:items){
			for(String label:TITLE_NAME){
				if(item.get(label)==null){
					System.out.print("\r\n");
				}
				System.out.print("\""+item.get(label).replaceAll("\\s+","").replaceAll("\r\n|\n\r|\n|\r","")+"\" \t");
			}
			System.out.print("\r\n");
		}
		System.out.print("\r\n");
		System.out.print("Dump end");
		
	}
}
