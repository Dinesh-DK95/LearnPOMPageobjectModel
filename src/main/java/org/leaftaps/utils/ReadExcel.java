package org.leaftaps.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  String [] [] readexcel ( String excelname) throws IOException {
		
		// TODO Auto-generated method stub
		
		//Open work book
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+excelname+".xlsx");
		
		// get sheet
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		
		//row count
		int RowNum = sheet.getLastRowNum();
		System.out.println(RowNum);
		
		//col count
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		
		//Declare 2 D Array to store the excel data
		
		String [] [] data = new String[RowNum][colcount];
		
		
		for (int i = 1; i <=RowNum; i++) {
			//get row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				//get cell
				XSSFCell cell = row.getCell(j);
				// Action - Read
				String Value = cell.getStringCellValue();
				System.out.println(Value);
				
				//Assign each cell value to the 2D array
				data [i-1] [j] = Value;
			}
		}
		
		return data;
	}

	
}
