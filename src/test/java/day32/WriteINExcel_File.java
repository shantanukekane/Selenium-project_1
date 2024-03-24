package day32;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteINExcel_File {

	public static void main(String[] args) throws IOException {
		
		
		// We have to write a data in a Excel File 
	     FileOutputStream file = new  FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");	
		  
	     
	     XSSFWorkbook workbook = new XSSFWorkbook();
	     
	     XSSFSheet sheet= workbook.createSheet();
	     
		 XSSFRow row1 = sheet.createRow(0);
		
		 
		 row1.createCell(0).setCellValue("Sr.No");
		 row1.createCell(1).setCellValue("Name");
		 row1.createCell(2).setCellValue("Department");
	
		 XSSFRow row2 = sheet.createRow(1);
		 
		 row2.createCell(0).setCellValue("1");
		 row2.createCell(1).setCellValue("Shantanu");
		 row2.createCell(2).setCellValue("IT");
		 
		 XSSFRow row3 = sheet.createRow(2);
		 
		 row3.createCell(0).setCellValue("2");
		 row3.createCell(1).setCellValue("Nikhil");
		 row3.createCell(2).setCellValue("IT");
		 
		 
		 workbook.write(file);
		 workbook.close();
		 file.close();
		 
		
		
		
		
		
		
		
		
		
		

	}

}
