package com.visionit.orangehrm.testCases;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.visionit.orangehrm.pageObject.TestBase1;
import com.visionit.orangehrm.testBase.LoginPage1;

public class Login_Tc_001_1 extends TestBase1 {
	// public WebDriver driver;
	@Test
	public void loginOrgangeHrmTest1() {
		LoginPage1 login = new LoginPage1(driver);// Object calling
		login.loginOrangehrm(configData.getUserName(), configData.getUserPassword());//the data associated with the getUserName() and getUserPassword()
		//is fetch from ConfigDataProvider() method and then this data is pushed to SendKeys in LoginPage1's loginOrangehrm() method
	}
}
