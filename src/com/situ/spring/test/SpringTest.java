package com.situ.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.situ.spring.entity.Student;

public class SpringTest {

	@Test
	public void testSpring() {
		// 得到IOC容器对象
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取bean
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
	}
	
	@Test
	public void testSpring1() {
		// 得到IOC容器对象
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取bean
		Student student1 = (Student) applicationContext.getBean("student");
		Student student2 = (Student) applicationContext.getBean("student");
		System.out.println(student1 == student2);
	}
	
	@Test
	public void testSpring3() {
		// 得到IOC容器对象
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取bean
		Student student = (Student) applicationContext.getBean("student");
		//关闭容器，触发销毁方法,close()这个方法是ApplicationContext
		//的子类ClassPathXmlApplicationContext里面的方法。
		applicationContext.close();
	}
}
