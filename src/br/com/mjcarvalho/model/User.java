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
	
	public User(String name) {
		super();
		this.name = name;
	}

	public User(){
		super();
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

	@Override
	public String toString() {
		return "User [name=" + name + ", point=" + point + ", master=" + master
				+ "]";
	}
	
}
