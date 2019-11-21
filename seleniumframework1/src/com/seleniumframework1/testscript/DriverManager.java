package com.seleniumframework1.testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DriverManager extends Keywords{

	public static void main(String[] args) throws Exception {
		DriverManager dm = new DriverManager();
		ArrayList a = new ArrayList();
		FileInputStream fis = new FileInputStream(
				"C:/Users/Raman/Documents/LeadsSuite.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowItr = sheet.iterator();

		while (rowItr.hasNext()) {
			Row rowall = rowItr.next();

			Iterator<Cell> cellIterator = rowall.iterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				if (cell.getCellTypeEnum() == CellType.STRING) {
					a.add(cell.getStringCellValue());
				}
				if (cell.getCellTypeEnum() == CellType.BOOLEAN) {
					a.add(cell.getBooleanCellValue());
				}
				if (cell.getCellTypeEnum() == CellType.NUMERIC) {
					a.add(cell.getNumericCellValue());
				}
			}
		}

		String keywordName, testData, objectName, runMode;
		for (int i = 0; i < a.size(); i++) {

			if (a.get(i).equals("openBrowser")) {
				keywordName = (String) a.get(i);
				testData = (String) a.get(i + 1);
				objectName = (String) a.get(i + 2);
				runMode = (String) a.get(i + 3);
				
				if (runMode.equals("yes")) {
					dm.openBrowser();
				}
			}
			
			if (a.get(i).equals("navigate")) {
				keywordName = (String) a.get(i);
				testData = (String) a.get(i + 1);
				objectName = (String) a.get(i + 2);
				runMode = (String) a.get(i + 3);
				
				if (runMode.equals("yes")) {
					dm.navigate(testData);
				}
			}

		}

	}
}
