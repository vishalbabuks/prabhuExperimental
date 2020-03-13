package com.BazaarCrm.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import SeleniumMethods.SeleniumMethodsJava;

public class CategoryDetails extends SeleniumMethodsJava {
	
	
	 
	
	//Category
	
	@FindBy(xpath = "//div[@id='sub_categorydiv']")
	@CacheLookup
	static
	
	WebElement category;
	
	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--highlighted']")
	@CacheLookup
	static
	WebElement clickCategory;
	
	//selected state
	
	@FindBy(xpath = "//select[@id='state_84_0']")
	@CacheLookup
	static
	
	WebElement selectedstate;
	
	//selected district
	
	@FindBy(xpath = "//select[@id='district_84_0']")
	@CacheLookup
	static
	
	WebElement selecteddistrict;
	
	//photos
	
	@FindBy(xpath = "//input[@id='categoty_doc84']")
	@CacheLookup
	static
	
	WebElement Servicecategoryphotos;
	
	//click attribute
	
	@FindBy(xpath = "//h4[@class='box-title collapsed']")
	@CacheLookup
	static
	
	WebElement clickcatattribue;
	
	//Which Cuisine(s) Do You Serve?//write check box action loop code
	
	@FindBy(xpath = "//input[@id='m-506_s-1252']")
	@CacheLookup
	static
	
	//List<WebElement> cuisine;
	
	WebElement cuisine;
	
	//Customer Discount
	
	@FindBy(xpath = "//input[@name='1260_506_1_M']")
	@CacheLookup
	static
	
	WebElement customerdiscount;
	
	//email
	
	@FindBy(xpath = "//input[@name='1268_506_1_M']")
	@CacheLookup
	static
	
	WebElement provideremail;
	
	//Google Places Id
	
	@FindBy(xpath = "//input[@name='1269_506_1_M']")
	@CacheLookup
	static	
	
	WebElement googleplaceid;
	
	//What Is The Range Of Your Per Plate Cost?
	
	@FindBy(xpath = "//input[@id='m-523_s-1254']")
	@CacheLookup
	static
	
	//List<WebElement> rangeperplate;
	WebElement rangeperplate;
	
	//Starting Price (per Plate)
	
	@FindBy(xpath = "//div[@class='col-lg-8 col-md-8']//input[@id='mininput' and @name='1565_523_1_M']")
	@CacheLookup
	static
	
	WebElement startingprice;
	
	//Cuisines Served
	
	@FindBy(xpath = "//input[@id='m-523_s-1567' and @value='2107']")
	@CacheLookup
	static
	
	WebElement cuisserverd;
	
	//What Are Your Speciality Items/dishes?
	
	@FindBy(xpath = "//textarea[@name='1571_523_1_S']")
	@CacheLookup
	static
	
	WebElement specialitems;
	
	//Established In (year)
	
	@FindBy(xpath = "//input[@name='1564_524_1_M']")
	@CacheLookup
	static
	
	WebElement establistedyear;
	
	//Standard Breakfast Menu Items
	
	@FindBy(xpath = "//textarea[@name='1572_525_1_S']")
	@CacheLookup
	static
	
	WebElement breakfastmenu;
	
	//Breakfast - Minimum Per Plate
	
	@FindBy(xpath = "//textarea[@name='1573_525_1_S']")
	@CacheLookup
	static
	
	WebElement breakfastperplate;
	
	//Standard Lunch Menu Items
	
	@FindBy(xpath = "//textarea[@name='1574_525_1_S']")
	@CacheLookup
	static
	
	WebElement standardlunch;
	
	//Lunch - Minimum Per Plate
	
	@FindBy(xpath = "//textarea[@name='1575_525_1_S']")
	@CacheLookup
	static
	
	WebElement lunchperplate;
	
	//Standard Dinner Menu Items
	
	@FindBy(xpath = "//textarea[@name='1576_525_1_S']")
	@CacheLookup
	static
	
	WebElement standarddinner;
	
	//Dinner - Minimum Per Plate
	
	@FindBy(xpath = "//textarea[@name='1577_525_1_S']")
	@CacheLookup
	static
	
	WebElement dinnerperplate;
	
	//Standard High Tea Menu Items
	
	@FindBy(xpath = "//textarea[@name='1578_525_1_S']")
	@CacheLookup
	static
	
	WebElement standardhighteamenu;
	
	//High Tea - Minimum Per Plate
	
	@FindBy(xpath = "//textarea[@name='1579_525_1_S']")
	@CacheLookup
	static
	
	WebElement highteaperplate;
	
	//Standard Boxed-food Menu Items
	
	@FindBy(xpath = "//textarea[@name='1580_525_1_S']")
	@CacheLookup
	static
	
	WebElement standardboxedmenu;
	
	//Boxed-food - Minimum Per Plate
	
	@FindBy(xpath = "//textarea[@name='1581_525_1_S']")
	@CacheLookup
	static
	
	WebElement boxedmenuperplate;
	
	//Next Page from category details
	
	@FindBy(xpath = "//button[@id='categorysubmit']")
	@CacheLookup
	static
	
	WebElement nextfromcat;
	
	
	
	public static void categorydet() throws IOException, InterruptedException {
		
		 
		 
		 SeleniumMethodsJava.configproperty();
		 
		 Thread.sleep(5000);
		 
		//Category
		 
		 Actions actions = new Actions(SeleniumMethodsJava.driver);
		 
		 //category.sendKeys();
		 
		 actions.moveToElement(category);
		 
		 actions.click();
		 
		 actions.sendKeys(propobj.getProperty("Categories"));
		 
		 actions.build().perform();
		 
		 Thread.sleep(8000);
		 
		 actions.moveToElement(clickCategory);
		 
		 actions.click();
		 
		 actions.build().perform();
		 
		 Thread.sleep(5000);
		 
		 //category.sendKeys(propobj.getProperty("Category"));
		 
		 
		 
		//selected state
		 
		 Select getservicestate = new Select(selectedstate);
		 
		 WebElement selectedproviderstate = getservicestate.getFirstSelectedOption();
		 
		 Thread.sleep(5000);
		 
		 //getservicestate.s
		 
		 String selectedserstate = selectedproviderstate.getText();
		 
		 System.out.println("Selected service state =  "+selectedserstate);
		 
         Select getservicedistrict = new Select(selecteddistrict);
		 
		 WebElement selectedproviderdistr = getservicedistrict.getFirstSelectedOption();
		 
		 String selectedserdistricte = selectedproviderdistr.getText();
		 
		 System.out.println("Selected service state =  "+selectedserdistricte);
		 
		 Thread.sleep(5000);
		 
		 Servicecategoryphotos.sendKeys("C:\\Users\\Prabhu\\Desktop\\usingforsel.jpeg");
		 
		 Thread.sleep(10000);
		 
		 clickcatattribue.click();
		 
		 Thread.sleep(10000);
		 
		 //cuisine
		 
		 cuisine.click();
		 
		 		/* for(WebElement cusElement : cuisine ) {
			 
			 
			 String cuisinedata = cusElement.getText();
			 
			 if(cuisinedata.equalsIgnoreCase("North Indian")) {
				 
				 cusElement.click();
				 
				 break;
				 
			 }
		 }*/
		 
		 //scroll down
		 
		 //SeleniumMethodsJava.scrolldown();
		 
		 
		 Thread.sleep(3000);
		 
			 //customer discount
			 
			 customerdiscount.sendKeys(propobj.getProperty("CustomerDiscount"));
			 
			 Thread.sleep(3000);
			 
			 //Service provider email
			 
			 provideremail.sendKeys(propobj.getProperty("EmailId"));
			 
			 Thread.sleep(3000);
			 
			 
			 //google place id
			 
			 googleplaceid.sendKeys(propobj.getProperty("GooglePlacesId"));
			 
			 Thread.sleep(10000);
			 
			 
			 //plate range
			 
			 rangeperplate.click();
			 
			/* for(WebElement ranElement: rangeperplate ) {
				 
				 
				 String getRangeelement = ranElement.getText();
				 
				 if(getRangeelement.equalsIgnoreCase("Below ₹250 per plate")){
					 
					 ranElement.click();
					 
				 }
				 
				 
			 }*/
			 
			 
			 
			// starting price
			 Thread.sleep(3000);
			 
			 startingprice.sendKeys(propobj.getProperty("StartingPriceperPlate"));
			 
			 Thread.sleep(10000);
			 
			 //cuis serverd Check box
			 
			 cuisserverd.click();
			 
			 Thread.sleep(3000);
			 
			// SeleniumMethodsJava.scrolldown();
			 
               /* for(WebElement cusServedElement: rangeperplate ) {
				 
				 
				 String getRangeelement = cusServedElement.getText();
				 
				 if(getRangeelement.equalsIgnoreCase("South Indian")){
					 
					 cusServedElement.click();
					 
				 }
				 
				 
			 }*/
			 
                
               //special items 
			 Thread.sleep(3000);
                
                specialitems.sendKeys(propobj.getProperty("WhatAreYourSpecialityItemsdishes"));
                
                Thread.sleep(3000);
                
                //establisted year
                
                establistedyear.sendKeys(propobj.getProperty("EstablishedInyear"));
                
                Thread.sleep(3000);
                //breakfast menu
                
                breakfastmenu.sendKeys(propobj.getProperty("StandardBreakfastMenuItems"));
                Thread.sleep(3000);
                
                //breakfast perplate
                
                breakfastperplate.sendKeys(propobj.getProperty("BreakfastMinimumPerPlate"));
                Thread.sleep(3000);
                
                //standard lunch
                
                standardlunch.sendKeys(propobj.getProperty("StandardLunchMenuItems"));
                Thread.sleep(3000);
                
                //lunchper plate
                
                lunchperplate.sendKeys(propobj.getProperty("LunchMinimumPerPlate"));
                Thread.sleep(3000);
                
                //standard dinner
                
                standarddinner.sendKeys(propobj.getProperty("StandardDinnerMenuItems"));
                Thread.sleep(3000);
                
                //dinnerperplate
                
                dinnerperplate.sendKeys(propobj.getProperty("DinnerMinimumPerPlate"));
                Thread.sleep(3000);
                
                //standard high tea menu
                
                standardhighteamenu.sendKeys(propobj.getProperty("StandardHighTeaMenuItems"));
                Thread.sleep(3000);
                
                //high tea per plate
                
                highteaperplate.sendKeys(propobj.getProperty("HighTeaMinimumPerPlate"));
                Thread.sleep(3000);
                
                //standard boxed menu
                
                standardboxedmenu.sendKeys(propobj.getProperty("StandardBoxedfoodMenuItems"));
                Thread.sleep(3000);
                
                //boxed menu per plate
                
                boxedmenuperplate.sendKeys(propobj.getProperty("BoxedfoodMinimumPerPlate"));
                Thread.sleep(5000);
                
                //next from cat
                
                nextfromcat.click();
                
                Thread.sleep(10000);
                
                System.out.println("Existing category page");
                
	}
	
}
		
	

