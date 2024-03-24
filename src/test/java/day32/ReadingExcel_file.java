package day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ExcelFile --->workbook---> sheet ---->Rows---->Cells

public class ReadingExcel_file {

	public static void main(String[] args) throws IOException {
		
		// First we have to read the data for that we use below class and specify
		// the location of the Excel file 
		
		//FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumproject_1\\testdata\\data.xlsx");
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");  // workbook.getSheetAt(0);
		
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows: "+totalrows);
		System.out.println("Number of cells: "+totalcells);
		
		
		for(int r=0;r<=totalrows;r++)
		{	
	        XSSFRow currentrow = sheet.getRow(r);
			
			for(int c = 0;c<totalcells;c++)
			{
			   //XSSFCell cell = currentrow.getCell(c);
			   //String value = cell.toString();
			   
			   String value = currentrow.getCell(c).toString();
			   System.out.print(value+"   ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
