package com.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance_table")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attId;

    private LocalDate date;

    private String status;      // Present / Absent

    private String subject;

    private String teacher;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToOne
    @JoinColumn(name = "studid")
    private Student student;

    public Attendance() {}

    public Attendance(Integer attId, LocalDate date, String status,
                      String subject, String teacher,
                      LocalTime startTime, LocalTime endTime, Student student) {
        this.attId = attId;
        this.date = date;
        this.status = status;
        this.subject = subject;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;
        this.student = student;
    }

    public Integer getAttId() { return attId; }
    public void setAttId(Integer attId) { this.attId = attId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getTeacher() { return teacher; }
    public void setTeacher(String teacher) { this.teacher = teacher; }

    public LocalTime getStartTime() { return startTime; }
    public void setStartTime(LocalTime startTime) { this.startTime = startTime; }

    public LocalTime getEndTime() { return endTime; }
    public void setEndTime(LocalTime endTime) { this.endTime = endTime; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
