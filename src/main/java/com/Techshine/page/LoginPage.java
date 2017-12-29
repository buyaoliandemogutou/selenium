package com.Techshine.page;

import org.openqa.selenium.WebElement;

import com.Techshine.base.DriverBase;
import com.Techshine.util.getByLocator;

public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver) {
		super(driver);
	}
	/*
	 * 获取用户名输入框
	 */
	public WebElement getUserElement(){
		return element(getByLocator.getLocator("username"));
	}
	/*
	 * 获取密码输入框
	 */
	public WebElement getPassword(){
		return element(getByLocator.getLocator("pwd"));
	}
	/*
	 * 获取登录按钮
	 */
	public WebElement getLoginButtonElement() {
		return element(getByLocator.getLocator("loginbtn"));
	}
	/*
	 * 获取自动登录按钮
	 */
	public WebElement getAutoSigninElement() {
		return element(getByLocator.getLocator("autoSignin"));
	}
	
}
