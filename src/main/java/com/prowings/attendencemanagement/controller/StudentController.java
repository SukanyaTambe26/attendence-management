package com.prowings.attendencemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.attendencemanagement.entity.Student;
import com.prowings.attendencemanagement.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	 @Autowired
	    private StudentService studentService;

	    @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Student getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }

	    @PostMapping
	    public ResponseEntity<Student>createStudent(@RequestBody Student student) {
	    	Student savedStudent= studentService.saveStudent(student); 
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
	    }

		/*
		 * @PutMapping("/{id}") public Student updateStudent(@PathVariable Long
		 * id, @RequestBody Student student) { student.setId(id); return
		 * studentService.saveStudent(student); }
		 */

	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	    }

}
