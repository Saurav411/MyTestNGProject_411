package com.testng.training;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority = 199) // as the method name is testOne, alphabetically
							// should get executed first but since we have set
							// the priorities here along with Tags, so it got
							// executed according to priority list.
	public void testOne() {
		System.out.println("Hi, I am Test One .....");
	}

	@Test(priority = 1)
	public void testTwo() {
		System.out.println("Hi, I am Test Two .....");
	}

	@Test(priority = 2)
	public void testThree() {
		System.out.println("Hi, I am Test Three .....");

	}

	@Test(priority = 3)
	public void testFour() {
		System.out.println("Hi, I am Test Four .....");
	}

}
