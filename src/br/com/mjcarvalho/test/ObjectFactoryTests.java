package br.com.mjcarvalho.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Before;
import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class ObjectFactoryTests {

	@Before
	public void printLine(){
		System.out.println("-------------------------------------");
	}
	@Test
	public void newUserUsingSupplierInterface(){
		Supplier<User> supplierFactory = User::new;
		List<User> users = Arrays.asList(supplierFactory.get(), supplierFactory.get(), supplierFactory.get());
		users.forEach(System.out::println);
	}

	@Test
	public void newUserWithParamsConstructorUsingBFunctionInterface(){
		Function<String, User> functionFactory = User::new;
		List<User> users = Arrays.asList(functionFactory.apply("User 1"), functionFactory.apply("User 2"));
		users.forEach(System.out::println);
	}
	
}
