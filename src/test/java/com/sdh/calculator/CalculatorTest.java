package com.sdh.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This is Javadoc sample
 * @author SDH
 */
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2,3));
	}

	@Test
	public void testSub() {
		assertEquals(-1, calculator.sub(2,3));
	}

	@Test
	public void testMul() {
		assertEquals(6, calculator.mul(2,3));
	}

	@Test
	public void testDiv() {
		assertEquals(3, calculator.div(6,2));
	}
}
