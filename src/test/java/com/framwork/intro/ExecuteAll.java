package com.framwork.intro;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(Day9Assert.class, Day10Assert.class);
		System.out.println("Run count " + rs.getRunCount());
		System.out.println("Failure Count " + rs.getFailureCount());
		System.out.println("Ignore Count " + rs.getIgnoreCount());
		System.out.println("Run time " + rs.getRunTime());
		List<Failure> failures = rs.getFailures();
		for (Failure f : failures) {
			System.out.println(f);
		}
	}
}
