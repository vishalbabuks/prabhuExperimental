package com.BazaarCrm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import SeleniumMethods.SeleniumMethodsJava;

public class LoginPage extends SeleniumMethodsJava  {
	
  			
		//Email/EmpId 
		
		@FindBy(xpath = "//input[@id='email']")
		@CacheLookup
		static 
		WebElement loginusernameemp;
		//Password
		
	    @FindBy(xpath = "//input[@name='password']")
	    @CacheLookup
	    static
		
		WebElement loginuserpassword;
		
		//User Level
		
        @FindBy(xpath = "//select[@id='userlevel']")
        @CacheLookup
        static
		
		WebElement loginuserlevel;
        
        //Business Team
		
        @FindBy(xpath = "//select[@id='branch']")
        @CacheLookup
        static        
		
		WebElement loginbusinessbranch;
		
        //extension number
		
        @FindBy(xpath = "//input[@id='ext_no']")
        @CacheLookup
        static
		
		WebElement extno;
        
        //click login button
        
        @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-flat btnSubmit']")
        @CacheLookup
        static
        
		WebElement clicklogin;
        
     
        
        public static  void loginFSE() throws IOException, InterruptedException {
        
        	
        	SeleniumMethodsJava.configproperty();
        	
        	System.out.println(propobj.getProperty("url"));
        	
        	//loginusernameemp.sendKeys(uname);
        	
        	loginusernameemp.sendKeys(propobj.getProperty("username"));
        	
        	Thread.sleep(5000);
        	
        	LoginPage.loginuserpassword.sendKeys(propobj.getProperty("password"));
        	
        	Thread.sleep(5000);
        	
        	Select selectuserlevel = new Select(loginuserlevel);
        	
        	selectuserlevel.selectByVisibleText(propobj.getProperty("userlevel"));
        	
        	Thread.sleep(5000);
        	
            Select selectbusibranch = new Select(loginbusinessbranch);
        	
            selectbusibranch.selectByVisibleText(propobj.getProperty("branch"));
            
            Thread.sleep(5000);
            
            LoginPage.extno.sendKeys(propobj.getProperty("extension"));
            
            Thread.sleep(5000);
            
            clicklogin.click();
        	
        }
        
        
        
     
       
        
        
        
        
        
      
        	
        
        	
        

		

	}


