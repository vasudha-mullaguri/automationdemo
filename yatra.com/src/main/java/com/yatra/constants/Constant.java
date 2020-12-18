package com.yatra.constants;

public class Constant {
	public final static String PROJECT_BASE_PATH = System.getProperty("user.dir");
	
	/* Configuration properties*/

	public static final String CONFIG_FILE = PROJECT_BASE_PATH+"./src/main/resources/config.properties";
	
	/* driver properties*/

	public static final String CHROME_FILE = PROJECT_BASE_PATH+"./lib/chromedriver_win32/chromedriver.exe";
	public static final String FIREFOX_FILE = PROJECT_BASE_PATH+"./lib/geckodriver-v0.28.0-win64/geckodriver.exe";
   
	/* log4j properties*/
	public static final String LOG4J_FILE = PROJECT_BASE_PATH+"./log/log4j.properties";
	
	/* locator properties*/
	public static final String HOMEPAGE_FILE = PROJECT_BASE_PATH+"./src/main/resources/locators/homepage.properties";
	public static final String FLIGHTSELECTION_FILE = PROJECT_BASE_PATH+"./src/main/resources/locators/flightselctionpage.properties";
	public static final String REVIEWDETAILS_FILE = PROJECT_BASE_PATH+"./src/main/resources/locators/reviewflightdetailspage.properties";
	public static final String MONUMENT_FILE = PROJECT_BASE_PATH+"/src/main/resources/locators/monumentspage.properties";
	
	/* testdata properties*/
	
	public static final String DATA_FILE = PROJECT_BASE_PATH+"./src/main/resources/testdata/yatra.xlsx";
	
	

}
