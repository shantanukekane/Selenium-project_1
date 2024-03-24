package day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel_sheet2 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet2"); //getSheetAt(0) using index value
		
	    int	totalrows = sheet.getLastRowNum();
		
	    int totalcells = sheet.getRow(1).getLastCellNum();
	    
	    System.out.println("Number of rows: "+totalrows);   // 5
	    System.out.println("Number of cell: "+totalcells);  // 2
	    
	    for(int r = 0;r<=totalrows;r++)
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
