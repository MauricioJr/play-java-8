package br.com.mjcarvalho.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class UserTest {

	@Test
	public void printUserName() {
		System.out.println("\n Normal Way..");
		User u1 = new User("User 1 ", 1, false);
		User u2 = new User("User 2 ", 5, false);
		User u3 = new User("User 3 ", 3, false);
		User u4 = new User("User 4 ", 1, true);

		List<User> users = Arrays.asList(u1, u2, u3, u4);

		for (User user : users) {
			System.out.println(user.getName());
		}

		System.out.println("\n With anonymous class implementing Consumer..");
		users.forEach(new Consumer<User>() {

			@Override
			public void accept(User t) {
				System.out.println(t.getName());
			}

		});

		System.out.println("\n With Lambda..");
		users.forEach(u -> System.out.println(u.getName()));

	}
}
