package com.Techshine.testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.Techshine.base.DriverBase;
import com.Techshine.business.LoginPro;


public class login extends CaseBase{
	public DriverBase driver;
	public LoginPro loginpro;
	static Logger logger=Logger.getLogger(login.class);
	public login() {
		this.driver=InitDriver("chrome");
		loginpro=new LoginPro(driver);
	}
	@Test
	public void getLoginHome() throws InterruptedException{
		driver.get("http://www.imooc.com");
		driver.findElement(By.id("js-signin-btn")).click();
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods={"getLoginHome"})
	public void testLogin(){
		logger.error(driver);
		loginpro.login("18109045175", "zh1096902145");
	}
	
}
