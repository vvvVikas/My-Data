package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String readData(int row, int col) throws IOException {
	String location = "C:\\Users\\my pc\\eclipse-workspace\\RestAssured\\Files\\InputList.xlsx";
	File f = new File(location);
	FileInputStream fis = new FileInputStream(f);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet1= wb.getSheetAt(0);
	
	
	String value = sheet1.getRow(row).getCell(col).getStringCellValue();
	
	return value;
		
	}
//	public static void main(String[] args) throws IOException {
//		
//		System.out.println(readData(0,0));
//		System.out.println(readData(0,1));
//		System.out.println(readData(1,0));
//		System.out.println(readData(1,1));
//		
//	}
	
}
