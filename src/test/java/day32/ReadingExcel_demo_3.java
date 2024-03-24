package day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel_demo_3 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new  FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println("Number of rows: "+totalrows);
		System.out.println("Number of cells: "+totalcells);
		
	    
		
		for(int r = 0;r<=totalrows;r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c = 0;c<totalcells;c++)
			{
				String value = currentrow.getCell(c).toString();
				System.out.print(value+"   ");
			}
			System.out.println();
			
		}
		
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
