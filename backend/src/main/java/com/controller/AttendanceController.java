package com.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.Attendance;
import com.service.AttendanceService;

@RestController
@CrossOrigin
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    // ======================================
    // Add Attendance - with new fields
    // ======================================
    @PostMapping("/addAttendance")
    public Attendance addAttendance(
            @RequestParam Integer studid,
            @RequestParam String status,
            @RequestParam String date,
            @RequestParam String subject,
            @RequestParam String teacher,
            @RequestParam String startTime,
            @RequestParam String endTime) {

        return attendanceService.addAttendance(
                studid,
                status,
                LocalDate.parse(date),
                subject,
                teacher,
                LocalTime.parse(startTime),
                LocalTime.parse(endTime)
        );
    }

    // ======================================
    // Get Attendance by Student
    // ======================================
    @GetMapping("/attendanceByStudent/{id}")
    public List<Attendance> getByStudent(@PathVariable Integer id) {
        return attendanceService.getStudentAttendance(id);
    }

    // ======================================
    // Get Attendance by Date
    // ======================================
    @GetMapping("/attendanceByDate/{date}")
    public List<Attendance> getByDate(@PathVariable String date) {
        return attendanceService.getAttendanceByDate(LocalDate.parse(date));
    }

    // ======================================
    // Get All
    // ======================================
    @GetMapping("/getAllAttendance")
    public List<Attendance> getAll() {
        return attendanceService.getAll();
    }
 // Get Attendance by Subject
    @GetMapping("/attendanceBySubject/{subject}")
    public List<Attendance> getBySubject(@PathVariable String subject) {
        return attendanceService.getAttendanceBySubject(subject);
    }
    @DeleteMapping("/deleteAttendance/{id}")
    public void deleteAttendance(@PathVariable Integer id) {
        attendanceService.deleteAttendance(id);
    }


}
