package com.framwork.intro;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day13TestNGAssert extends Day4Base {

	@BeforeClass
	private void beforeClass() {
		getDriver();
		launchUrl("https://www.facebook.com/");
		Assert.assertTrue(getCurrentUrl().contains("facebook"), "Home page current url is not matched");
	}

	@AfterClass
	private void afterClass() {
		closeBrowser();
	}

	@Test
	private void test1() throws IOException {
		SoftAssert s = new SoftAssert();
		
		insertType(new Day6POM().getTxtUserName(), "Selenium");
		
		String userNameAttribute = getAttribute(new Day6POM().getTxtUserName(), "value");
		
		s.assertEquals(userNameAttribute, "selenium", "Username is not matched");
		
		insertType(new Day6POM().getTxtPassword(), "1234");
		
		String passwordAttribute = getAttribute(new Day6POM().getTxtPassword(), "value");
		
		s.assertEquals(passwordAttribute, "1234", "Password is not matched");
		
		s.assertAll();
	}

	@Test
	private void test2() throws InterruptedException {
		click(new Day6POM().getBtnLogin());
		waitTime(3000);
		SoftAssert s = new SoftAssert();
		s.assertTrue(getCurrentUrl().contains("login"), "Login failure page is not loaded");
		s.assertAll();
	}

}
