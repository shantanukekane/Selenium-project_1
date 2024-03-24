package day32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_in_Excel_2 {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\new_data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		XSSFRow row1 = sheet.createRow(0);
		
		Scanner s = new Scanner(System.in);
		
		for(int r = 0;r<=3;r++)
		{
		    XSSFRow currentrow = sheet.createRow(r);
			
			for(int c = 0;c<=2;c++)
			{
				System.out.println("Enter any value: ");
				String value = s.next();
				currentrow.createCell(c).setCellValue(value);
				
			}
			System.out.println();
			
		}
		

		workbook.write(file);
		workbook.close();
		
		file.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
