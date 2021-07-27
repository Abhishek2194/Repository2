package com.demo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.*;

import org.junit.Test;

public class CheckAssertion {
    
	@Test
	//Example assertEquals
	public void checkassertEquals()
	{
	String expected = "Test";
	String actual = "Test";
	assertEquals(expected, actual);
	}
	
	@Test
	//Example assertArrayEquals
	public void checkassertArrayEquals()
	{
	char[] expected = {'T','e','s','t'};
	char[] actual = "Test".toCharArray();
	assertArrayEquals(expected, actual);
	}
	
	
	@Test
	//Example assertNull
	public void checkassertNull()
	{
	Banking bal= null;
	assertNull(bal);
	}
	
	
	@Test
	//Example assertNotNull
	public void checkassertNotNull()
	{
	Banking bal= new Banking();
	assertNotNull(bal);
	}
	
	@Test
	//Example assertSame
	public void checkassertSame()
	{
	Banking bal= new Banking();
	Banking bal1= new Banking();
	assertSame(bal,bal1);
	}
	
	@Test
	//Example assertNotSame
	public void checkassertNotSame()
	{
	Banking bal= new Banking();
	Banking bal1= null;
	assertNotSame(bal,bal1);
	}
	
	@Test
	//Example assertFalse
	public void checkassertFalse()
	{
	assertFalse(5==7);
	}
	
	@Test
	//Example assertTrue
	public void checkassertTrue()
	{
	assertTrue(5<7);
	}
	
	
	@Test
	//Example fail
	public void checkFail()
	{
	fail("Failing the test");
	}
	
	/*@Test
	public void checkassertThat()
	{
		List<String> d=Arrays.asList("apple","orange");
		List<String> e=Arrays.asList("apple","orange");
		assertThat(d, is(e));
		
	}
*/
	
	
	
	
	
	
	
	
	

}
