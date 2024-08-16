package com.prowings.attendencemanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.attendencemanagement.entity.Classs;

public interface ClasssRepository extends JpaRepository<Classs, Long> {
	
	public List<Classs> findAll();
	
	public Optional<Classs> findById(Long id);
	
	 public Classs save(Classs classs);
	 
	 public void deleteById(int id) ;

}
