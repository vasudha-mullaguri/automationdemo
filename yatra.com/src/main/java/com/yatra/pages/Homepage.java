package com.yatra.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.yatra.constants.Constant;
import com.yatra.helpers.Elementhelper;
import com.yatra.utils.Logreports;
import com.yatra.utils.PropertyReader;

public class Homepage {
	Properties homepage_path;
	public WebDriver driver;
	  Logreports log=new Logreports();
	public Homepage(WebDriver driver){
		this.driver=driver;
	}
	
	public void searchFlights(String From, String To) throws InterruptedException{
		Elementhelper helper=new Elementhelper(driver);
		
		homepage_path=PropertyReader.readProperties(Constant.HOMEPAGE_FILE);
	
		//close ads
		helper.closeAdWindow(homepage_path.getProperty("loc_iframe_ad"),homepage_path.getProperty("loc_iframe_close_window"));
		
		//click on round trip
		helper.clickandWait(homepage_path.getProperty("loc_roundtrip"));
		
		//click and send departure city
		helper.sendKeys(homepage_path.getProperty("loc_departure_city"), From);
		
		//click on arrival city
		helper.clickandWait(homepage_path.getProperty("loc_select_city"));
		
		//send an arrival city
		helper.sendKeys(homepage_path.getProperty("loc_arrival_city"), To);
		
		helper.clickandWait(homepage_path.getProperty("loc_select_city_arrival"));
		
		//click on departure field
		helper.clickandWait(homepage_path.getProperty("loc_departuredate_field"));
		
		//click on departure date
		helper.clickandWait(homepage_path.getProperty("loc_departure_date"));
		
		//click on arrival date field
		helper.clickandWait(homepage_path.getProperty("loc_arrival_date_field"));
		
		//click on arrival date
		helper.clickandWait(homepage_path.getProperty("loc_arrival_date"));
		
		//click on arrow
		helper.clickandWait(homepage_path.getProperty("loc_classtype_arrow"));
		
		//click on bussiness radio button
		helper.clickandWait(homepage_path.getProperty("loc_classtype_business"));
		
		//click on search button
		helper.clickandWait(homepage_path.getProperty("loc_searchflight_button"));
		
		
	}

}
