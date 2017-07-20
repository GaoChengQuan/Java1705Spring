package com.situ.spring.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 给所有的dao创建代理对象【动态代理】
 * 代理对象，不需要实现接口
 */

public class ProxyFactory {
	/** 维护一个目标对象 */
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxtInstance() {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),//指定当前目标对象使用类加载器
				target.getClass().getInterfaces(), //目标对象实现的接口的类型
				new InvocationHandler() {		   //事件处理器

					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						System.out.println("开启事务");
						// 执行目标对象的方法
						Object returnValue = method.invoke(target, args);
						System.out.println("关闭事务");
						return returnValue;
					}
				});
	}
}
