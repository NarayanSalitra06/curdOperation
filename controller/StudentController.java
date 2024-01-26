package com.example.curdopratiom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.curdopratiom.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("get")
	public List<Student> getStudent() {
		return studentService.getStudent();
	}
	@PostMapping("addstudent")
	public String addStudent(@RequestBody Student student) {
		return  studentService.addStudent(student);
	}
	@PostMapping("update")
	public String updateByid(@RequestParam int id,@RequestParam String firstName ) {
		return studentService.update(id,firstName);
	}
	@GetMapping("delete/{id}")
	public void deleteById(@PathVariable int id ) {
		studentService.deleteById(id);
	}

}
