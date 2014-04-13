package br.com.mjcarvalho.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Before;
import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class UserTest {

	List<User> users;

	@Before
	public void prepareFixture(){
		users = new ArrayList<User>();
		users.add(new User("User 1 ", 1, false));
		users.add(new User("User 2 ", 5, false));
		users.add(new User("User 3 ", 3, false));
		users.add(new User("User 4 ", 101, true));
	}
	@Test
	public void printUserName() {
		System.out.println("\n Normal Way..");
		
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
	
	@Test
	public void andThenConsumerDefaultMethodTest(){
		Consumer<User> printUserNameConsumer = u -> System.out.println("UserName ->" + u.getName()); 
		Consumer<User> printUserPointsConsumer = u -> System.out.println("Points ->" + u.getPoint());
		users.forEach(printUserNameConsumer.andThen(printUserPointsConsumer));
	}
	
	@Test
	public void removeIfUserHasMoreThen100Points(){
		/*predicateInterfaceTest without lambda
		Predicate<User> filter = new Predicate<User>() {
			
			@Override
			public boolean test(User t) {
				return t.getPoint() > 100;
			}
		};
		*/
		
		users.removeIf(u -> u.getPoint() > 100);
		users.forEach(u -> System.out.println("This User were not removed from the list -> " + u.getName()));
	}
}
