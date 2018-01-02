package com.Techshine.util;

import org.openqa.selenium.By;

import com.Techshine.ProUtil;

public class getByLocator {
	public static By getLocator(String key) {
		ProUtil properties=new ProUtil("element.properties");
		String locator=properties.getPro(key);
		String locatorType=locator.split(">")[0];
		String locatorId=locator.split(">")[1];		
		if (locatorType.equals("id")) {
			return By.id(locatorId);
		} else if(locatorType.equals("name")) {
			return By.name(locatorId);
		}else if(locatorType.equals("className")) {
			return By.className(locatorId);
		}else if(locatorType.equals("linkText")) {
			return By.linkText(locatorId);
		}else if(locatorType.equals("xpath")) {
			return By.xpath(locatorId);
		}else
		return null;
	}
}
