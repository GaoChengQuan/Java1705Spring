package com.situ.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.situ.spring.dao.IStudentDao;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao{

	@Override
	public void save() {
		System.out.println("Student save");
	}

	@Override
	public void update() {
		System.out.println("Studen update");
		
	}

	@Override
	public void delete() {
		System.out.println("Studen delete");
	}

	@Override
	public void find() {
		System.out.println("Studen find");
	}
}
