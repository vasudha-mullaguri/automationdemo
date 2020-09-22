package com.atmecs.demoautomation.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.demoauomation.constants.Constant;
import com.atmecs.demoautomation.helpers.Elementhelper;
import com.atmecs.demoautomation.pages.Homepage;
import com.atmecs.demoautomation.testsuite.Basetest;
import com.atmecs.demoautomation.utils.PropertyReader;

public class Testhomepage extends Basetest{
	
	@Test
	public void submitDetails(){
	Homepage homepage=new Homepage();
	homepage.formDetails();
	
}
}