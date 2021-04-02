package com.flete.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Commons
{
		public OpenBrowser ob = new OpenBrowser();
		public String url="http://www.flete.in/";

	public void navigateURL(WebDriver driver)
	{
		try {
		driver.get(url);
		
		System.out.println(url+ " is entered");
		Reporter.log(url+ " is entered");
		}catch (Exception e) {
			System.out.println(url + " is not valid - "+e.getMessage());
			Reporter.log(url+ " is not valid - "+e.getMessage());
		}
	}
	
	public void validateText(WebDriver driver,String expectedText, String actualText)
	{
		try
		{
		 if (actualText.equals(expectedText)) {
				System.out.println(expectedText+" is matched with "+actualText);
			}else {
				System.out.println(expectedText+" is not matched with "+actualText);
			}
		}catch (Exception e) {
		System.out.println("Validate Text is not working - " + e.getMessage());
		}
	}
	
	public void validatePageText(WebDriver driver,String xpathvalue,String expectedValue) 
	{
		try
		{
			String actualValue = driver.findElement(By.xpath(xpathvalue)).getText();
			validateText(driver, expectedValue, actualValue);
		}catch(Exception e)
		{
			System.out.println("Validate Page Text is not working - " + e.getMessage());
		}
	}
	
	public void enterText(WebDriver driver,String xpathvalue,String enterValue) 
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).clear();
			driver.findElement(By.xpath(xpathvalue)).sendKeys(enterValue);
		}catch(Exception e)
		{
			System.out.println("Enter Text method is not working - " + e.getMessage());
		}
	}
	public void clickButton(WebDriver driver,String xpathvalue,String value) 
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).click();
			System.out.println(value+" is clicked");
		}catch(Exception e)
		{
			System.out.println("Enter click method is not working - " + e.getMessage());
		}
	}
	
	public void backButton(WebDriver driver) 
	{
		try
		{
		driver.navigate().back();
		System.out.println("Back button is clicked");
		}catch(Exception e)
		{
			System.out.println("Enter click method is not working - " + e.getMessage());
		}
	}
	
	
}
