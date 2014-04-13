package br.com.mjcarvalho.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class CollectionSortTests {
	List<User> users;

	@Before
	public void prepareFixture() {
		users = new ArrayList<User>();
		users.add(new User("User 3 ", 1, false));
		users.add(new User("User 2 ", 5, false));
		users.add(new User("User 1 ", 3, false));
		users.add(new User("User 4 ", 101, true));
		users.forEach(u -> System.out.println("Earlier:" + u.getName()));
	}

	@After
	public void afterPrint() {
		users.forEach(u -> System.out.println("After:" + u.getName()));
	}

	@Test
	public void comparatorWithLambdaTest() {
		Collections.sort(users, (u1, u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getName(), u2.getName()));
	}

	@Test
	public void comparatorByListWithLambdaTest() {
		users.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));
	}

}
