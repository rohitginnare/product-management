package com.exatip.product.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.exatip.product.test.Calculator;

public class CalculatorTest {

	Calculator calculator;

	@Test
	public void testMultiply() {
		calculator = new Calculator();
		assertEquals(20, calculator.multiply(4, 5));

	}
}
