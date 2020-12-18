package com.atmecs.testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yatra.constants.Constant;
import com.yatra.pages.Flightselectionpage;
import com.yatra.pages.Homepage;
import com.yatra.pages.Reviewflightdetailspage;
import com.yatra.testsuite.Basetest;
import com.yatra.utils.ExcelReading;

public class Testbookflights extends Basetest{
	
	@DataProvider
	public Object[][] getExcelData()
	{
		Object[][] data =ExcelReading.getTestData("homedata",Constant.DATA_FILE);
		return data;
	}
	
	@Test(dataProvider="getExcelData")
	
	public void flightBooking(String From, String To) throws InterruptedException{
		
		Homepage home=new Homepage(driver);
		home.searchFlights(From,To);
		
		Flightselectionpage flight=new Flightselectionpage(driver);
		
		flight.flightSelection();
		
		
		Reviewflightdetailspage review=new Reviewflightdetailspage(driver);
		
		review.verifyFlightDetails();
		
		review.validateFlightDetails();
		
	}
	
    
}
