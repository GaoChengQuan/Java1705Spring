package com.situ.spring.test;

import org.junit.Test;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.dao.impl.StudentDaoImpl;
import com.situ.spring.dao.impl.StudentDaoProxy;

public class ProxyTest {
	
	@Test
	public void testProxy1() {
		IStudentDao target = new StudentDaoImpl();
		IStudentDao proxy = new StudentDaoProxy(target);
		proxy.save();
	}
	
	@Test
	public void testProxy2() {
		//1、目标对象
		IStudentDao target = new StudentDaoImpl();
		//2.给目标对象创建代理对象
		IStudentDao proxy = (IStudentDao) new ProxyFactory(target).getProxtInstance();
		proxy.save();
	}
	
	
	
	
	@Test
	public void test() {
		// 目标对象
		IStudentDao target = new StudentDaoImpl();
		// 给目标对象，创建代理对象
		IStudentDao proxy = (IStudentDao) new ProxyFactory(target)
				.getProxtInstance();
		// 执行方法 【代理对象】
		proxy.save();
	}
	
	
}
