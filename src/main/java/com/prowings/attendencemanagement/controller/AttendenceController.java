package com.prowings.attendencemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.attendencemanagement.entity.Attendence;
import com.prowings.attendencemanagement.service.AttendenceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendenceController {
	
	  @Autowired
	    private AttendenceService attendenceService;

	    @GetMapping
	    public List<Attendence> getAllAttendanceRecords() {
	        return attendenceService.getAllAttendanceRecords();
	    }

	    @GetMapping("/{id}")
	    public Attendence getAttendanceById(@PathVariable Long id) {
	        return attendenceService.getAttendanceById(id);
	    }

	    @PostMapping
	    public Attendence createAttendance(@RequestBody Attendence attendance) {
	        return attendenceService.saveAttendance(attendance);
	    }

//	    @PutMapping("/{id}")
//	    public Attendance updateAttendance(@PathVariable Long id, @RequestBody Attendance attendance) {
//	        attendance.setId(id);
//	        return attendanceService.saveAttendance(attendance);
//	    }

	    @DeleteMapping("/{id}")
	    public void deleteAttendance(@PathVariable Long id) {
	        attendenceService.deleteAttendance(id);
	    }

}
