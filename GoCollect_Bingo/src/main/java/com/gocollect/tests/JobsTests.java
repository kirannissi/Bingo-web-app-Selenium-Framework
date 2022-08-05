package com.gocollect.tests;

import org.testng.annotations.Test;

import com.gocollect.main.Base_Class_Browser;

public class JobsTests extends Base_Class_Browser {

	@Test(description = "GCL_AUT03 - Verify create Job page is loaded successfully")
	public void validateJobPage_CreateJob() throws Exception {
		funLibrary.login();
		getPages.getHomePage().validatePageTitle().selectBuildWorkspace();
		getPages.getjobspage().clickOnJobs();
		// getPages.getHomePage().clickMyAccount().clickLogout();
	}

	@Test(description = "GCL_AUT04 - Verify Deliver Job created successfully")
	public void validateJobPage_DelPickJob() throws Exception {
		funLibrary.login();
		getPages.getHomePage().validatePageTitle().selectBuildWorkspace();
		getPages.getjobspage().clickOnJobs().clickCreateJobButton().selectCustomer().siteAdd().addCustomerdetails()
				.jobSchedule().enterDelPickjob_details().selectCashPayment().clickSaveCreateJobButton();

	}

	@Test(description = "GCL_AUT05 - Verify Change OVer job created successfully")
	public void validateJobPage_changeOverJob() throws Exception {
		funLibrary.login();
		getPages.getHomePage().validatePageTitle().selectBuildWorkspace();
		getPages.getjobspage().clickOnJobs().clickCreateJobButton().selectCustomer().selectSite().addCustomerdetails()
				.jobSchedule().clickOnChangeOverTab().createChangeOverJob();
	}

	@Test(description = "GCL_AUT06- Verify Wait Load job created successfully")
	public void validateJobPage_waitLoadJob() throws Exception {
		getPages.getjobspage().clickOnWaitLoadTab().enterDelPickjob_details().clickSaveCreateJobButton();
	}

	@Test(description = "GCL_AUT07- Verify Tip and Run job created successfully")
	public void validateJobPage_tipandrunJob() throws Exception {
		getPages.getjobspage().clickOnTipRunTab().enterDelPickjob_details().clickSaveCreateJobButton();
	}

	@Test(description = "GCL_AUT05- Verify Relocate job created successfully")
	public void validateJobPage_relocateJob() throws Exception {
		getPages.getjobspage().clickOnRelocationTab().enterDelPickjob_details().clickSaveCreateJobButton();
	}

}
