package br.com.mjcarvalho.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.naturalOrder;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class CollectionSortTests {
	List<User> users;
	List<Integer> numbers;
	@Before
	public void prepareFixture() {
		users = new ArrayList();
		users.add(new User("User 3 ", 1, false));
		users.add(new User("User 2 ", 5, false));
		users.add(new User("User 1 ", 3, false));
		users.add(new User("User 4 ", 101, true));
		users.forEach(u -> System.out.println("Earlier:" + u.getName() + " - points: " + u.getPoint()));
		
		Random random = new Random();
		numbers = new ArrayList();
		numbers.add(random.nextInt(100));
		numbers.add(random.nextInt(100));
		numbers.add(random.nextInt(100));
		numbers.add(random.nextInt(100));
		numbers.add(random.nextInt(100));
		numbers.add(random.nextInt(100));
		
	}

	@After
	public void afterPrint() {
		users.forEach(u -> System.out.println("After:" + u.getName() + " - points: " + u.getPoint()));
	}

	@Test
	public void comparatorWithLambdaTest() {
		Collections.sort(users, (u1, u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getName(), u2.getName()));
	}

	@Test
	public void comparatorByListWithLambdaTest() {
		users.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));
	}
	
	@Test
	public void comparatorFactoryTest(){
		//users.sort(Comparator.comparing(u -> u.getName())); //static import 
		users.sort(comparing(u -> u.getName()));
	}

	@Test
	public void usingNaturalOrderOfObject(){
		numbers.forEach(n -> System.out.println("Earlier Numbers:" + n));
		numbers.sort(naturalOrder());
		numbers.forEach(n -> System.out.println("After Numbers:" + n));
	}

	@Test
	public void orderByPointsWithAutoBoxing(){
		//Function expect Function<User, Integer> and need to return int (point)
		users.sort(comparing(u -> u.getPoint()));
	}
	
	@Test
	public void orderByPointsWithoutAutoBoxing(){
		/*ToIntFunction will compare using int. see:
		 return (Comparator<T> & Serializable)
		            (c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
		*/
		users.sort(comparingInt(u -> u.getPoint()));
	}
}
