package com.Techshine;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {
	public WebDriver driver;
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver", "F:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.imooc.com/user/newlogin/from_url/");
		driver.manage().window().maximize();		
	}
	
	public void Login1() throws InterruptedException{
		String username="18109045175";
		String pwd="zh1096902145";
		String userby="name";
		this.InitDriver();
		driver.findElement(By.name("email")).clear();
		driver.findElement(this.by(username, userby));
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.className("btn-red")).click();
		Thread.sleep(2000);
		WebElement header=driver.findElement(By.id("header-avator"));
		header.isDisplayed();
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("header-avator"))).perform();
		System.out.println(driver.findElement(By.className("name")).getText());
	}
	
	/*
	 * 封装By
	 */
	public By by(String name,String local){
		if(name.equals("id")){
			return By.id(local);
		}else if (name.equals("name")) {
			return By.name(local);
		}else if (name.equals("className")) {
			return By.className(local);
		}else if (name.equals("linkText")) {
			return By.linkText(local);
		}else {
			return By.xpath(local);
		}		
	}
	public static void  main(String[] args) throws InterruptedException {
		Login login=new Login();
		login.Login1();
	}
}
