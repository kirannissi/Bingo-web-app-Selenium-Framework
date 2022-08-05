package com.gocollect.pages;

import com.gocollect.main.FunLibrary;

public class CouncilPage extends FunLibrary{

	public CouncilPage clickOnConcil_Permit() {
		// Click on council permit module.
		Click_Button_Xpath(OR_OR.getProperty("councilModule"), "Council Permit page");
		//verify council permit page 
		verify_xpath_contains_text(OR_OR.getProperty("CouncilTitle"), "Council Permit");
		return this;
	}
}
