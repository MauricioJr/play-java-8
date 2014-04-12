package br.com.mjcarvalho.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Capitulo2 {

	public static void main(String... args) {

		User u1 = new User("Paulo Silveira", 150 , true);
		User u2 = new User("Rodrigo Turini", 120, true);
		User u3 = new User("Guilherme Silveira", 190, true);

		List<User> usuarios = Arrays.asList(u1, u2, u3);

		for (User u : usuarios) {
			System.out.println(u.getName());
		}

		usuarios.forEach(u -> System.out.println(u.getName()));}
	
	
	public static class User {

		private String name;
		private int point;
		private boolean master;

		public User(String name, int point, boolean master) {
			super();
			this.name = name;
			this.point = point;
			this.master = master;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}

		public boolean isMaster() {
			return master;
		}

		public void setMaster(boolean master) {
			this.master = master;
		}

	}
}