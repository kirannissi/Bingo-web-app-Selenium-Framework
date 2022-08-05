/**
 * 
 */
package com.gocollect.pages;

public class GetPages {

	private LoginPage loginPage = null;
	private HomePage homePage = null;
	private DriversPage driverspage = null;
	private TrucksPage truckspage = null;
	private JobsPage jobspage = null;
	private SalesSupportPage salespage = null;
	private CouncilPage councilpage = null;
	private TrucksPage truckpage = null;

	// Login Page
	public LoginPage getLoginPage() {
		if (loginPage == null) {
			return new LoginPage();
		} else {
			return loginPage;
		}
	}

	// Home page
	public HomePage getHomePage() {
		if (homePage == null) {
			return new HomePage();
		} else {
			return homePage;
		}
	}
	
	//Drivers page
	public DriversPage getdriverspage() {
		if (driverspage == null) {
			return new DriversPage();
		} else {
			return driverspage;
		}
	}
	
	//Trucks page
	public TrucksPage getruckspage() {
		if (truckspage == null) {
			return new TrucksPage();
		} else {
			return truckspage;
		}
	}

	// Jobs Page
	public JobsPage getjobspage() {
		if (jobspage == null) {
			return new JobsPage();
		} else {
			return jobspage;
		}
	}

	// Sales support page
	public SalesSupportPage getsalesupportpage() {
		if (salespage == null) {
			return new SalesSupportPage();
		} else {
			return salespage;
		}
	}

	// Council permit page
	public CouncilPage getcouncilpage() {
		if (councilpage == null) {
			return new CouncilPage();
		} else {
			return councilpage;
		}
	}
}
