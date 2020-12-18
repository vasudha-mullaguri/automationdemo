package com.yatra.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import com.yatra.constants.Constant;
import com.yatra.utils.Logreports;
import com.yatra.utils.PropertyReader;




public class Basetest {
	public Properties properties;
	public  WebDriver driver;
	String baseUrl;
	String browser;
	Logreports log=new Logreports();
	
	@BeforeMethod
	public void invokeBrowser() {

		properties = PropertyReader.readProperties(Constant.CONFIG_FILE);

		baseUrl = properties.getProperty("Url");
		browser=properties.getProperty("Browser_name");
	
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",Constant.CHROME_FILE);
			driver = new ChromeDriver(); 
			log.info("chrome launched successfully");
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver",Constant.FIREFOX_FILE);	
			driver = new FirefoxDriver(); 
		}

		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("url launched successfully");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
