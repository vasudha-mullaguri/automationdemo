package com.atmecs.demoautomation.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.demoauomation.constants.Constant;
import com.atmecs.demoautomation.helpers.Elementhelper;
import com.atmecs.demoautomation.utils.PropertyReader;

public class Homepage {

   WebDriver driver;	

	public void formDetails(){
		
		Elementhelper elementhelper=new Elementhelper(driver);
		
		elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Firstname","First_Name");

		elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Lastname","Last_Name");
		
		elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Address","Address");
		
		elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Email","Email");
		
		elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE, "phonenumber","phone_Number");
		
		elementhelper.clickElement(Constant.HOMEPAGE_FILE, "Gender_radiobutton");
		
		elementhelper.clickElement(Constant.HOMEPAGE_FILE, "Hobbies_Checkbox");
		
		//click on language
		elementhelper.explicitWait(Constant.HOMEPAGE_FILE, "Language_dropdown");
		
		elementhelper.explicitWait(Constant.HOMEPAGE_FILE, "Language_list");
		
		
		//click on skills
         elementhelper.selectFromDropdown(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Skill_dropdown","skills_data");
 		
        //click on country
        elementhelper.selectFromDropdown(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"countries_dropdown","country_data");
		
        
        //clik on select on country
        elementhelper.selectFromDropdown(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"selectcountry_dropdown","selectcountry_data");
       // Commonhelpers.explicitWait(driver, loc_path.getProperty("selectcountry_dropdown"));
        
        //Commonhelpers.explicitWait(driver, loc_path.getProperty("selectcountry_list"));
        
        //click on year
        elementhelper.selectFromDropdown(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"year_dropdown","year_data");
        
        //click on month
        elementhelper.selectFromDropdown(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Month_dropdown","month_data");
        
        //click on date
        elementhelper.selectFromDropdown(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE,"Date_dropdown","date_data");
        
        //click on password
        elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE, "First_password","First_password_data");
        
		//click on second password
        elementhelper.sendKeys(Constant.HOMEPAGE_FILE,Constant.CONFIG_FILE, "Second_password","Second_password_data");
        
        //click on submit
        elementhelper.clickElement(Constant.HOMEPAGE_FILE,"submit_button");
		
		
	}


}
