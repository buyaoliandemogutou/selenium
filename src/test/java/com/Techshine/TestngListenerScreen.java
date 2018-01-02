package com.Techshine;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.Techshine.base.baseDriver;


public class TestngListenerScreen extends TestListenerAdapter{
	@Override
	public void onTestSuccess(ITestResult tr){
		super.onTestSuccess(tr);
	}
	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
		takesScreenshot(tr);
	}
	public void takesScreenshot(ITestResult tr){
		baseDriver baseDriver=(baseDriver) tr.getInstance();
		baseDriver.takeScreenShot();	
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		super.onTestStart(result);
	}
	@Override
	public void onStart(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onStart(testContext);
	}
	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onFinish(testContext);
	}
	
}
