package com.BazaarCrm.testcases;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BazaarCrm.pages.LoginPage;
import com.BazaarCrm.pages.ServiceProviderContactDetails;
import com.BazaarCrm.utils.Exceldataprovider;

import SeleniumMethods.SeleniumMethodsJava;


public class TestLogin {
	
		
	@Test(dataProvider="testdatamandap",dataProviderClass = Exceldataprovider.class)
	public void testinglogin() throws IOException, InterruptedException  {

		SeleniumMethodsJava.configproperty();
		SeleniumMethodsJava.startApp("chrome");
		LoginPage lp=PageFactory.initElements(SeleniumMethodsJava.driver, LoginPage.class);
		LoginPage.loginFSE();
		
		ServiceProviderContactDetails servicecondet = PageFactory.initElements(SeleniumMethodsJava.driver, ServiceProviderContactDetails.class);
	    
				
	}
	
	
	

}
