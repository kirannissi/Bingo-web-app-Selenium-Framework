package com.gocollect.tests;
import org.testng.annotations.Test;

import com.gocollect.main.Base_Class_Browser;

public class HomePageTests extends Base_Class_Browser {

	@Test(description = "GCL_AUT02 -Verify Home page is loaded successfully")
	public void validateHomePage_LoggedInUser() throws Exception {
		// Logged-in with registered user
		funLibrary.login();
		
		//Validate home page 
		 getPages.getHomePage().validatePageTitle().selectBuildWorkspace();
	}
	
}
