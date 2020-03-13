package com.BazaarCrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import SeleniumMethods.SeleniumMethodsJava;

public class LastPageOffers extends SeleniumMethodsJava {
	
	//Exclusive offer 1
	
	@FindBy(xpath = "//textarea[@id='exclusive_offers_1']")
	@CacheLookup
	static
	
	WebElement exclusiveoffer1;
	
	//Exclusive offer 2
	
	@FindBy(xpath = "//textarea[@id='exclusive_offers_2']")
	@CacheLookup
	static
	
	WebElement exclusiveoffer2;
	
	//Exclusive offer 3
	
	@FindBy(xpath = "//textarea[@id='exclusive_offers_3']")
	@CacheLookup
	static
		
	WebElement exclusiveoffer3;
	
	@FindBy(xpath = "//button[@id='finalsubmitbtn']")
	@CacheLookup
	static
	
	WebElement finalsubmitbutton;
	
	
	
	public static void offers() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		SeleniumMethodsJava.configproperty();
		
		Thread.sleep(3000);
		
		exclusiveoffer1.sendKeys(propobj.getProperty("exclusiveoffer1"));
		
		Thread.sleep(3000);
		
		exclusiveoffer2.sendKeys(propobj.getProperty("exclusiveoffer2"));
		
		Thread.sleep(3000);
		
		exclusiveoffer3.sendKeys(propobj.getProperty("exclusiveoffer3"));
		
		Thread.sleep(5000);
		
		finalsubmitbutton.click();
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println("Member id = "+currenturl);
		
		
	}

}
