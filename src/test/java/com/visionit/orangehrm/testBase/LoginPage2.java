package com.visionit.orangehrm.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	@FindBy(name = "txtUsername")
	WebElement username;

	@FindBy(name = "txtPassword")
	WebElement userpas;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public LoginPage2(WebDriver driver) // object answered
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);// web-elements will be ready to load
	}
	public void loginOrangehrm(String uname, String upass) //method answered
	{
		username.sendKeys(uname);// loaded web-elements
		userpas.sendKeys(upass);
		loginBtn.click();
	}

}
