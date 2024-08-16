package com.prowings.attendencemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.prowings.attendencemanagement.dao.ClasssRepository;
import com.prowings.attendencemanagement.entity.Classs;

@Service
public class ClasssService {
	
	@Autowired
    private ClasssRepository classRepository;

    public List<Classs> getAllClasses() {
        return classRepository.findAll();
    }

    public Classs getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public Classs saveClass(Classs classs) {
        return classRepository.save(classs);
    }

    public void deleteClasss(Long id) {
        classRepository.deleteById(id);
    }

}
