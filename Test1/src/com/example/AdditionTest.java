package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AdditionTest {

	@Test
	public void addTest() {
		Addition a = new Addition();

		final int actaul = a.add(2, 3);
		final int expect = 5;
		assertEquals(actaul, expect);
	}
}
