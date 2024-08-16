package com.prowings.attendencemanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.attendencemanagement.entity.Attendence;

public interface AttendanceRepository extends JpaRepository<Attendence, Long>{
	
	public List<Attendence> findAll();
	
	 public Optional<Attendence> findById(Long id);
	 
	    public Attendence save(Attendence attendance);
	    
	    public void deleteById(int id);

}
