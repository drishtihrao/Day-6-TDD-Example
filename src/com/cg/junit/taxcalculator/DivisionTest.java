/*
 * All the possible test conditions for division of two numbers are tried to check the working of the code
 */
package com.cg.junit.taxcalculator;
import org.junit.Assert;
import org.junit.Test;

import com.cg.junit.taxcalculator.main.Maths;

public class DivisionTest {

	@Test
	public void testDivideGreaterPositivebySmallerPositive() {
		Maths maths = new Maths();
		int ans = maths.divide(6, 2);
		Assert.assertEquals(3, ans, 0);
	}

	@Test
	public void testDivideGreaterNegativebySmallerNegative() {
		Maths maths = new Maths();
		int ans = maths.divide(-6, -2);
		Assert.assertEquals(3, ans, 0);
	}

	@Test
	public void testDivideSmallerPositivebyPositive() {
		Maths maths = new Maths();
		int ans = maths.divide(2, 5);
		Assert.assertEquals(0, ans, 0);
	}

	@Test
	public void testDivideSmallerNegativebyNegative() {
		Maths maths = new Maths();
		int ans = maths.divide(-2, -5);
		Assert.assertEquals(0, ans, 0);
	}

	@Test
	public void testDivideZerobyNegative() {
		Maths maths = new Maths();
		int ans = maths.divide(0, -5);
		Assert.assertEquals(0, ans, 0);
	}

	@Test
	public void testDivideZerobyPositive() {
		Maths maths = new Maths();
		int ans = maths.divide(0, 5);
		Assert.assertEquals(0, ans, 0);
	}

	// @Rule ExpectedException thrown = ExpectedException.none();

	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		Maths math=new Maths();
		float div=math.divide(2,0);
		Assert.assertEquals(0,div,0);
	}

}
