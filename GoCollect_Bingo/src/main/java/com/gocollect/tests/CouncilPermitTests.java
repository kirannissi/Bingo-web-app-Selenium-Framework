package com.gocollect.tests;

import org.testng.annotations.Test;

import com.gocollect.main.Base_Class_Browser;

public class CouncilPermitTests extends Base_Class_Browser {

	@Test(description = "GCL_AUT12 - Verify council permit page is loaded successfully")
	public void validateCouncilPage_launch() throws Exception {
		funLibrary.login();
		getPages.getHomePage().validatePageTitle().selectBuildWorkspace();
		getPages.getcouncilpage().clickOnConcil_Permit();
	}

}
