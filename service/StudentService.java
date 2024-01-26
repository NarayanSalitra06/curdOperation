package com.example.curdopratiom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curdopratiom.dou.DouStudent;
import com.example.curdopratiom.model.Student;

@Service
public class StudentService {
	@Autowired
	DouStudent douStudent;
	
	

	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		
		douStudent.save(student);
		return "sucess";
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return douStudent.findAll();
	}


	
	public String update(int id, String firstName) {
		
		Student student=douStudent.getById(id);
		student.setFirstName(firstName);
		douStudent.save(student);
		
		return "update succes";
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		douStudent.deleteById(id);
	}
	

}
