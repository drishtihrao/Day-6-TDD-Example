/*
 * All the possible test conditions for multiplication of two numbers are tried to check the working of the code
 */
package com.cg.junit.taxcalculator;

import org.junit.Assert;
import org.junit.Test;

import com.cg.junit.taxcalculator.main.Maths;

public class MultiplicationTest {

	@Test
	public void testMultTwoPositive() {
		Maths maths = new Maths();
		int ans = maths.multiply(2, 3);
		Assert.assertEquals(6, ans);
	}

	@Test
	public void testMultTwoNegative() {
		Maths maths = new Maths();
		int ans = maths.multiply(-2, -3);
		Assert.assertEquals(6, ans);
	}

	@Test
	public void testMultTwoZero() {
		Maths maths = new Maths();
		int ans = maths.multiply(0, 0);
		Assert.assertEquals(0, ans);
	}

	@Test
	public void testMultOneZeroOneNonZero() {
		Maths maths = new Maths();
		int ans = maths.multiply(2, 0);
		Assert.assertEquals(0, ans);
	}

	@Test
	public void testMultOnePositiveOneNegative() {
		Maths maths = new Maths();
		int ans = maths.multiply(2, -7);
		Assert.assertEquals(-14, ans);
	}
}
