package com.Techshine.base;

import org.openqa.selenium.WebDriver;

public class DriverBase {
	public WebDriver driver;
	public DriverBase(String browser){
		SelectDriver selectDriver=new SelectDriver();
		this.driver=selectDriver.driverName(browser);
	}
	
	public void stop(){
		driver.close();
	}
}
