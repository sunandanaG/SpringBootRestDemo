package com.vm.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vm.springboot.entity.Studentpojo;

@Service
public class StudentService {
	List<Studentpojo>students;
	
	List<Studentpojo>createStudents()
	{
		List<Studentpojo>students=new ArrayList<Studentpojo>();
		students.add(new Studentpojo(111,"abc",35,5));
		students.add(new Studentpojo(222,"bbb",50,4));
		students.add(new Studentpojo(333,"ccc",65,4));
		students.add(new Studentpojo(444,"ddd",100,10));
		return students;
		
		
	}
public List<Studentpojo>getStudents()
{
	createStudents();
	return students;
	
}
//public Studentpojo getStudentById(int id) 
//{
//	// TODO Auto-generated method stub
//	createStudents();//
//	return students.stream().filter(s->s.getId() == id).findFirst().get();
//	
//}
}
