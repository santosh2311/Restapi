package com.Springboot.YT;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	@GetMapping("/student")
	
	public Student getStudent() {
		
		return new Student("Prince", "Jaywanshi");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
	List<Student> std = new ArrayList<>();
		
		std.add(new Student("Prince","Singh"));
		std.add(new Student("Shubham","Singh"));
		std.add(new Student("Pritam","Singh"));
		std.add(new Student("Dhiraj","Singh"));
		std.add(new Student("Niraj","Singh"));
		
		return std;
	}

}
