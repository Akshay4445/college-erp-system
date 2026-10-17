package com.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "timetable")
public class TimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String day;              // MONDAY, TUESDAY, etc.
    private String subjectName;
    private String teacherName;
    private LocalTime startTime;
    private LocalTime endTime;
    private String roomNo;

    private String department;       // Example: Computer Science
    private String year;             // FY, SY, TY
    private String division;         // A, B, C

    public TimeTable() {}

    public TimeTable(String day, String subjectName, String teacherName, LocalTime startTime, LocalTime endTime, String roomNo, String department, String year, String division) {
        this.day = day;
        this.subjectName = subjectName;
        this.teacherName = teacherName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.roomNo = roomNo;
        this.department = department;
        this.year = year;
        this.division = division;
    }

    // -------- Getters & Setters ----------
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
