package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	
		@Test
		public void calcTest() {
			System.out.print("testing");
			int a= 4;
		    int b=6;
		    int c= a+b;
		    assertEquals(10, c);
		}
}
