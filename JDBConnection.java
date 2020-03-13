package com.BazaarCrm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JDBConnection {
	
	public static void main(String args[]) throws Exception  {
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection jdbcconn = DriverManager.getConnection("jdbc:mysql://192.168.20.32:3036/mbazaar", "newjourney", "matri10yrs");
	
	Statement stmt = jdbcconn.createStatement();
	
	String query = "select * from customerRequest";
	
	ResultSet getNumber = stmt.executeQuery(query);
	
	//int getmobileno = getNumber.getInt(getmobileno);
	
	System.out.println("Getting col customer Request -  "+getNumber.getString(0));
	
	}

}
