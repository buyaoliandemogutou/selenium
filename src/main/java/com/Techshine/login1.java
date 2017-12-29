package com.Techshine;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.assertj.core.util.introspection.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Techshine.base.baseDriver;

@Listeners({TestngListenerScreen.class})
public class login1 extends baseDriver{
	public WebDriver driver;	
	public void initDriver(){
//		System.setProperty("webdriver.chrome.driver", "F:/Driver/chromedriver.exe");
//		driver=new ChromeDriver();		
		driver.get("https://www.imooc.com/");
		driver.manage().window().maximize();
	}
	
	public void Login(String username,String pwdVlue) throws InterruptedException, Exception{
		this.initDriver();
		this.element(by("loginbutton")).click();
		Thread.sleep(2000);
		this.element(by("username")).sendKeys(username);
		this.element(by("pwd")).sendKeys(pwdVlue);
		this.element(by("loginbtn")).click();
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(this.element(by("check"))).perform();
		this.takeScreenShot();
		String name=this.element(by("checkname")).getText();		
		System.out.println(name);
		driver.close();
	}
	/*
	 * 封装By
	 */
	public By by(String username) throws Exception{
		ProUtil properties=new ProUtil("element.properties");
		String locator=properties.getPro(username);
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
	
	/*
	 * 封装element
	 */
	public WebElement element(By by){
		WebElement element=driver.findElement(by);
		return element;
	}	
	
	
	@Test
	public static void main(String[] args) throws Exception{
		login1 test=new login1();
		test.Login("18109045175","zh1096902145");
		/*
		 * HashMap
		 * key-value
		 * username-password
		 */
//		HashMap<String, String> user=new HashMap<String, String>();
//		user.put("18109045175", "zh1096902145");
//		user.put("1096902145@qq.com", "zh1096902145");
//		Iterator us=user.entrySet().iterator();
//		while (us.hasNext()) {
//			Map.Entry entry=(Map.Entry) us.next();
//			String username=entry.getKey().toString();
//			String password=entry.getValue().toString();
//			test.Login(username, password);
//		}
	}
}
