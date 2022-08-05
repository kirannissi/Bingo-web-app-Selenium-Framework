package com.gocollect.pages;


import com.gocollect.main.FunLibrary;
//import com.gocllect.utilities.DatabaseUtilities;

public class LoginPage extends FunLibrary {


	public LoginPage clickLogin() throws Exception {
		wait(1000);
		Click_Button_Xpath(OR_OR.getProperty("Login_Button"), "Login_Button");
		return this;

	}

	public LoginPage BingoLogin() {
		String mainWindowHandle = driver.getWindowHandle();
		// switch to Bingo portal
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				wait(2000);
				Clear_Text(OR_OR.getProperty("username"), "username");
				Sendkey_xpath(OR_OR.getProperty("username"), username, "username");
				Clear_Text(OR_OR.getProperty("password"), "password");
				Sendkey_xpath(OR_OR.getProperty("password"), password, "password");
				Click_Button_Xpath(OR_OR.getProperty("singin"), "singin");
				
			}
			driver.switchTo().window(mainWindowHandle);	
			wait(8000);
		}
		return this;
		
	}
	

}
