package com.vm.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.springboot.entity.Studentpojo;
import com.vm.springboot.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
  StudentService studentservice;
	
	@RequestMapping("students")
  List<Studentpojo> getStudents()   //fetching all the resources
  {
	return studentservice.getStudents();
	  
  }
  
//	@RequestMapping("students/{id}")
//	Studentpojo getStudentById(@PathVariable ("id") int id)
//	{
//		return studentservice.getStudentById(id);
//		
//	}
}
