package com.framwork.intro;

import org.testng.annotations.Test;

public class Day11Proiignoreinvo {

	@Test(priority = 5)
	private void test1() {
		System.out.println("Test1");
	}

	@Test(priority = -5, enabled = false)
	private void test2() {
		System.out.println("Test2");
	}

	@Test(priority = -2, invocationCount = 5)
	private void test4() {
		System.out.println("Test4");
	}

	@Test()
	private void test3() {
		System.out.println("Test3");
	}
}
