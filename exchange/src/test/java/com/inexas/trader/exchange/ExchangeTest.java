package com.inexas.trader.exchange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExchangeTest {

	@Test
	public void getTest() {
		final Exchange exchange = new Exchange();
		assertEquals("Test", exchange.getTest());
	}
}