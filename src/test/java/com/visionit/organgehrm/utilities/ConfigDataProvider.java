package com.visionit.organgehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties prop;

	public ConfigDataProvider() //method
	{

		try {
			File fs = new File("./Config/config.properties");
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getKeyValue(String searchKeys) {
		return prop.getProperty(searchKeys);
	}

	public String getUserName() {
		return prop.getProperty("username");//fetch the data associated with username from config.properties file i.e. Admin
	}

	public String getUserPassword() {
		return prop.getProperty("password");
	}

	public String getAppUrl() {
		return prop.getProperty("url");
	}
}
