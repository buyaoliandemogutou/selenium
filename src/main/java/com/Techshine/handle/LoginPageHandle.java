package com.Techshine.handle;

import com.Techshine.base.DriverBase;
import com.Techshine.page.LoginPage;

public class LoginPageHandle {
	public DriverBase driver;
	public LoginPage lp;
	public LoginPageHandle(DriverBase driver){
		this.driver=driver;
		lp=new LoginPage(driver);
	}
	/*
	 * 输入用户名
	 */
	public void sendKeysUsers(String username) {
		lp.senKeys(lp.getUserElement(), username);
	}
	
	public void sendKeysPwd(String pwd){
		lp.senKeys(lp.getPassword(), pwd);
	}
	
	public void clickLoginBtn(){
		lp.click(lp.getLoginButtonElement());
	}
	//自动登录
	public void clickAutoSignin(){
		lp.click(lp.getAutoSigninElement());
	}
	
	/*
	 * 判断是否是额登陆页面
	 */
	public boolean assertLoginPage(){
		return lp.assertElement(lp.getUserElement());
	}
	
	
	
}
