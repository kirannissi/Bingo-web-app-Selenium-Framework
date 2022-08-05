package com.gocollect.tests;

import org.testng.annotations.Test;

import com.gocollect.main.Base_Class_Browser;

public class TrucksTests extends Base_Class_Browser{
	@Test(description = "GCL_AUT20 -Verify drivers is launched successfully")
	public void verify_TrucksPage_launched() throws Exception {
		
		funLibrary.login();
		getPages.getruckspage().clickTruckItem().validatePageTitle();
		
	}
	@Test(description = "GCL_AUT21 -Truck Rego is searched successfully")
	public void search_TruckRego() throws Exception {
		// Logged-in with registered user
		funLibrary.login();
		//launch B&D workspace 
		getPages.getHomePage().selectBuildWorkspace();
		//verify successfully searched driver.
		getPages.getruckspage().clickTruckItem().searchTruckRego();
		
	}
}
