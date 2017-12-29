package com.Techshine.business;

import com.Techshine.base.DriverBase;
import com.Techshine.handle.LoginPageHandle;

public class LoginPro {
	public LoginPageHandle lph;
	public LoginPro(DriverBase driver){
		lph=new LoginPageHandle(driver);
	}
	public void login(String user,String pwd){
		if(lph.assertLoginPage()){
			lph.sendKeysUsers(user);
			lph.sendKeysUsers(pwd);
			lph.clickAutoSignin();
			lph.clickLoginBtn();
		}else{
			System.out.println("页面不存在或者状态不正确");
		}		
		
	}
}
