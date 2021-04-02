package com.flete.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flete.commons.Commons;

public class TC001 extends Commons
{
	WebDriver driver;
	
	
	@Parameters("browser")
	@Test
public void tc001(String browser) throws Exception 
	{
		driver=ob.browserOpen(browser);
	
		/*
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir")+"/drivers/chromedriver.exe"); driver=new
		 * ChromeDriver(); System.out.println(browser+" is opened");
		 * 
		 * 
		 * }else if(browser.equalsIgnoreCase("ie")) {
		 * System.setProperty("webdriver.ie.driver",
		 * System.getProperty("user.dir")+"/drivers/IEDriverServer.exe"); driver=new
		 * InternetExplorerDriver(); System.out.println(browser+" is opened");
		 * 
		 * }else if(browser.equalsIgnoreCase("firefox")) {
		 * System.setProperty("webdriver.gecko.driver",
		 * System.getProperty("user.dir")+"/drivers/geckodriver.exe"); driver=new
		 * FirefoxDriver(); System.out.println(browser+" is opened");
		 * 
		 * }else { System.out.println(browser+" is invalid"); }
		 */
			
			//driver.get(url);
		
		navigateURL(driver);
		
		
			 String actualUrl=driver.getCurrentUrl();
			 validateText(driver, url, actualUrl);
				/*
				 * if (url.equals(actualUrl)) {
				 * System.out.println(url+" is matched with "+actualUrl); }else {
				 * System.out.println(url+" is not matched with "+actualUrl); }
				 */
			  String actualtitle=driver.getTitle();
			  validateText(driver, "Flete Private Limited", actualtitle);
				/*
				 * if (actualtitle.equals("Flete private Limited")) {
				 * System.out.println(actualtitle+" is displayed"); }else {
				 * System.out.println(actualtitle+" is not displayed"); }
				 */
			validatePageText(driver, "//a[contains(text(),'Flete An')]", "Flete An Awesome Logistic App");
			validatePageText(driver, "//i[contains(@class,'phone')]/following-sibling::h3", "+91-9182096413");
	} 
}
