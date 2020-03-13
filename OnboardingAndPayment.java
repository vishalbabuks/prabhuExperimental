package com.BazaarCrm.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BazaarCrm.pages.CategoryDetails;
import com.BazaarCrm.pages.KnowYourCustomer;
import com.BazaarCrm.pages.LastPageOffers;
import com.BazaarCrm.pages.LoginPage;
import com.BazaarCrm.pages.Packages;
import com.BazaarCrm.pages.PaymentOTPcheckLink;
import com.BazaarCrm.pages.ServiceProviderContactDetails;
import com.BazaarCrm.utils.Exceldataprovider;

import SeleniumMethods.SeleniumMethodsJava;

public class OnboardingAndPayment   {

	
		
    @Test(priority=1)		
    public static void loginuser() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    	
    	SeleniumMethodsJava.configproperty();
		SeleniumMethodsJava.startApp("chrome");
		LoginPage lp=PageFactory.initElements(SeleniumMethodsJava.driver, LoginPage.class);
		LoginPage.loginFSE();
		
		
	}

   @Test(priority=2)
    public static void Servivedetpage() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    	
    	ServiceProviderContactDetails servicecondet = PageFactory.initElements(SeleniumMethodsJava.driver, ServiceProviderContactDetails.class);
    	ServiceProviderContactDetails.clickaddvendorbutton();
    	ServiceProviderContactDetails.serviceproviderdetails();
    	
    	
    	
	}
    
    
    @Test(priority=3)
    public static void catepage() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
    	CategoryDetails catdetex = PageFactory.initElements(SeleniumMethodsJava.driver, CategoryDetails.class);
    	CategoryDetails.categorydet();
    	
    	
	}
    
    @Test(priority=4)
    public static void KYCcomppage() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    	
    	KnowYourCustomer kyccom = PageFactory.initElements(SeleniumMethodsJava.driver, KnowYourCustomer.class);
    	KnowYourCustomer.kyc();
		
	}
    
    @Test(priority=5)
    public static void paymentspage() throws IOException, Exception {
		// TODO Auto-generated method stub
		
    	Packages runningpayments = PageFactory.initElements(SeleniumMethodsJava.driver, Packages.class);
    	
    	Packages.packagedetails();
    	
    	PaymentOTPcheckLink otpcheckingrun = PageFactory.initElements(SeleniumMethodsJava.driver, PaymentOTPcheckLink.class);
    	
    	PaymentOTPcheckLink.vendorotpcheck();
    	
	}
    
    @Test(priority=6)
    public static void offerspage() throws IOException, InterruptedException {
    	
    	LastPageOffers offersp = PageFactory.initElements(SeleniumMethodsJava.driver, LastPageOffers.class);
    	
    	LastPageOffers.offers();
    }
    
    
}
