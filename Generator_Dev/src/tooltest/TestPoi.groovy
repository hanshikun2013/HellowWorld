package tooltest

import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*




FileInputStream fi = new FileInputStream(
		"C:/workspaceSSS/workspace/Generator_Dev/input/法人統合_データモデル←テーブルマッピング.xlsx");
XSSFWorkbook book = new XSSFWorkbook(fi);
fi.close();
for (Sheet sheet : book) {
	// 全シートをなめる
	// sheet.setForceFormulaRecalculation(true);// 数式解決(※)
	System.out.println("--- " + sheet.getSheetName() + " ---");
	for (Row row : sheet) { // 全行をなめる
		for (Cell cell : row) { // 全セルをなめる
			System.out.print(getStr(cell) + " ");
		}
		System.out.println("");
	}
}




String getStr(Cell cell) { // データ型毎の読み取り
	switch (cell.getCellType()) {
		case Cell.CELL_TYPE_BOOLEAN:
			return Boolean.toString(cell.getBooleanCellValue());
		case Cell.CELL_TYPE_FORMULA:
			return cell.getCellFormula();
		// return cell.getStringCellValue();(※）
		case Cell.CELL_TYPE_NUMERIC:
			return Double.toString(cell.getNumericCellValue());
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();
	}
	return "";// CELL_TYPE_BLANK,CELL_TYPE_ERROR
}
