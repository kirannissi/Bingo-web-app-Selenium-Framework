package com.gocollect.pages;

import com.gocollect.main.FunLibrary;

public class SalesSupportPage extends FunLibrary {

	public SalesSupportPage clickOnSalesSupport() {
		// Click on Sales Support module
		Click_Button_Xpath(OR_OR.getProperty("salesSupportModule"), "Sales Support page");
		return this;
	}

}
