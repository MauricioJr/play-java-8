package br.com.mjcarvalho.test;

import org.junit.Test;

public class LocalVariablesWithLambdaTest {

	@Test
	public void tryToChangeLocalVariableValueTest() {
		int number = 5; //or final int number = 5 is the same thing.
		new Thread(() -> {
			System.out.println("Acess external variable number ->" + number);
		}).start();
		
		//will not compile because number need to be final (this time implicit) to be used at lambdas expressions.
		//number = 10;
	}
}
