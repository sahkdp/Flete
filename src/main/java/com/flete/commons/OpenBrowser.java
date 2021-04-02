package com.flete.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser 
{
	public WebDriver driver;
	
	public WebDriver browserOpen(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			System.out.println(browser+" is opened");
			
	
		}else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/drivers/IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			System.out.println(browser+" is opened");
	
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			System.out.println(browser+" is opened");
	
		}else {
			System.out.println(browser+" is invalid");
		}
		driver.manage().window().maximize();
		return driver;
	}

}
