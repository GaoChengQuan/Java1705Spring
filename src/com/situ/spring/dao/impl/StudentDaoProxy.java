package com.situ.spring.dao.impl;

import com.situ.spring.dao.IStudentDao;

public class StudentDaoProxy implements IStudentDao{
	private IStudentDao studentDao;
	
	public StudentDaoProxy(IStudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public void save() {
		System.out.println("开启事务");
		studentDao.save();
		System.out.println("关闭事务");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}
}
