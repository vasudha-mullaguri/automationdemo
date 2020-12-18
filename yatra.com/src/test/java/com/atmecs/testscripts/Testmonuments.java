package com.atmecs.testscripts;

import org.testng.annotations.Test;

import com.yatra.pages.Monumentspage;
import com.yatra.testsuite.Basetest;


public class Testmonuments extends Basetest{
	
	@Test
	public void monuments() throws InterruptedException{
	
		Monumentspage monuments=new Monumentspage(driver);
		
		monuments.monumentDetails();

	
	}	
}
