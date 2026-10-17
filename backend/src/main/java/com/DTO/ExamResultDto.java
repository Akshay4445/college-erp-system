package com.DTO;
public class ExamResultDto {
    private Integer studid;
    private Long examId;
    private Long subjectId;
    private String subjectName;
    private Integer totalMarks;
    private Integer marksObtained;
    private Boolean passed;
    private String grade;
	public Integer getStudid() {
		return studid;
	}
	public void setStudid(Integer studid) {
		this.studid = studid;
	}
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Integer getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(Integer marksObtained) {
		this.marksObtained = marksObtained;
	}
	public Boolean getPassed() {
		return passed;
	}
	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public ExamResultDto() {
		super();
	}
	public ExamResultDto(Integer studid, Long examId, Long subjectId, String subjectName, Integer totalMarks,
			Integer marksObtained, Boolean passed, String grade) {
		super();
		this.studid = studid;
		this.examId = examId;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.totalMarks = totalMarks;
		this.marksObtained = marksObtained;
		this.passed = passed;
		this.grade = grade;
	}
	
    
    // getters & setters
}
