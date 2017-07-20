package com.situ.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{
	@Resource(name="studentDao")
	private IStudentDao studentDao;

	@Override
	public void save() {
		studentDao.save();
	}

}
