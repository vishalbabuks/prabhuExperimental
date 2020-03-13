package com.BazaarCrm.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import SeleniumMethods.SeleniumMethodsJava;

public class ServiceProviderContactDetails extends SeleniumMethodsJava {
	
	
	
	
	//Add Service Provider
	
	@FindBy(xpath = "//a[@href='http://service.matrimonybazaar.com/index.php/addvendor_onboard/addvendordetails']")
	@CacheLookup
	static
			
	WebElement clickaddvendor;
	
	//Primary Contact Number
	
	@FindBy(xpath = "//input[@id='contact_Number1']")
	@CacheLookup
	static
	
	WebElement contactnumber;
	
	//Service provider name
	
	@FindBy(xpath = "//input[@id='v_name']")
	@CacheLookup
	static
	
	WebElement providername;
	
	//Primary Contact Person 
	
	@FindBy(xpath = "//input[@id='contact_person_name1']")
	@CacheLookup
	static
	
	WebElement contactperson;
	
	//Primary Contact Role
	
	@FindBy(xpath = "//select[@id='contact_person_role1']")
	@CacheLookup
	static
	
	WebElement contactrole;
	
	//state
	
	@FindBy(xpath ="//select[@id='vstate']")
	@CacheLookup
	static
	
	WebElement serviceproviderstate;
	
	//District/City 
	
	@FindBy(xpath ="//select[@id='vdistrict']")
	@CacheLookup
	static
	
	WebElement serviceprovidercity;
	
	//Locality
	
	@FindBy(xpath ="//select[@id='vlocality']")
	@CacheLookup
	static
	
	WebElement serviceproviderlocality;
	
	//Pincode
	
	@FindBy(xpath ="//input[@id='Pincode']")
	@CacheLookup
	static
	
	WebElement serviceproviderpincode;
	
	//Next
	
	@FindBy(xpath ="//button[@id='vendor_det']")
	@CacheLookup
	static
	
	
	WebElement serviceproviderNext;
	
	public static void clickaddvendorbutton() throws InterruptedException {
		Thread.sleep(10000);
		clickaddvendor.click();
	}
	
	public static void serviceproviderdetails() throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		
		SeleniumMethodsJava.configproperty();
		
		contactnumber.sendKeys(propobj.getProperty("PrimaryContactNumber"));
		
		Thread.sleep(5000);
		
		providername.sendKeys(propobj.getProperty("ServiceProviderName") );
		
		Thread.sleep(5000);
		
		contactperson.sendKeys(propobj.getProperty("PrimaryContactPerson"));
		
		Thread.sleep(5000);
		
		Select controle = new Select(contactrole);
		
		controle.selectByVisibleText(propobj.getProperty("PrimaryContactRole"));
		
		Thread.sleep(5000);
		
		Select serstate = new Select(serviceproviderstate);
		
		serstate.selectByVisibleText(propobj.getProperty("State"));
		
		Thread.sleep(5000);
		
		Select sercity = new Select(serviceprovidercity);
		
		sercity.selectByVisibleText(propobj.getProperty("DistrictAndCity"));
		
		Thread.sleep(5000);
		
		Select serloc = new Select(serviceproviderlocality);
		
		serloc.selectByVisibleText(propobj.getProperty("Locality"));
		
		Thread.sleep(5000);
		
		//serviceproviderpincode
		
		serviceproviderNext.click();
		
		Thread.sleep(10000);
		
		
	}

}
