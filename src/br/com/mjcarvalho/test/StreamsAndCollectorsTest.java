package br.com.mjcarvalho.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class StreamsAndCollectorsTest {
	List<User> users;

	@Before
	public void prepareFixture() {
		users = new ArrayList();
		users.add(new User("User 1 ", 1, false));
		users.add(new User("User 2 ", 5, false));
		users.add(new User("User 3 ", 3, false));
		users.add(new User("User 4 ", 910, false));
		users.add(new User("User 5 ", 130, false));
		users.add(new User("User 6 ", 9, false));
		users.add(new User("User 7 ", 312, false));
		users.add(new User("User 8 ", 170, false));
		users.add(new User("User 9 ", 3, false));
		users.add(new User("User 10 ", 8, false));
		users.add(new User("User 11 ", 13, false));
		users.add(new User("User 12 ", 21, false));
		users.add(new User("User 13 ", 15, false));
		users.add(new User("User 14 ", 4, false));
		users.add(new User("User 15 ", 2120, false));
		users.add(new User("User 16 ", 2, false));
	}

	@After
	public void printLine(){
		System.out.println("----------------------------------");
	}
	@Test
	public void get10UsersWithMorePointsAndSettingAsMasterUserTest() {
		users.sort(Comparator.comparingInt(User::getPoint).reversed());
		users.subList(0, 10).forEach(User::setMaster);
		users.subList(0, 10).forEach(System.out::println);
	}
	
	@Test
	public void setMasterUserWhenPointsIsGreatherThen100Test(){
		/*1 - order by points
		 *2 - filter when points are > 100 
		 *3 - setMaster to each one filtered. 
		 * */
		users.stream()
			 .sorted(Comparator.comparingInt(User::getPoint).reversed())
			 .filter(u -> u.getPoint() > 100)
			 .forEach(User::setMaster);
		
		users.stream()
			 //.filter(u -> u.isMaster()) We also can use method referece where.See below :D
			 .filter(User::isMaster)
		     .forEach(System.out::println);
		
		
	}
	
}
