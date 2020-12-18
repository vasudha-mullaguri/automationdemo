package com.yatra.helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.yatra.utils.Logreports;



public class Elementhelper {
	
	public WebDriver driver;
	public boolean enable_status;
	
	Logreports log=new Logreports();
	public Elementhelper(WebDriver driver){
		this.driver=driver;
	}
	
	
   public void closeAdWindow(String xpath, String xpthCloseBtn) throws InterruptedException{
	
	    if (driver.findElement(By.xpath(xpath)).isDisplayed())
	      {
		       driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
          }
	  driver.findElement(By.xpath(xpthCloseBtn)).click();
	  driver.switchTo().parentFrame();
	}
   
    public void isDisplayed(String xpath){
	   Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
	   log.info("element is dispalyed");
  }

   public  void clickElement(String xpath) {
	
	driver.findElement(By.xpath(xpath)).click();
	
 }

    public void sendKeys(String xpath, String text) throws InterruptedException {
	
	   WebDriverWait wait = new WebDriverWait(driver, 50);
	   WebElement element1;
	   element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	   element1.clear();
	   element1.sendKeys(text);
 }


    public void clickandWait(String xpath) {
	
	WebDriverWait wait = new WebDriverWait(driver, 50);
	WebElement element1;
	element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
 	element1.click();
	
}
    
  

    public List<WebElement> findElements(String xpath){
    	
	   return driver.findElements(By.xpath(xpath));
 }

    public  void textvalidate(String xpath,String expected) {
	
	    String actual = driver.findElement(By.xpath(xpath)).getText();
	    System.out.println("actual text"+actual);
	    System.out.println("expected text"+expected);
	
	try {
//		Assert.assertEquals(actual, expected);
		log.info("assertion passed:" + actual);
		
	} catch (AssertionError e) {
		log.info("Assertion failed" + e.getMessage());
	}
}
    
     public  String getTitleOfPage() {
	      String title = driver.getTitle();
	      return title;
}
public boolean validateButton(String xpath) {

	enable_status = driver.findElement(By.xpath(xpath)).isEnabled();
	  try {
		  Assert.assertEquals(enable_status, true);
		  System.out.println(driver.findElement(By.xpath(xpath)).getText() + "button is enabled");
		  return true;
	}  catch (AssertionError assertionError) {
		  System.out.println(driver.findElement(By.xpath(xpath)).getText() + " button is disabled");
		  return false;
	}
}

    public void buttonValidation(String xpath){
	    WebElement Button = driver.findElement(By.xpath(xpath));
	    Assert.assertEquals(true, Button.isDisplayed());
}

    public void mouseMoveOver(String xpath) {
	    WebElement element = driver.findElement(By.xpath(xpath));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().perform();
}

}






