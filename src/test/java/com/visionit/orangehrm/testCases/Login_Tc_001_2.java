package com.visionit.orangehrm.testCases;

import org.testng.annotations.Test;

import com.visionit.orangehrm.pageObject.TestBase2;
import com.visionit.orangehrm.testBase.LoginPage2;

public class Login_Tc_001_2 extends TestBase2{

	@Test
	public void loginOrgangeHrmTest1() {
		LoginPage2 login = new LoginPage2(driver);// Object calling
		login.loginOrangehrm(xlsxData.getStringCellData("login", 0, 0), xlsxData.getStringCellData("login", 0, 1));
	}
}
