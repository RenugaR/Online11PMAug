package com.framwork.intro;

import org.testng.annotations.Test;

public class Day12DataProv extends Day4Base {

	@Test(dataProvider = "login", dataProviderClass = Sample.class)
	private void test1(String s1, String s2) {
		getDriver();
		launchUrl("https://www.facebook.com/");
		insertType(new Day6POM().getTxtUserName(), s1);
		insertType(new Day6POM().getTxtPassword(), s2);
		click(new Day6POM().getBtnLogin());
		closeBrowser();
	}

}
