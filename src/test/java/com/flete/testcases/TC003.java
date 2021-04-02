package com.flete.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flete.commons.Commons;

public class TC003 extends Commons
{
WebDriver driver;
	
	
	@Parameters("browser")
	@Test
public void tc003(String browser) throws Exception 
	{
		driver=ob.browserOpen(browser);
	
			
		
		navigateURL(driver);
		
		
			 String actualUrl=driver.getCurrentUrl();
			 validateText(driver, url, actualUrl);
				
			  String actualtitle=driver.getTitle();
			  validateText(driver, "Flete Private Limited", actualtitle);
				validatePageText(driver, "(//footer[contains(@class,'site-footer')]//span)[1]", "About Us");
			  
				 clickButton(driver, "//a[@href=\"https://www.facebook.com/flete.in/\"][1]","Facebook Icon");
				  backButton(driver);
				  
				  clickButton(driver, "//a[@href=\"https://twitter.com/FLETE18\"][1]","Facebook Icon");
				  backButton(driver);
				  clickButton(driver, "//i[@class=\"fa fa-linkedin\"][1]","Facebook Icon");
				  backButton(driver);
				  clickButton(driver, "//i[@class=\"fa fa-youtube\"][1]","Facebook Icon");
				  backButton(driver);
				  validatePageText(driver, "//*[text()='info@flete.in']", "info@flete.in");
			  validatePageText(driver, "//*[contains(text(),'Flat No.')]", "Flat No. 401, Sri Kireeti Vishnavi Arca");
			  validatePageText(driver, "//i[contains(@class,'home')]/following-sibling::span", "Kakatiya Hills, Kavuri Hills, Hyderabad, Telangana, 500033");
			  validatePageText(driver, "//*[text()='24/7']", "24/7");
			  validatePageText(driver, "//i[contains(@class,'clock')]/following-sibling::span", "Support Available");
			  
			  
				
			validatePageText(driver, "//a[contains(text(),'Flete An')]", "Flete An Awesome Logistic App");
			validatePageText(driver, "//i[contains(@class,'phone')]/following-sibling::h3", "+91-9182096413");
	} 

}
