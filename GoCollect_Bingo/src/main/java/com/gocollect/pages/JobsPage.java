package com.gocollect.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.gocollect.main.FunLibrary;

public class JobsPage extends FunLibrary {

	// Click on Jobs module.
	public JobsPage clickOnJobs() {
		wait(2000);
		WebElement jabTab = findElement("xpath", "Jobs_tab");
		jabTab.click();
		return this;
	}

	// Crate a job button in Job module.
	public JobsPage clickCreateJobButton() {
		wait(2000);
		// Click_Button_Xpath(OR_OR.getProperty("CreateJobButton"), "CreateJobButton");
		WebElement createJob = findElement("xpath", "CreateJobButton");
		createJob.click();
		return this;
	}

	// Select a particular customer.
	public JobsPage selectCustomer() {
		wait(3000);
		Sendkey_xpath(OR_OR.getProperty("searchcustomer"), customer, "searchcustomer");
		wait(2000);
		WebElement searchCustomer = findElement("xpath", "searchcustomer");
		searchCustomer.sendKeys(Keys.ENTER);
		WebElement selectCustomer = findElement("xpath", "Choosecustomer");
		selectCustomer.click();
		Click_Button_Xpath(OR_OR.getProperty("selectCustomer"), "selectCustomer");
		return this;
	}

	// Select/Enter a Site and contact from add customer page.
	public JobsPage selectSite() {
		WebElement enterSite = findElement("xpath", "SiteInput");
		enterSite.sendKeys(OR_OR.getProperty("SiteInput"), Site, "Sitename");
		enterSite.sendKeys(Keys.TAB);
		wait(1000);
		// Sendkey_xpath(OR_OR.getProperty("SiteInput"),Site, "Sitename");
		// Enter customer site contact.
		WebElement enterSitContact = findElement("Xpath", "SiteContInput");
		enterSitContact.click();
		// enterSitContact.sendKeys(SiteContact);
		WebElement selectSitContact = findElement("xpath", "SiteItem");
		Select selectCont = new Select(selectSitContact);
		selectCont.selectByVisibleText(OR_OR.getProperty("SiteContact"));
		// Sendkey_xpath(OR_OR.getProperty("SiteContInput"),SiteContact, "Sitename");
		wait(3000);
		WebElement enterOrderBy = findElement("Xpath", "OrderByInput");
		enterOrderBy.clear();
		enterOrderBy.sendKeys(OrderBy);

		// enterOrderBy.sendKeys(OR_OR.getProperty("OrderByInput"),OrderBy, "Sitename");
		enterSitContact.sendKeys(Keys.TAB);
		/*
		 * //Enter customer Order by.
		 * Sendkey_xpath(OR_OR.getProperty("OrderByInput"),OrderBy, "Sitename");
		 */
		return this;
	}

	// Add customer details to schedule.
	public JobsPage addCustomerdetails() {
		// verify_xpath_contains_text("AddcustomerTitle", "Add Customer Details");
		Click_Button_Xpath(OR_OR.getProperty("ContinueToSchedule"), "ContinueToSchedulebutton");
		return this;
	}

	public JobsPage clickonDeliveryPickup() {
		Click_Button_Xpath(OR_OR.getProperty("clickDeliveryPickup"), "clickDeliveryPickup");
		return this;

	}

	// Select Site
	public JobsPage siteAdd() {
		// Click on site dropdown list
		WebElement site = findElement("xpath", "siteList");
		site.click();
		//Enter site name
		Click_Button_Xpath(OR_OR.getProperty("siteName"), "siteName");
		return this;
	}

	public JobsPage jobSchedule() {
		wait(2000);
		Click_Button_Xpath(OR_OR.getProperty("scheduleNewJobButton"), "scheduleNewJobButton");
		return this;
	}

	public JobsPage enterDelPickjob_details() {
		// Select Product Name from drop down.
		Click_Button_Xpath(OR_OR.getProperty("selectProductName"), "selectProductName");
		wait(2000);
		// Product list
		WebElement selectProduct = findElement("xpath", "productList");
		selectProduct.click();
		wait(2000);
		// to perform Scroll down to find element
		WebElement scrollDown = findElement("xpath", "BinLocation");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollDown);
		// Select Bin location
		Sendkey_xpath(OR_OR.getProperty("BinLocation"), binLocation, "BinLocation");
		// Click_Button_Xpath(OR_OR.getProperty("locationInput"),"locationInput");
		wait(1000);
		// Click on Save to Schedule Button.
		Click_Button_Xpath(OR_OR.getProperty("SaveToScheduleButton"), "SaveToScheduleButton");
		return this;
	}

	public JobsPage selectCashPayment() {
		wait(1000);
		// click on payment type drop down
		Click_Button_Xpath(OR_OR.getProperty("paymentType"), "paymentType");
		// select payment type cash
		WebElement selectCash = findElement("xpath", "paymentList");
		selectCash.click();
		return this;
	}

	public JobsPage clickSaveCreateJobButton() {
		// Click on Save & Create jobs button in Add payment details page.
		Click_Button_Xpath(OR_OR.getProperty("SaveCreateJobsButton"), "SaveCreateJobsButton");
		wait(5000);
		return this;
	}

	public JobsPage verifyJobCretedSuccessMessage() {
		// Job created successfully message
		verify_xpath_contains_text("jobcreatedmsg", "Success");
		return this;
	}

	public JobsPage clickOnChangeOverTab() {
		Click_Button_Xpath(OR_OR.getProperty("clickChangeOver"), "clickChangeOver");
		return this;
	}

	public JobsPage clickOnWaitLoadTab() {
		Click_Button_Xpath(OR_OR.getProperty("clickWaitLoad"), "clickWaitLoad");
		return this;
	}

	public JobsPage clickOnTipRunTab() {
		Click_Button_Xpath(OR_OR.getProperty("clickTipRun"), "clickTipRun");
		return this;
	}

	public JobsPage clickOnRelocationTab() {
		Click_Button_Xpath(OR_OR.getProperty("clickRelocation"), "clickRelocation");
		return this;
	}

	/**
	 * @return
	 */
	public JobsPage createChangeOverJob() {
		/*
		 * //Select Time slot
		 * Click_Button_Xpath(OR_OR.getProperty("ClickTimeslot"),"ClickTimeslot");
		 * 
		 * WebElement timeSlot = findElement("xpath","ClickTimeslot"); timeSlot.click();
		 * 
		 * WebElement timeSlotValue = findElement("xpath","selectTime");
		 * timeSlotValue.click(); wait(2000); //Click on Bin To Deliver to select list
		 * 
		 * WebElement binToDeliver = findElement("xpath", "selectBinToDeliver");
		 * binToDeliver.click();
		 * 
		 * driver.findElement(By.id(
		 * "_htmlForId_eogm2_1-deliverAssociatedProduct.product")).click();
		 * driver.findElement(By.
		 * cssSelector("#dx-fd142552-98bd-e9a9-b4a4-786f556844a7 > .dx-item-content")).
		 * click(); driver.findElement(By.id(
		 * "_htmlForId_eogm2_1-deliverAssociatedProduct.product")).
		 * sendKeys("6 Marrel Brick and Concrete - BD_BIN"); // // select Bin to deliver
		 * // Sendkey_xpath(OR_OR.getProperty("selectBinToDeliver"), BinToDeliver,
		 * "selectBinToDeliver"); // WebElement binList = findElement("xpath",
		 * "binToDeliveryList"); // binList.click(); // Enter Qty to pick and deliver
		 * Sendkey_xpath(OR_OR.getProperty("qtyToPickup"), QtyToPick, "qtyToPickup");
		 * Sendkey_xpath(OR_OR.getProperty("qtyToDeliver"), QtyToDeliver,
		 * "qtyToDeliver"); // Click on Save to Submit
		 * Click_Button_Xpath(OR_OR.getProperty("ChangeJobSaveButton"),
		 * "SaveToSchedule");
		 */

		Click_Button_Xpath(OR_OR.getProperty("ClickTimeslot"), "ClickTimeslot");
		WebElement timeSlotValue = findElement("xpath", "selectTime");
		timeSlotValue.click();
		WebElement binToDeliver = findElement("xpath", "selectBinToDeliver");
		binToDeliver.click();
		Sendkey_xpath(OR_OR.getProperty("selectBinToDeliver"), BinToDeliver, "selectBinToDeliver");
		WebElement binList = findElement("xpath", "binToDeliveryList");
		binList.click();

		return this;
	}

}
