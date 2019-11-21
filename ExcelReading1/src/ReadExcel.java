import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws Exception{
		FileInputStream f = new FileInputStream("C:/Users/Raman/Documents/Mock Interview.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(f);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowItr = sheet.iterator();
		
		while(rowItr.hasNext()){
			Row rowall = rowItr.next();
			
			Iterator<Cell> cellIterator = rowall.cellIterator();
			
			while(cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				
				if(cell.getCellTypeEnum() == CellType.STRING){
					System.out.println(cell.getStringCellValue());
				}
				if (cell.getCellTypeEnum() == CellType.NUMERIC) {
					System.out.println(cell.getNumericCellValue());
				}
				if (cell.getCellTypeEnum() == CellType.BOOLEAN) {
					System.out.println(cell.getBooleanCellValue());
				}
			}
		}
	}

}
