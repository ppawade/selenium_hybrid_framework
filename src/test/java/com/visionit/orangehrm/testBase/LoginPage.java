package com.visionit.orangehrm.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "txtUsername")
	WebElement username;

	@FindBy(name = "txtPassword")
	WebElement userpas;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//web-elements will load
	}

	public void loginOrangehrm() {
		username.sendKeys("Admin");//value is provided
		userpas.sendKeys("admin123");
		loginBtn.click();
	}
}
