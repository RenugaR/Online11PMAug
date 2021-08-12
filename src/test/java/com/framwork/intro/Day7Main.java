package com.framwork.intro;

import java.io.IOException;

public class Day7Main extends Day4Base {

	public static void main(String[] args) throws IOException {

		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		insertType(new Day7POM().getLstTxtValues().get(0), getData(0, 0));//Username
		insertType(new Day7POM().getLstTxtValues().get(1), getData(0, 2));//Password
		click(new Day6POM().getBtnLogin());
	}
}
