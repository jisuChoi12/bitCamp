package kr.co.bit;

import java.io.Serializable;

public class User implements Serializable{
	private String id;
	private String password;
	private String dong;
	private int age;
	private String name;
	
	public User() {
		this(null,null,null,0,null);
	}

	public User(String id, String password, String dong, int age, String name) {
		super();
		this.id = id;
		this.password = password;
		this.dong = dong;
		this.age = age;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", dong=" + dong + ", age=" + age + ", name=" + name + "]";
	}
}
