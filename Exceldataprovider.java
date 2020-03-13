package com.BazaarCrm.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Exceldataprovider {
	
	
	
	 @DataProvider(name="testdatamandap")
	public static Object[][] getdta() throws IOException {
		testdata();
		return testdata();
	}
	
	public static Object[][] testdata() throws IOException {
		Testutil tud=new Testutil();
		int rcount=tud.getRowCount();
		int ccount=tud.getcolcount();
		
		Object data[][]=new Object[rcount-1][ccount];
		
		for(int i=1; i<rcount; i++) {
			for(int j=0; j<ccount; j++) {
				String celdata=tud.getCellData(i, j);
				//System.out.println(celdata);
				data[i-1][j]=celdata;
				
			}
			System.out.println();
			
			
		}
		return data;
		
		
	}
	
	
	

	

	public static void main(String[] args) throws IOException {
		
		//testdata();
		

	}

}
