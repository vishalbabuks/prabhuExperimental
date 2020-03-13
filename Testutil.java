package com.BazaarCrm.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testutil {
	
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	
	public Testutil() throws IOException {
		
		fis = new FileInputStream("C:\\Users\\Prabhu\\eclipse-workspace\\com.matrimonybazaar.com\\src\\main\\java\\SeleniumMethods\\datasforonboard.xlsx");
		book=new XSSFWorkbook(fis);
		sheet=book.getSheet("Sheet1");
		
	}
	//rowcount
	public static int getRowCount() throws IOException {
		int rowcount=0;
		 rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		return rowcount;
	}
	//get string data
	public static String getCellData(int rownum,int colnum) {
		String celldata=null;
		celldata=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println(celldata);
		return celldata;
	}
	//get numeric value
	public static void getCellDataNumber(int rownum,int colnum) {
		double celldatanumeric=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		System.out.println(celldatanumeric);
	}
	//get column count
    public static int getcolcount() throws IOException {
		int colcount=0;
		 colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colcount);
		return colcount;
	}
	
	
	public static void main(String args[]) throws IOException {
		getRowCount();
		//getCellData();
		//getCellDataNumber();
	}
	
	

	
	

}
