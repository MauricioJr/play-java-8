package br.com.mjcarvalho.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class InitTest {

	@Test
	public void itWorks(){
		String tr = "Works with JDK 8?";
		assertTrue(!tr.isEmpty());
	}
}
