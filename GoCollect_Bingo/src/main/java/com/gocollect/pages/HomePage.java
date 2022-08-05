package com.gocollect.pages;

import org.openqa.selenium.WebElement;

import com.gocollect.main.FunLibrary;

public class HomePage extends FunLibrary {

	public HomePage clickWelcomeBackOKButton() {
		ExplicitWait(OR_OR.getProperty("AfterLogin_Popup_Header"), "AfterLogin_Popup_Header", 75);
		verify_xpath_text(OR_OR.getProperty("AfterLogin_Popup_Header"), "Welcome Back!");
		Click_Button_Xpath(OR_OR.getProperty("AfterLogin_Popup_StartShopping_Button"),
				"AfterLogin_Popup_StartShopping_Button");
		return this;
	}
	
	public HomePage clickMyAccount() {
		ExplicitWait(OR_OR.getProperty("Account_Name"), "Account_Name", 10);
		Click_Button_Xpath(OR_OR.getProperty("Account_Name"), "Account_Name");
		return this;
	}
	
	public HomePage clickLogout() {
		ExplicitWait(OR_OR.getProperty("Logout_Button"), "Logout_Button", 1);
		Click_Button_Xpath(OR_OR.getProperty("Logout_Button"), "Logout_Button");
		wait(2000);
		return this;
	}

	/*
	 * public HomePage validateSuccessMsg() {
	 * ExplicitWait(OR_OR.getProperty("AfterLogin_Popup_Msg"),
	 * "AfterLogin_Popup_Msg", 5);
	 * verify_xpath_text(OR_OR.getProperty("AfterLogin_Popup_Msg"),
	 * OR_OR.getProperty("AfterLogin_Popup_Expected_Msg")); Assert(); return this; }
	 */

	public HomePage validatePageTitle() {
		wait(8000);
		String title = driver.getTitle();
		if (title.contentEquals("Go-Collect by Bingo")) {
			testLog.info("Go-Collect by Bingo");
		} else {
			testLog.error("Title is incorrect");
			assertCheck("validatePageTitle", "Title is incorrect");
		}
		return this;
	}

	
	public HomePage selectBuildWorkspace(){
		wait(1000);
	    WebElement dropdown = findElement("xpath","BuildingWS");
	    dropdown.click();
		return this;
	}


	/*
	 * public HomePage validateHomeIcon() {
	 * isElementPresent(OR_OR.getProperty("Home_icon"), "Home_icon"); return this; }
	 */

	
}
