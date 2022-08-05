package com.gocollect.pages;

import com.gocollect.main.FunLibrary;

public class DriversPage extends FunLibrary{
	
	//Click on drivers go-collect menu
	public DriversPage clickDriversModule() {
		//Click on Drivers
		Click_Button_Xpath(OR_OR.getProperty("driver_Module"), "Drivers page is launched");
		//verify driver page tab title
		verify_xpath_contains_text(OR_OR.getProperty("driver_page_title"), "DRIVERS");
		return this;
	}
	
	//search driver 
	public DriversPage searchDriver() {
		//Enter driver first name to search
		Sendkey_xpath(OR_OR.getProperty("search_driver"), driver_firstname, "Search driver from list");
		wait(2000);
		//verify driver grid display search driver.
		verify_xpath_contains_text(OR_OR.getProperty("driver_grid"), "Tester(14)");
		return this;
	}

}
