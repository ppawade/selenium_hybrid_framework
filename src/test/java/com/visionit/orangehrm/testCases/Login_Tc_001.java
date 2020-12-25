package com.visionit.orangehrm.testCases;

import org.testng.annotations.Test;

import com.visionit.orangehrm.pageObject.TestBase;
import com.visionit.orangehrm.testBase.LoginPage;

public class Login_Tc_001 extends TestBase {

	@Test
	public void loginOrangehrmTest() {
		LoginPage login = new LoginPage(driver);// constructor calling
		// Control will go to constructor in LoginPage class
		login.loginOrangehrm();// Method calling
		// Control will go to method in LoginPage class
	}
}
