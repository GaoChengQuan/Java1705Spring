package com.situ.spring.entity;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// <bean name="student" class="com.situ.spring.entity.Student"/>
@Component("student")
	@Controller("student") //web层
	@Service("student")	   //service层
	@Repository("student") //到层
public class Student {
	private Integer id;
	private String password;
	private Integer age;
	private String gender;
	private Date birthday;
	//通过反射Field，赋值
	@Value("list")
	private String name;
	
	//<!-- 应用类型注入 ：clazz属性注入Clazz对象-->
	//<property name="clazz" ref="clazz"></property>
	@Resource(name="clazz")
	private Clazz clazz;

	public Student() {
		System.out.println("Student()");
	}
	
	//通过set方法赋值
	@Value("lisi")
	public void setName(String name) {
		this.name = name;
	}
	
	//构造方法执行对象创建后调用，init-method
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}

	//在销毁之前调用 , destory-method
	@PreDestroy
	public void destory() {
		System.out.println("destory()");
	}
	
	public Student(Integer id, String name, Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.clazz = clazz;
		System.out.println("1111111");
	}
	
	public Student(String id, String name, Clazz clazz) {
		super();
		this.password = id;
		this.name = name;
		this.clazz = clazz;
		System.out.println("2222222");
	}

	public Student(Integer id, Clazz clazz, String name) {
		super();
		this.id = id;
		this.name = name;
		this.clazz = clazz;
		System.out.println("3333333");
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
