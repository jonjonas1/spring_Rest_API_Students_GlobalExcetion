package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	public StudentRestController() {
		loadData();
	}

	// create reusable list
	private List<Student> theStudents;

	// define @PostConstructor to load the student data .. only once

//	@PostConstruct  // Did not work, below called constructor instead
	public void loadData() {
		theStudents = new ArrayList<>();

		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudents(@PathVariable int studentId) {
		
		if ( (studentId >= theStudents.size()) || (studentId < 0) ) {			
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		
		return theStudents.get(studentId);
	}
	
	
}
