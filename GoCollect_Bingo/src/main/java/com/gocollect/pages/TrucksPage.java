package com.gocollect.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.gocollect.main.FunLibrary;

public class TrucksPage extends FunLibrary {

	// Click on Trucks menu item
	public TrucksPage clickTruckItem() throws Exception {
		Click_Button_Xpath(OR_OR.getProperty("truck_Module"), "launch truck page");
		return this;
	}

	public TrucksPage validatePageTitle() {
		
		//validate title
		verify_xpath_contains_text(OR_OR.getProperty("truck_page_title"), "TRUCKS" );
		return this;

	}
	//search truck Rego
		public TrucksPage searchTruckRego() {
			
			  //Enter Truck Rego to search
			  Sendkey_xpath(OR_OR.getProperty("search_truckRego"), truckRego,
			 "Search Truck Rego from list"); wait(2000);
			 
			//verify driver grid display search truck rego.
			verify_xpath_contains_text(OR_OR.getProperty("truck_grid"), truckRego);
			return this;
		}
}