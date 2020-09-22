package com.atmecs.demoautomation.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.demoauomation.constants.Constant;
import com.atmecs.demoautomation.helpers.Elementhelper;
import com.atmecs.demoautomation.utils.PropertyReader;

public class Windowspage {
	
	WebDriver driver;
	
	public void icons(){
		
	  Elementhelper elementhelper=new Elementhelper(driver);
	  
	//performing for facebook link
	elementhelper.switchToWindow(Constant.WINDOWHANDLE_FILE, "Facebook_link");
	//performing for twitter link
	elementhelper.switchToWindow(Constant.WINDOWHANDLE_FILE,"Twitter_link");
	//performing for link
	elementhelper.switchToWindow(Constant.WINDOWHANDLE_FILE,"Linkedin_link");
	//performing for youtube link
    elementhelper.switchToWindow(Constant.WINDOWHANDLE_FILE,"Youtube_link");
    //performing for google plus
    elementhelper.switchToWindow(Constant.WINDOWHANDLE_FILE,"Google_plus_link");
}
}
