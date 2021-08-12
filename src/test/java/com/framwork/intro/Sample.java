package com.framwork.intro;

import org.testng.annotations.*;

import com.pojo.LoginPagePojo;

public class Sample extends Day4Base {

	@DataProvider(name = "login")
	public Object[][] dpMethod() {
		return new Object[][] { { "Hello", "234567" }, { "Selenium", "34567890" } };
	}

}
