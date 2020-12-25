package com.visionit.orangehrm.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionit.organgehrm.utilities.ConfigDataProvider;

public class TestBase1 {
	public static WebDriver driver = null;
	public ConfigDataProvider configData;

	@BeforeSuite()
	public void setupSuite() {
		configData = new ConfigDataProvider();
	}

	@Parameters("Browser")
	@BeforeMethod
	public void setUp(@Optional("Chrome") String browserName) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\Drivers\\ChromeDriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\SeleniumSoft\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\SeleniumSoft\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(configData.getAppUrl());//fetching url from ConfigDataProvider class
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Ended");
	}

}
