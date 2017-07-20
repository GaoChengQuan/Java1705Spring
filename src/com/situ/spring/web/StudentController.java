package com.situ.spring.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.situ.spring.service.IStudentService;

@Controller("studentController")
public class StudentController {
	@Resource(name="studentService")
	private IStudentService studentService;

	public void save() {
		studentService.save();
	}
}
