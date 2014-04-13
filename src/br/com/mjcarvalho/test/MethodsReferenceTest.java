package br.com.mjcarvalho.test;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.mjcarvalho.model.User;

public class MethodsReferenceTest {

	List<User> users;

	@Before
	public void prepareFixture() {
		users = new ArrayList();
		users.add(new User("User 3 ", 1, false));
		users.add(new User("User 2 ", 5, false));
		users.add(new User("User 1 ", 3, false));
		users.add(new User("User 4 ", 101, true));
        users.forEach(User::print);
        System.out.println("-----------------------------------");
	}

	
	public void afterPrint() {
	   users.forEach(User::print);
	   System.out.println("-----------------------------------");
	}
	
	@Test
	public void setAllUserMasterAttrUsingMethodsRefereceTest(){
		/*		
		 * User::setMaster generate an functional interface (Consumer)
		 * Ex: Consumer<User> consumer = User::isMaster  is equals then:
		 *     Consumer<User> comsumer = u -> u.isMaster();
		 *     So we can do something like below:
		 */
		users.forEach(User::setMaster);
		afterPrint();
	}
	
	@Test
	public void putNullObjectsToTheFinalOfTheListTest(){
		//set null objects at index 0 and 1.
		users.set(0, null);
		users.set(1, null);
		//We can put the null objects to the final of the list using:
		users.sort(nullsLast(comparing(User::getName)));
		System.out.println(users.toString() +"\n");
	}
	
	@Test
	public void putsNullObjectsToTheBeginOfTheListTest(){
		// set null objects at index 2 and 3.
		users.set(2, null);
		users.set(3, null);
		// We can put the null objects to the final of the list using:
		users.sort(nullsFirst(comparing(User::getName)));
		System.out.println(users.toString() +"\n");
	}
	
}