package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Teachers;

@RestController
@RequestMapping("/api")
public class TeacherRestController {
	
	public TeacherRestController() {
		loadData();
	}
	private List<Teachers> theTeacher;
	
	public void loadData() {
		theTeacher = new ArrayList<Teachers>();
				
		theTeacher.add(new Teachers("Teacher", "First"));
		theTeacher.add(new Teachers("Teacher","Second"));
		theTeacher.add(new Teachers("Teacher", "Third"));
	}
	
	
	@GetMapping("/teachers")
	public List<Teachers> getTeachers() {
		return theTeacher;
	}

	@GetMapping("/teachers/{teacherId}")
	public Teachers getTeacher(@PathVariable int teacherId) {
		return theTeacher.get(teacherId);
	}
	
}
