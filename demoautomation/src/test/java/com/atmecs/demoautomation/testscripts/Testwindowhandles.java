package com.atmecs.demoautomation.testscripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.demoauomation.constants.Constant;
import com.atmecs.demoautomation.helpers.Elementhelper;
import com.atmecs.demoautomation.pages.Windowspage;
import com.atmecs.demoautomation.testsuite.Basetest;
import com.atmecs.demoautomation.utils.PropertyReader;

public class Testwindowhandles extends Basetest {
	
	@Test
	public void windowHandle() {
		Windowspage windowpage=new Windowspage();
		windowpage.icons();
	}

}
