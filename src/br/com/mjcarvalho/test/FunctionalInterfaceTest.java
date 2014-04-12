package br.com.mjcarvalho.test;

import org.junit.Test;

public class FunctionalInterfaceTest {

	@Test
	public void testInterfacesWithOneDeclaredMethod(){
		/* Toda interface que possui apenas um metodo pode 
		se implementada de maneira declarativa com lambda.*/
		
	
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				int total = 0;
				for(int i = 0; i < 101; i++ ) total+= i;
				System.out.println("r1 thread -> " + total);
				System.out.println("Thread called.. Anonymous class implementation..\n");
			}
		};
		new Thread(r1).start();

		/*Runnable é um exelente exemplo.. Como a interface possui apenas um metodo 
		 * (interface funcional), posso implementa-la de maneira declarativa com lambda.*/
		
		//Thread call implementation.. Lambda Way..
		Runnable r2 = () -> {
								int total = 0;
								for(int i = 0; i < 101; i++) total+= i;
									System.out.println("r2 thread -> " + total);
									System.out.println("Thread called.. Lambda Runnable implementation..\n");

							};
		new Thread(r2).start();		
		
		//poderiamos ja passar essa lambda como parametro para uma thread. Ex:
		
		new Thread(() -> {
			int total = 0;
			for(int i = 0; i < 101; i++) total+= i;
				System.out.println(" ~ Thread -> " + total);
				System.out.println("Thread called.. Lambda implementation passed as parameter..\n");
		}).start();

	}
}
