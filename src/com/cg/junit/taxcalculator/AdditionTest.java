/*
 * All the possible test conditions for addition of two numbers are tried to check the working of the code
 */
package com.cg.junit.taxcalculator;

import org.junit.Assert;
import org.junit.Test;

import com.cg.junit.taxcalculator.main.Maths;

public class AdditionTest {

	@Test
	public void testAddTwoPositiveNumbers() {
		Maths maths = new Maths();
		int ans = maths.add(5, 9);
		Assert.assertEquals(14, ans);

	}

	@Test
	public void testAddTwoNegativeNumbers() {
		Maths maths = new Maths();
		int ans = maths.add(-5, -9);
		Assert.assertEquals(-14, ans);

	}

	@Test
	public void testAddTwoZeros() {
		Maths maths = new Maths();
		int ans = maths.add(0, 0);
		Assert.assertEquals(0, ans);

	}

	@Test
	public void testAddOneGreaterPositiveAndOneNegative() {
		Maths maths = new Maths();
		int ans = maths.add(9, -5);
		Assert.assertEquals(4, ans);

	}

	@Test
	public void testAddOnePositiveAndOneGreaterNegative() {
		Maths maths = new Maths();
		int ans = maths.add(-9, 5);
		Assert.assertEquals(-4, ans);

	}

	@Test
	public void testAddOnePositiveAndOneZero() {
		Maths maths = new Maths();
		int ans = maths.add(0, 5);
		Assert.assertEquals(5, ans);

	}

	@Test
	public void testAddOneZeroAndOneGreaterNegative() {
		Maths maths = new Maths();
		int ans = maths.add(-9, 0);
		Assert.assertEquals(-9, ans);

	}

}
