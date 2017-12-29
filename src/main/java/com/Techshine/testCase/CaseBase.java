package com.Techshine.testCase;

import com.Techshine.base.DriverBase;

public class CaseBase {
	public DriverBase InitDriver(String browser){
		return new DriverBase(browser);
	}
}
