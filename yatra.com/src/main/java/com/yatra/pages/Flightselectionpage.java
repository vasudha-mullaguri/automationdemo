package com.yatra.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.yatra.constants.Constant;
import com.yatra.helpers.Elementhelper;
import com.yatra.utils.Logreports;
import com.yatra.utils.PropertyReader;

public class Flightselectionpage {
	public WebDriver driver;
	
	public Flightselectionpage(WebDriver driver){
		this.driver=driver;
	}
	
	public Properties selection_path=PropertyReader.readProperties(Constant.FLIGHTSELECTION_FILE);
	
	
	  Logreports log=new Logreports();
	  
	  //verify page title
	  public void verifyFlightListPage(){
		  Elementhelper helper=new Elementhelper(driver);
		  log.info(helper.getTitleOfPage()); 
	  }
	  
	  //method to click departure and arrival flights
	  public void selectFlights(){
		  
		  Elementhelper helper=new Elementhelper(driver);
		    
		  helper.clickandWait(selection_path.getProperty("loc_departure"));
		  
		  helper.clickandWait(selection_path.getProperty("loc_return"));	  
	  }
	  
	  //method to verify the details of the selected flights
	  public void validateFlightDetails(){
		  
		  Elementhelper helper=new Elementhelper(driver);
		  
		  helper.textvalidate(selection_path.getProperty("loc_total_fare"),"43,963");
		  
		  }
	  
	  //method to click on button
	  public void clickOnBook(){
		  Elementhelper helper=new Elementhelper(driver);
		  
		  helper.clickandWait(selection_path.getProperty("loc_booknow_btn"));
		  
		  
	  }
	  
	  public void flightSelection(){
		  
		  verifyFlightListPage();
		  selectFlights();
		  validateFlightDetails();
		  clickOnBook();
		  
		  
	  }
	

}
