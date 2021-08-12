package com.framwork.intro;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day15CrossBrowser extends Day4Base {

	@Parameters({ "browser" })
	@BeforeClass
	private void beforeClass(String s1) {
		if (s1.equalsIgnoreCase("Edge")) {
			getEdgeDriver();
		} else if (s1.equalsIgnoreCase("chrome")) {
			getChromeDriver();
		}
		launchUrl("https://www.facebook.com/");
		String currentUrl = getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("facebook"), "Facebook url is not matched");
	}

	@AfterClass
	private void afterClass() {
		closeBrowser();
	}

	@Test()
	private void test1() throws IOException {
		SoftAssert s = new SoftAssert();
		insertType(new Day6POM().getTxtUserName(), getData(0, 0));
		String attribute = getAttribute(new Day6POM().getTxtUserName(), "value");
		s.assertEquals(attribute, "Selenium", "UserName is not equal");
		insertType(new Day6POM().getTxtPassword(), getData(0, 2));
		String attribute2 = getAttribute(new Day6POM().getTxtPassword(), "value");
		s.assertEquals(attribute2, "9875437286", "Password is not matched");
		s.assertAll();
	}

	@Test
	private void test2() throws InterruptedException {
		SoftAssert s = new SoftAssert();
		click(new Day6POM().getBtnLogin());
		waitTime(3000);
		String currentUrl = getCurrentUrl();
		s.assertTrue(currentUrl.contains("login"), "User is not navigated to login failure page");
	}

}
