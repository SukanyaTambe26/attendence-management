package com.prowings.attendencemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.attendencemanagement.dao.AttendanceRepository;
import com.prowings.attendencemanagement.entity.Attendence;

@Service
public class AttendenceService {
	
	@Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendence> getAllAttendanceRecords() {
        return attendanceRepository.findAll();
    }

    public Attendence getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    public Attendence saveAttendance(Attendence attendance) {
        return attendanceRepository.save(attendance);
    }

    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }

}
