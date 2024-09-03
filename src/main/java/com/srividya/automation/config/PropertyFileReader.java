package com.srividya.automation.config;

import java.io.IOException;
import java.util.Properties;

import com.srividya.automation.util.PathHelper;

public class PropertyFileReader implements ConfigurationReader {

	Properties properties;

	public PropertyFileReader() {
		properties = new Properties();
		try {
			properties.load(PathHelper.getFileInputStream(".\\src\\main\\resources\\ConfigurationFile\\config.properties"));
		}catch(IOException e){
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {

		return properties.getProperty("url");
	}

	public String getBrowser() {

		return properties.getProperty("browser");
	}
	public String getProduct() {

		return properties.getProperty("product");
	}
	public String getUsername() {

		return properties.getProperty("username");
	}
	public String getPassword() {

		return properties.getProperty("password");
	}


}
