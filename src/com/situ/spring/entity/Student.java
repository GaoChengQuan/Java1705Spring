package com.situ.spring.entity;

import java.util.Date;

public class Student {
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private String gender;
	private Date birthday;
	private Clazz clazz;

	public Student() {
		System.out.println("Student()");
	}

	public void init() {
		System.out.println("init()");
	}

	public void destory() {
		System.out.println("destory()");
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password="
				+ password + ", age=" + age + ", gender=" + gender
				+ ", birthday=" + birthday + ", clazz=" + clazz + "]";
	}

}
