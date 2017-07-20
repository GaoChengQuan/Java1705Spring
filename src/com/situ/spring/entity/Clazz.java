package com.situ.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// <bean name="clazz" class="com.situ.spring.entity.Clazz"/>
@Component("clazz")
public class Clazz {
	@Value("33")
	private Integer id;
	//通过反射Field，赋值
	@Value("Java1705")
	private String name;
	
	//通过set方法赋值
	@Value("Java1705")
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + "]";
	}

}
