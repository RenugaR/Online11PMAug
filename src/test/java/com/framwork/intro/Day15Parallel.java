package com.framwork.intro;

import org.testng.annotations.Test;

public class Day15Parallel {

	@Test
	private void test1() {
		System.out.println("test1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void test2() {
		System.out.println("test2");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void test3() {
		System.out.println("test3");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void test4() {
		System.out.println("test4");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void test5() {
		System.out.println("test5");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void test6() {
		System.out.println("test6");
		System.out.println(Thread.currentThread().getId());
	}

}
