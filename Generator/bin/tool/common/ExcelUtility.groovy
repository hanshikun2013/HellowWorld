package tool.common

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellValue
import org.apache.poi.ss.usermodel.FormulaEvaluator

class ExcelUtility {
	public static String getStr(FormulaEvaluator evaluator,Cell cell) {
		String result=getStr2(evaluator,cell);
		if(cell==null) return ""
		return result;
	}
	public static String getStr2(FormulaEvaluator evaluator ,Cell cell) { // データ型毎の読み取り
		
		if(cell==null) return "";
//		CellValue cellValue = evaluator.evaluate(cell);
//		//if(cellValue==null) return "";
//		switch (cellValue.getCellType()) {
//			case Cell.CELL_TYPE_BOOLEAN:
//				return cellValue.getBooleanValue();
//			case Cell.CELL_TYPE_NUMERIC:
//				return cellValue.getNumberValue();
// 
//			case Cell.CELL_TYPE_STRING:
//				return cellValue.getStringValue();
//				break;
//			case Cell.CELL_TYPE_BLANK:
//				break;
//			case Cell.CELL_TYPE_ERROR:
//				break;
//		
//			// CELL_TYPE_FORMULA will never happen
//			case Cell.CELL_TYPE_FORMULA:
//				break;
//		}
		switch (cell.getCellType()) {
			case Cell.CELL_TYPE_BOOLEAN:
				return Boolean.toString(cell.getBooleanCellValue());
			case Cell.CELL_TYPE_FORMULA:
				evaluator.evaluateFormulaCell(cell);
				return cell.getCellFormula();
			// return cell.getStringCellValue();//(※）
			case Cell.CELL_TYPE_NUMERIC:
				def value =""
				try {
					value= Integer.toString(cell.getNumericCellValue().toInteger());
				} catch (Exception e) {
 					value= Double.toString(cell.getNumericCellValue());
				}
				return value;
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
		}
		return "";// CELL_TYPE_BLANK,CELL_TYPE_ERROR
	}
}
