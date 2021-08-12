package com.framwork.intro;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9JunitContinu extends Day4Base{
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass-->Driver Initialization");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\OnlineFrameWorkMay9AM\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Assert.assertTrue("Current url is not matched", driver.getCurrentUrl().contains("facebook"));
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass-->Close Driver");
		driver.close();
	}

	@Test
	public void test1() {
		System.out.println("Test1-->Business logic");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Hello");
		Assert.assertEquals("Username value is not matched", "Hello", txtUserName.getAttribute("value"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("1234567");
		Assert.assertEquals("Password value is not matched", "1234567", txtPass.getAttribute("value"));

	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2-->Business logic");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		Thread.sleep(3000);
		Assert.assertTrue("User is not navigated to login failure page", driver.getCurrentUrl().contains("login"));
	}

	@Before
	public void before() {
		System.out.println("Before-->Test Execution Start Time");
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() {
		System.out.println("After-->Test Execution End Time");
		Date d = new Date();
		System.out.println(d);
	}
}
