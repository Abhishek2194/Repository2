package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;


public class BankingTest {

	@Test
	public void creditTest() {
		Banking bal=new Banking();
		int act=bal.credit(2500);
		int exp=2500;
		assertEquals(exp, act);
	}
	
	@Test
	public void debitTest() {
		Banking bal=new Banking();
		int act=bal.debit(1000);
		int exp=9000;
		assertEquals(exp, act);
		
	}
	
	

}
