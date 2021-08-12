package com.framwork.intro;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day11Param extends Day4Base {

	@BeforeClass
	private void beforeClass() {
		getDriver();
		launchUrl("https://www.facebook.com/");
	}

	@AfterClass
	private void afterClass() {
		closeBrowser();
	}

	@Parameters({ "username", "password" })
	@Test
	private void test1(@Optional("Selenium")String s1, String s2) throws IOException {
		System.out.println(s1);
		System.out.println(s2);
		insertType(new Day6POM().getTxtUserName(), s1);
		insertType(new Day6POM().getTxtPassword(), s2);
	}

	@Test
	private void test2() {
		click(new Day6POM().getBtnLogin());
	}
}
