package com.gocollect.tests;

import org.testng.annotations.Test;

import com.gocollect.main.Base_Class_Browser;

public class SalesSupportTests extends Base_Class_Browser {
	@Test(description = "GCL_AUT13 - Verify Sales Support page is launched.")
	public void validateSaleSupportPage_launch() throws Exception {
		funLibrary.login();
		getPages.getHomePage().validatePageTitle().selectBuildWorkspace();
		getPages.getsalesupportpage().clickOnSalesSupport();
	}
}
