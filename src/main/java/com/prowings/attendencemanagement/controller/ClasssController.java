package com.prowings.attendencemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.attendencemanagement.entity.Classs;
import com.prowings.attendencemanagement.service.ClasssService;

@RestController
@RequestMapping("/api/classes")
public class ClasssController {

	@Autowired
    private ClasssService classService;

    @GetMapping
    public List<Classs> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public Classs getClassById(@PathVariable Long id) {
        return classService.getClassById(id);
    }

    @PostMapping
    public Classs createClass(@RequestBody Classs classs) {
        return classService.saveClass(classs);
    }

//    @PutMapping("/{id}")
//    public Class updateClass(@PathVariable Long id, @RequestBody Class classs) {
//        classs.setId(id);
//        return classService.saveClass(classs);
   // }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteClasss(id);
    }
    }
