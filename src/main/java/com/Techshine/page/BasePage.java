package com.Techshine.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Techshine.base.DriverBase;

public class BasePage {
	private static final CharSequence value = null;
	public DriverBase driver;
	public BasePage(DriverBase driver){
		this.driver=driver;
	}
	
	/*
	 * 定位element
	 * @param By by
	 */
	public WebElement element(By by){
		WebElement element=driver.findElement(by);
		return element;
	}
	/*
	 * 封装点击
	 */
	public void click(WebElement element) {
		if(element!=null){
			element.click();
		}else{
			System.out.println("点击失败");
		}
	}
	/*
	 * 封装输入
	 */
	public void senKeys(WebElement element,String value) {
		if(element!=null){
			element.sendKeys(value);
		}else{
			System.out.println(element+"输入失败"+value);
		}
	}
	/*
	 * 判断元素是否显示
	 */
	public boolean assertElement(WebElement element) {
		return element.isDisplayed();
	}
}
