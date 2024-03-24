package day32;

// Excel file ----> Workbook ----> sheet -----> rows ----> cells

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadingExcel_file_2 {

	public static void main(String[] args) throws IOException {
	
		// We have created a class object for the Excel file and pass the path of the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// Total Number of rows and number of columns
		 int totalrows = sheet.getLastRowNum();  //
		 // we can't directly goes to the cells from sheets we first go to row and then jump to the cell
		 // have to maintain the hierarchy
		 
		 int totalcells = sheet.getRow(2).getLastCellNum();
		 
		 System.out.println("Number of rows: "+totalrows);  // 5
		 System.out.println("Number of cells: "+totalcells);  //4
		 
		 // using for loop we call each and every data from the Excel file
		 
		 for(int r = 0;r<=totalrows;r++)
		 {
			 XSSFRow currentrow = sheet.getRow(r);  // these class get the current row of the rows
			 
			 for(int c = 0;c<totalcells;c++)
			 {
				//XSSFCell cell = currentrow.getCell(c);
				//String value = cell.toString(); 
				String value = currentrow.getCell(c).toString();  // using currentrow we jump to the inner cells and
				                                                   // toString method extract the data from the Excel sheet
			    System.out.print(value+"   ");
			 
			 }
			 System.out.println();
		
		 }
		 
		 workbook.close();
		 file.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

	private static Object getcell() {
		// TODO Auto-generated method stub
		return null;
	}

}
