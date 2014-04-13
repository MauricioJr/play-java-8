package br.com.mjcarvalho.model;

import java.util.ArrayList;
import java.util.List;

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

	public void setMaster(boolean master) {
		this.master = master;
	}
}
