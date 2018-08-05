/*
 * All the possible test conditions for subtraction of two numbers are tried to check the working of the code
 */
package com.cg.junit.taxcalculator;

import org.junit.Assert;
import org.junit.Test;

import com.cg.junit.taxcalculator.main.Maths;

public class SubtractionTest {

	@Test
	public void testSubTwoPositive() {
		Maths maths = new Maths();
		int ans = maths.sub(8, 3);
		Assert.assertEquals(5, ans);
	}

	@Test
	public void testSubOneSmallerPositiveOneLarger() {
		Maths maths = new Maths();
		int ans = maths.sub(8, 13);
		Assert.assertEquals(-5, ans);
	}

	@Test
	public void testSubOneSmallerNegativeOneLarger() {
		Maths maths = new Maths();
		int ans = maths.sub(-8, -13);
		Assert.assertEquals(5, ans);
	}

	@Test
	public void testSubNegativePositive() {
		Maths maths = new Maths();
		int ans = maths.sub(-8, -3);
		Assert.assertEquals(-5, ans);
	}

	@Test
	public void testSubOnePositivefromOneGreaterNegative() {
		Maths maths = new Maths();
		int ans = maths.sub(8, -12);
		Assert.assertEquals(20, ans);
	}

	@Test
	public void testSubOneGreaterNegativefromOnePositive() {
		Maths maths = new Maths();
		int ans = maths.sub(-8, 12);
		Assert.assertEquals(-20, ans);
	}

	@Test
	public void testSubOneGreaterPositivefromOneNegative() {
		Maths maths = new Maths();
		int ans = maths.sub(-12, 20);
		Assert.assertEquals(-32, ans);
	}

	@Test
	public void testSubOneNegativefromOneGreaterPositive() {
		Maths maths = new Maths();
		int ans = maths.sub(32, -22);
		Assert.assertEquals(54, ans);
	}

	@Test
	public void testSubTwoZeros() {
		Maths maths = new Maths();
		int ans = maths.sub(0, 0);
		Assert.assertEquals(0, ans);
	}

	@Test
	public void testSubOneZerofromOneNegative() {
		Maths maths = new Maths();
		int ans = maths.sub(-3, 0);
		Assert.assertEquals(-3, ans);
	}

	@Test
	public void testSubOneZerofromOnePositive() {
		Maths maths = new Maths();
		int ans = maths.sub(8, 0);
		Assert.assertEquals(8, ans);
	}

	@Test
	public void testSubOneNegativefromOneZero() {
		Maths maths = new Maths();
		int ans = maths.sub(0, -3);
		Assert.assertEquals(3, ans);
	}

	@Test
	public void testSubOnePositiveOneZero() {
		Maths maths = new Maths();
		int ans = maths.sub(0, 8);
		Assert.assertEquals(-8, ans);
	}

	@Test
	public void testSubTwoEquals() {
		Maths maths = new Maths();
		int ans = maths.sub(8, 8);
		Assert.assertEquals(0, ans);
	}
}
