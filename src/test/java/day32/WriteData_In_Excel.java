package day32;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_In_Excel {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\new_file.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("abc");
		row1.createCell(2).setCellValue("1234");
		
		XSSFRow row2 = sheet.createRow(1);
		
		row2.createCell(0).setCellValue("xyz");
		row2.createCell(1).setCellValue("1234");
		row2.createCell(2).setCellValue("dna");
		
		
		workbook.write(file);
		
		System.out.println("Writing is done....");
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
