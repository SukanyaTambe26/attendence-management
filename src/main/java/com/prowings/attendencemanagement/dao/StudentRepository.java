package com.prowings.attendencemanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.attendencemanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findAll();
	
	public Student findById(int id);
	
	public Student save(Student student);
	
	public void deleteById(Long id);

}
