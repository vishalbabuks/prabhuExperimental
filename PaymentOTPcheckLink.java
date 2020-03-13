package com.BazaarCrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.BazaarCrm.utils.AdminerLogin;

import SeleniumMethods.SeleniumMethodsJava;

import com.BazaarCrm.utils.AdminerCustomerVendorOTP;

public class PaymentOTPcheckLink extends SeleniumMethodsJava  {
	
	
	//Send Otp
	
	@FindBy(xpath = "//div[@class='col-sm-2 col-xs-12']//button[@class='btn btn-primary btn-sm sendOtp']")
	@CacheLookup
	static
	
	WebElement sendotpbutton;
	
	//Verify OTP
	
	@FindBy(xpath = "//div[@class='col-sm-2 col-xs-12']//button[@class='btn btn-primary btn-sm verifyOtp']")
	@CacheLookup
	static
	
	WebElement verifyotp;
	
	@FindBy(xpath = "//input[@id='p1' and @class=' otpnumber form-control']")
	@CacheLookup
	static
	
	WebElement sendotp;
	
	@FindBy(xpath = "//button[@id='payment_detSubmit']")
	@CacheLookup
	static
	
	WebElement clickpaymentsubmit;
	
	@FindBy(xpath = "//button[@id='socialSubmit']")
	@CacheLookup
	static
	
	WebElement clicksocialpagesubmit;
	
	@FindBy(xpath = "//button[@id='additional_detSubmit']")
	@CacheLookup
	static
	
	WebElement clickadditionaldetsubmit;
	
	
	
	public static void vendorotpcheck() throws InterruptedException, IOException {
		
		
		sendotpbutton.click();
		
		//AdminerLogin logindbaccess = new AdminerLogin();
		
		//logindbaccess.dbLoginpage();
		
	    String parentwindowreturn = SeleniumMethodsJava.handlingWindow();
		
			
		AdminerCustomerVendorOTP vendorotpdbpage = new AdminerCustomerVendorOTP();
		
		String otpfromcustomerven = vendorotpdbpage.otpfromdb();
		
		Thread.sleep(10000);
		
		driver.switchTo().window(parentwindowreturn);
		
		sendotp.sendKeys(otpfromcustomerven);
		
		Thread.sleep(5000);
		
		verifyotp.click();
		
		Thread.sleep(5000);
		
		clickpaymentsubmit.click();
		
		Thread.sleep(10000);
		
		clicksocialpagesubmit.click();
		
		Thread.sleep(5000);
		
		clickadditionaldetsubmit.click();
		
		Thread.sleep(5000);
		
		
	}
	
}
