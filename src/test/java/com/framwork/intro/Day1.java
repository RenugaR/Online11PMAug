package com.framwork.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\OnlineFrameWorkMay9AM\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println("Hello");
		System.out.println("Welcome");
		System.out.println("To");
		System.out.println("Git");
		System.out.println("Conflict");
		int a = 10;
		System.out.println(a);
	}
}
