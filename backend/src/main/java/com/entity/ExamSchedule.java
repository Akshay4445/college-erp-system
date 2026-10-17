package com.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "exam_schedule")
public class ExamSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String examName;
    private String subjectName;    // Name of the subject
    private LocalDate examDate;      // Exam date
    private LocalTime startTime;     // Exam start time
    private LocalTime endTime;       // Exam end time
    private String department;
	public ExamSchedule() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public LocalDate getExamDate() {
		return examDate;
	}
	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ExamSchedule(Long id, String examName, String subjectName, LocalDate examDate, LocalTime startTime,
			LocalTime endTime, String department) {
		super();
		this.id = id;
		this.examName = examName;
		this.subjectName = subjectName;
		this.examDate = examDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.department = department;
	}
    


}