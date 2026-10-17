package com.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Attendance;
import com.entity.Student;
import com.repository.AttendanceRepository;
import com.repository.StudentRepository;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepo;

    @Autowired
    private StudentRepository studentRepo;

    // ================================
    // Add Attendance with new fields
    // ================================
    public Attendance addAttendance(
            Integer studid,
            String status,
            LocalDate date,
            String subject,
            String teacher,
            LocalTime startTime,
            LocalTime endTime) {

        Student stud = studentRepo.findById(studid)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        Attendance att = new Attendance();
        att.setStudent(stud);
        att.setStatus(status);
        att.setDate(date);
        att.setSubject(subject);
        att.setTeacher(teacher);
        att.setStartTime(startTime);
        att.setEndTime(endTime);

        return attendanceRepo.save(att);
    }

    // ================================
    // Get Attendance by Student
    // ================================
    public List<Attendance> getStudentAttendance(Integer studid) {
        return attendanceRepo.findByStudentStudid(studid);
    }

    // ================================
    // Get Attendance by Date
    // ================================
    public List<Attendance> getAttendanceByDate(LocalDate date) {
        return attendanceRepo.findByDate(date);
    }

    // ================================
    // Get All Attendance
    // ================================
    public List<Attendance> getAll() {
        return attendanceRepo.findAll();
    }
    public List<Attendance> getAttendanceBySubject(String subject) {
        return attendanceRepo.findBySubject(subject);
    }
    public void deleteAttendance(Integer attId) {
        attendanceRepo.deleteById(attId);
    }

}
