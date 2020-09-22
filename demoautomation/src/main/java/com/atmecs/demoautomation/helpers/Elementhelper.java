package com.atmecs.demoautomation.helpers;

import java.awt.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.demoauomation.constants.Constant;
import com.atmecs.demoautomation.testsuite.Basetest;
import com.atmecs.demoautomation.utils.PropertyReader;

import bsh.org.objectweb.asm.Constants;
import junit.framework.Assert;

public class Elementhelper {
WebDriver driver;
	
    
	public  void clickElement(WebDriver driver,String path,String element) {
		Properties loc_path=PropertyReader.readProperties(path);
		String xpath=loc_path.getProperty(element);
		driver.findElement(By.xpath(xpath)).click();
	}

	public void sendKeys(WebDriver driver,String path, String details_path,String element, String text) {
		Properties loc_path= PropertyReader.readProperties(path);
		Properties properties= PropertyReader.readProperties(details_path);
		String xpath=loc_path.getProperty(element);
		String data=properties.getProperty(text);
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}

	
	public  void explicitWait(WebDriver driver,String path, String element) {
		Properties loc_path= PropertyReader.readProperties(path);
		String xpath=loc_path.getProperty(element);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
     	element1.click();
	}
	public void selectFromDropdown(WebDriver driver,String path,String value_path,String element,String valueToSelect)
	{
		Properties loc_path= PropertyReader.readProperties(path);
		String xpath=loc_path.getProperty(element);
		Properties properties = PropertyReader.readProperties(value_path);
		String value=properties.getProperty(valueToSelect);
	Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
	dropdown.selectByVisibleText(value);
	}
	
	public void switchToWindow(WebDriver driver,String path,String element) {
		Properties window_path=PropertyReader.readProperties(path);
		String xpath=window_path.getProperty(element);
		String parentWindow=driver.getWindowHandle();
		WebElement key=driver.findElement(By.xpath(xpath));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(key));
		key.click();
		Set<String> windowhandle=driver.getWindowHandles();
		for(String window : windowhandle){
			if(!window.equals(parentWindow))
				driver.switchTo().window(window);
		}
		String childWindowTitle=driver.getTitle();
		System.out.println("childwindow:"+childWindowTitle);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("switched to parent window:"+driver.getTitle());
	}
	
	public static void textvalidate(WebDriver driver, String xpath, String expected) {
		String actual = driver.findElement(By.xpath(xpath)).getText();
		
		try {
			Assert.assertEquals(actual, expected);
			System.out.println("assertion passed:" + actual);
		} catch (AssertionError e) {
			System.out.println("Assertion failed" + e.getMessage());
		}
	}

}


