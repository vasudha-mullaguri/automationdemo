package com.yatra.pages;

import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yatra.constants.Constant;
import com.yatra.helpers.Elementhelper;
import com.yatra.utils.Logreports;
import com.yatra.utils.PropertyReader;

public class Monumentspage {
	
	public WebDriver driver;
	
	public Monumentspage(WebDriver driver){
		this.driver=driver;
    }
	public Properties monument_path=PropertyReader.readProperties(Constant.MONUMENT_FILE);
	public Properties homepage_path=PropertyReader.readProperties(Constant.HOMEPAGE_FILE);
	
	Logreports log=new Logreports();
	  
	  
	  
	public void monumentDetails() throws InterruptedException{
		
		  Elementhelper helper=new Elementhelper(driver);
		  
		 // helper.clickandWait(monument_path.getProperty("loc_logo_yatra"));
		  
		  helper.closeAdWindow(homepage_path.getProperty("loc_iframe_ad"),homepage_path.getProperty("loc_iframe_close_window"));
		  
		  helper.mouseMoveOver(monument_path.getProperty("loc_more"));
		  
		  helper.clickandWait(monument_path.getProperty("loc_monuments"));
		  
		  helper.isDisplayed(monument_path.getProperty("loc_top"));
		  
		  List <WebElement> elements = helper.findElements(monument_path.getProperty("loc_list_monuments"));
		  
		  for(int i=0; i<elements.size(); i++){
			 log.info("images Displayed"+elements.get(i).isDisplayed()); 
		  }

  }
     
	 
}
