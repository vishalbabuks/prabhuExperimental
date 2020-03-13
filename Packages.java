package com.BazaarCrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import SeleniumMethods.SeleniumMethodsJava;

public class Packages extends SeleniumMethodsJava {
	
	//Listing & Lead Package
	
	@FindBy(xpath = "//td[@data-title='Package']//input[@class='js_listing_pck listingvaluecheck']")
	@CacheLookup
	static
		
	WebElement packageamount;
	
	//Payment Method
	
	@FindBy(xpath = "//select[@id='paymentmode']")
	@CacheLookup
	static
	
	WebElement paymentmethod;
	
	//Payment Online
	
	//Transaction Number
	
	@FindBy(xpath = "//input[@id='receitpnumber']")
	@CacheLookup
	static
	
	WebElement transactionnumber;
	
	//Amount (inclusive Tax) 
	
	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	static
	
	WebElement getamount;
	
	//get total amount
	
	@FindBy(xpath="//strong[@id='js-total-package-amt']")
	@CacheLookup
	static
	
	WebElement gettotalamount;
	
	//Bank Name
	
	@FindBy(xpath = "//select[@id='bank_name']")
	@CacheLookup
	static
	
	WebElement bankname;
	
	//Reference Photo Copy
	
	@FindBy(xpath = "//input[@id='uploadpaymentimg']")
	@CacheLookup
	static
	
	WebElement photocopy;
	
	//Next
	
	@FindBy(xpath = "//button[@id='payment_detSubmit']")
	@CacheLookup
	static
	
	WebElement paymentpagenext;
	
	public static void packagedetails() throws IOException, Exception {
		
		SeleniumMethodsJava.configproperty();
		
		//Package option
		
		//Select packageopt = new Select(packageoption);
		
		Thread.sleep(5000);
		
		packageamount.sendKeys(propobj.getProperty("Package"));
		
		Thread.sleep(8000);
		
		//Package Method
		
		Select packagemeth = new Select(paymentmethod);
		
		packagemeth.selectByVisibleText(propobj.getProperty("PaymentMethod"));
		
		Thread.sleep(5000);
		
		//transaction number
		
		transactionnumber.sendKeys(propobj.getProperty("TransactionNumber"));
		
		Thread.sleep(5000);
		
		//Get amount
		
		String amountentered = getamount.getText();
		
		System.out.println("Total Amount 1  ="  +amountentered);
		
		Thread.sleep(5000);
		 
		String gettotalamountfrom  = gettotalamount.getText();
		
		System.out.println("Total    ="  +gettotalamountfrom);
		
		Thread.sleep(5000);
		
		//select bank name
		
		Select banknamesel = new Select(bankname);
		
		banknamesel.selectByVisibleText(propobj.getProperty("BankName"));
		
		Thread.sleep(5000);
		
		//reference photo
		
		photocopy.sendKeys(propobj.getProperty("RefPhotoCopy"));
		
				
	}
	
	

}
