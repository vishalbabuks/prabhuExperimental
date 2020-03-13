package com.BazaarCrm.utils;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumMethods.SeleniumMethodsJava;

public class AdminerCustomerVendorOTP extends SeleniumMethodsJava  {
	
	
	
	public  String otpfromdb() throws InterruptedException, IOException {
		
		SeleniumMethodsJava.configproperty();
		
		AdminerLogin cusVenOtp = new AdminerLogin();
		
	    cusVenOtp.dbLoginpage();
		
		Thread.sleep(30000);
	
		// Select dropdown DB
		 
		WebElement getProspectDb = driver.findElement(By.xpath("//select[@name='db']"));
		
		//Select prospectDb = new Select(getProspectDb);
		
		//mbazaarprospect
		
		getProspectDb.sendKeys("mbazaarprospect");	
		
		Thread.sleep(3000);
		
		//Click CustomerVEndorOTP
		
		WebElement customerVendorOTP = driver.findElement(By.xpath("//p[@id='tables']//a[@href='mysql.php?server=192.168.30.34&username=newjourney&db=mbazaarprospect&table=customer_vendor_otp' ]"));
		
		customerVendorOTP.click();
		
		Thread.sleep(3000);
		
		//Select data
		
        WebElement selectData = driver.findElement(By.xpath("//p[@class='links']//a[@href='mysql.php?server=192.168.30.34&username=newjourney&db=mbazaarprospect&select=customer_vendor_otp' ]"));
		
        selectData.click();
        
        Thread.sleep(3000);
		
        //click Search
        
        WebElement selectSearch = driver.findElement(By.xpath("//form[@id='form']//a[@href='#fieldset-search']"));
		
        selectSearch.click();
        
        Thread.sleep(3000);
        
        //select mobile number
        
        WebElement selectMobileNuber = driver.findElement(By.xpath("//div[@id='fieldset-search']//select[@name='where[0][col]']"));
		
        selectMobileNuber.sendKeys("mobile_number");
        
        Thread.sleep(3000);
        
        //send mobile number
        
        WebElement sendMobileNuber = driver.findElement(By.xpath("//div[@id='fieldset-search']//input[@name='where[0][val]']"));
		
        sendMobileNuber.sendKeys(propobj.getProperty("customervendorotp"));
        
        Thread.sleep(3000);
        
        //Select click number
        
        WebElement clickSelectNumber = driver.findElement(By.xpath("//input[@value='Select']"));
		
        clickSelectNumber.click();
        
        Thread.sleep(5000);
        
        //getOTP
        
        WebElement getOtp = driver.findElement(By.xpath("//table[@id='table']/tbody/tr/td[7]"));
        
        String getOtpnumber = getOtp.getText();
        
        System.out.println(getOtpnumber);
        
        //getOtp.getAttribute();
        
        return getOtpnumber;
	}
	
	//DB
	
	//select[@name='db']
	 
		
	//click CustomerVEndorOTP
	
	//p[@id='tables']//a[@href='mysql.php?server=192.168.30.34&username=newjourney&db=mbazaarprospect&table=customer_vendor_otp' ]
	
	//Select data
	
	//p[@class='links']//a[@href='mysql.php?server=192.168.30.34&username=newjourney&db=mbazaarprospect&select=customer_vendor_otp' ]
	
	//Search
	
	//form[@id='form']//a[@href='#fieldset-search']
	
	
	
	//Send Keys mobile number
	
	//div[@id='fieldset-search']//input[@name='where[0][val]']
	
	//get otp
	
	//td[@id='val[&where%5Botpid%5D=32][otp]']

}


