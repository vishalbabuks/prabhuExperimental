package com.BazaarCrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import SeleniumMethods.SeleniumMethodsJava;

public class KnowYourCustomer extends SeleniumMethodsJava  {
	
	
	//KYC Document 1 
	
	@FindBy(xpath = "//*[@id='kyc_doc_type1']")
	@CacheLookup
	
	static
	
	WebElement kycdoc1;
	
	//choose file
	
	@FindBy(xpath = "//input[@id='kyc_doc1']")
	@CacheLookup
	static
	
	WebElement kycdocfile;
	
	//Pan Card Number
	
	@FindBy(xpath = "//input[@id='kyc_doc_comment1']")
	@CacheLookup
	static
	
	WebElement pannumber;
	
	//GST Number
	
	@FindBy(xpath = "//input[@id='gstnumber']")
	@CacheLookup
	static
	
	WebElement gstnumber;
	
	//GST State
	
	@FindBy(xpath = "//select[@id='gststate']")
	@CacheLookup
	static
	
	WebElement gststate;
	
	//GST City 
	
	@FindBy(xpath = "//select[@id='gstcity']")
	@CacheLookup
	static
	
	WebElement gstcity;
	
	//GST Document choose file
	
	@FindBy(xpath = "//input[@id='gst_doc1']")
	@CacheLookup
	static
	
	WebElement gstdocfile;
	
	//Business Name
	
	@FindBy(xpath = "//input[@id='businessnamegst']")
	@CacheLookup
	static
	
	WebElement businessname;
	
	//Address
	
	@FindBy(xpath = "//input[@id='addressgst']")
	@CacheLookup
	static
	
	WebElement address;
	
	//Next from KYC
	
	@FindBy(xpath = "//button[@id='kycSubmit']")
	@CacheLookup
	static
	
	WebElement nextfromkyc;
	
	
	public static void kyc() throws IOException, InterruptedException {
		
		//kycdocname
		
		Thread.sleep(5000);
		
		System.out.println("Entering KYC page");
		
		SeleniumMethodsJava.configproperty();
		
		Thread.sleep(10000);
		
        Select kycdocname = new Select(kycdoc1);
		
		kycdocname.selectByVisibleText(propobj.getProperty("KYCDocumentdoc"));
		
		Thread.sleep(5000);		
		
		
        /* Actions actions = new Actions(SeleniumMethodsJava.driver);		 
		 
		 actions.moveToElement(kycdoc1);
		 
		 actions.click();
		 
		 actions.sendKeys(propobj.getProperty("KYCDocumentdoc"));
		 
		 actions.build().perform();
		 
		 Thread.sleep(8000);*/
		 
		/* actions.moveToElement(clickCategory);
		 
		 actions.click();
		 
		 actions.build().perform();
		 
		 Thread.sleep(5000);*/
		
		
		//kyc doc file
		
		//Select kycfile = new Select(kycdocfile);
		
		kycdocfile.sendKeys("C:\\Users\\Prabhu\\Desktop\\usingforsel.jpeg");	
		
		Thread.sleep(15000);
		
		pannumber.sendKeys(propobj.getProperty("PanNumber"));
		
		Thread.sleep(5000);
		
		//gst number
		
		gstnumber.sendKeys(propobj.getProperty("GSTNumber"));
		Thread.sleep(5000);
		
		//gst state
		
		Select selectgstsate = new Select(gststate);
		
		selectgstsate.selectByVisibleText(propobj.getProperty("GSTState"));
		Thread.sleep(5000);
		
		//gst city
		
		Select selectgstcity = new Select(gstcity);
		
		selectgstcity.selectByVisibleText(propobj.getProperty("GSTCity"));
		Thread.sleep(15000);
		
		//Gst document
		
		gstdocfile.sendKeys("C:\\Users\\Prabhu\\Desktop\\usingforsel.jpeg");
		Thread.sleep(5000);
		
		//address
		
		address.sendKeys(propobj.getProperty("Address"));
		Thread.sleep(5000);
		
		

		//next page
		
		nextfromkyc.click();
		
		
	}
	

}
