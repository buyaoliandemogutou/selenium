package com.Techshine.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectDriver {
	public WebDriver driverName(String browser){
		if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.firefox.marionette", "F:/Driver");
			return new FirefoxDriver();			
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:/Driver/chromedriver.exe");
			return new ChromeDriver();
		}else{
			System.setProperty("webdriver.internetexplorer.driver", "F:/Driver/IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
	}
}
