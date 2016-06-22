package com.simpleWorld.Domain;

public class User {
	private String name;
	private int age;

	public User(){} 
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static User setInstance(String name, int age) {
		User user = new User();
		user.name = name;
		user.age = age;
		return user;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
