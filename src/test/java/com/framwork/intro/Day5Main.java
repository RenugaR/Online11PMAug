package com.framwork.intro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day5Main extends Day4Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);

		WebElement txtUserName = driver.findElement(By.id("email"));
		insertType(txtUserName, getData(0, 0));

		WebElement txtPass = driver.findElement(By.id("pass"));
		insertType(txtPass, getData(0, 2));

		WebElement btnLogIn = driver.findElement(By.name("login"));
		click(btnLogIn);
		
		waitTime(3000);

		closeBrowser();
	}
}
