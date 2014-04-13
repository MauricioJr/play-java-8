package br.com.mjcarvalho.model;

public class User {

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

	public void setMaster() {
		this.master = true;
	}

	public void print() {
		System.out.println("User [name=" + name + ", point=" + point + ", master=" + master + "]");
	}

}
