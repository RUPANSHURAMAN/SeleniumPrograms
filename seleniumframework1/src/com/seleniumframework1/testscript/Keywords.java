package com.seleniumframework1.testscript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {

	static FirefoxDriver driver;
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	
	public void navigate(String url){
		driver.get(url);
	}
}
