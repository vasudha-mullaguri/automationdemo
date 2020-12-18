package com.yatra.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.yatra.constants.Constant;
import com.yatra.helpers.Elementhelper;
import com.yatra.utils.Logreports;
import com.yatra.utils.PropertyReader;

public class Reviewflightdetailspage {
	public Reviewflightdetailspage(WebDriver driver){
		this.driver=driver;
	}
	
	Properties review_path=PropertyReader.readProperties(Constant.REVIEWDETAILS_FILE);;
	public WebDriver driver;
	
	
	  Logreports log=new Logreports();
	  
	  //method to verify the review page
	  public void verifyFlightDetails(){
		  
		  Elementhelper helper=new Elementhelper(driver);
		  
		  helper.textvalidate(review_path.getProperty("loc_reviewbooking"), "Review Your Booking");
		  
	 }
	  
	  //method to verify the details of flight in the review page
	  public void validateFlightDetails(){
		  
		  Elementhelper helper=new Elementhelper(driver);
		  
         helper.textvalidate(review_path.getProperty("loc_departure_flight_intime"), "13:15");
         helper.textvalidate(review_path.getProperty("loc_return_flight_intime"), "06:10");
         helper.textvalidate(review_path.getProperty("loc_departure_flight_totime"), "16:00");
         helper.textvalidate(review_path.getProperty("loc_return_flight_totime"), "09:00");
         helper.textvalidate(review_path.getProperty("loc_flight_name_dept"), "Vistara Business");
         helper.textvalidate(review_path.getProperty("loc_flight_name_arrival"), "Air India");

	  }
}
