package com.situ.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.entity.Clazz;
import com.situ.spring.entity.Student;
import com.situ.spring.web.StudentController;
//帮助我们创建IOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定IOC容器使用的配置文件 
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
	//@Resource(name="studentController")
	//private StudentController studentController;
	
	@Resource(name="studentDaoTarget")
	private IStudentDao studentDao;
	
	@Test
	public void testAop() {
		studentDao.save();
	}
	
	
	@Test
	public void testSpring88() {
		//studentController.save();
	}

	@Test
	public void testSpring() {
		// 得到IOC容器对象
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取bean
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
		Clazz clazz = (Clazz) applicationContext.getBean("clazz");
		System.out.println(clazz);
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
	
	//构造方法注入
	@Test
	public void testSpringConstruor() {
		// 得到IOC容器对象
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取bean
		Student student = (Student) applicationContext.getBean("student2");
		System.out.println(student);
	}
	
	
	
}
