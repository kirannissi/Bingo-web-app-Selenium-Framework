package com.gocollect.tests;

import org.testng.annotations.Test;

import com.gocollect.main.Base_Class_Browser;

public class DriversTests extends Base_Class_Browser {

	@Test(description = "GCL_AUT14 -Verify drivers is launched successfully")
	public void validateDriversPage_launched() throws Exception {
		// Logged-in with registered user
		funLibrary.login();
		// Validate home page
		getPages.getdriverspage().clickDriversModule();
	}

	@Test(description = "GCL_AUT15 -Verify driver is searched successfully")
	public void validateDrivers_Searched_successfully() throws Exception {
		// Logged-in with registered user
		funLibrary.login();
		//launch B&D workspace 
		getPages.getHomePage().selectBuildWorkspace();
		//verify successfully searched driver.
		getPages.getdriverspage().clickDriversModule().searchDriver();
		
	}

}
