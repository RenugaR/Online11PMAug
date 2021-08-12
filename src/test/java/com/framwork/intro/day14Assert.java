package com.framwork.intro;

import org.testng.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class day14Assert {

	@Test()
	private void test1() {
		Assert.assertTrue(true);
		System.out.println("test1");
		Assert.assertTrue(true);
	}

	@Test
	private void test2() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(true);
		s.assertTrue(false);
		System.out.println("test2");
		s.assertAll();
	}

	@Test
	private void test4() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		System.out.println("test4");
		Assert.assertTrue(true);
	}

	@Test
	private void test3() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
}
