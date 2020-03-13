package com.BazaarCrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumMethods.SeleniumMethodsJava;

public class AdminerLogin  extends SeleniumMethodsJava{
	
	//public WebDriver driver;
	
	public void  dbLoginpage() throws InterruptedException {
		
	
    //SeleniumMethodsJava.driver=this.driver;
	
	//System.setProperty("webdriver.chrome.driver", "C:/Users/Prabhu/Desktop/Driversdownload/chromedriver.exe");
	
	//driver = new ChromeDriver();
	
	//driver.get("https://www.matrimonybazaar.com/mysql.php?server=192.168.30.34");
	
	//driver.manage().window().maximize();	
	
	//URL
	
	//https://www.matrimonybazaar.com/mysql.php?server=192.168.30.34
		
	//UserNmae
	
	//input[@id='username']
		
		Thread.sleep(5000);
	
	WebElement DBUserName = driver.findElement(By.xpath("//input[@id='username']"));
			
	DBUserName.sendKeys("newjourney");	
	
	Thread.sleep(3000);
	
	//Password
	
	//input[@name='auth[password]']
	
	WebElement DBPassword = driver.findElement(By.xpath("//input[@name='auth[password]']"));
	
	DBPassword.sendKeys("matri10yrs");
	
	Thread.sleep(3000);
	
	//Database
	
	//input[@name='auth[db]']
	
	WebElement DataBaseName = driver.findElement(By.xpath("//input[@name='auth[db]']"));
	
	DataBaseName.sendKeys("mbazaar");
	
	Thread.sleep(3000);
	
	//Login
	
	//input[@type='submit' and @value='Login']
	
	WebElement ClickDBLogin = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
	
	ClickDBLogin.click();
	
	Thread.sleep(3000);

}
	}
