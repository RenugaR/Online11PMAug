package com.framwork.intro;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day10TestNGIntro extends Day4Base {

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
	private void test1(@Optional("Hello")String s1, String s2) throws IOException {
		insertType(new Day6POM().getTxtUserName(), s1);// seleniun
		insertType(new Day6POM().getTxtPassword(), s2);// 9864112
	}

	@Test
	private void test2() {
		click(new Day6POM().getBtnLogin());
	}

}
