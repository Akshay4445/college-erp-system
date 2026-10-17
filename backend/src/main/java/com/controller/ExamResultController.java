package com.controller;

import com.DTO.ExamResultDto;

import com.entity.ExamResult;
import com.entity.Student;
import com.service.ExamResultService;
import com.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examresult")
@CrossOrigin(origins = "*")
public class ExamResultController {

    @Autowired
    private ExamResultService examResultService;
    @Autowired
    private StudentService studentService; // <-- inject repository

    // Save Exam Result
    @PostMapping("/addResult")
    public ExamResult addResult(@RequestBody ExamResultDto dto) {
        if(dto.getStudid() == null) {
            throw new RuntimeException("Student ID is required!");
        }

        Student student = studentService.findstudbyid(dto.getStudid()); // already throws if not found

        ExamResult examResult = new ExamResult();
        examResult.setStudent(student);
        examResult.setExamId(dto.getExamId());
        examResult.setSubjectId(dto.getSubjectId());
        examResult.setSubjectName(dto.getSubjectName());
        examResult.setTotalMarks(dto.getTotalMarks());
        examResult.setMarksObtained(dto.getMarksObtained());
        examResult.setPassed(dto.getPassed());
        examResult.setGrade(dto.getGrade());

        return examResultService.saveExamResult(examResult);
    }





    // Get result by ID
    @GetMapping("/{id}")
    public ExamResult getExamResultById(@PathVariable Long id) {
        return examResultService.getExamResultById(id);
    }

    // Get all results
    @GetMapping("/all")
    public List<ExamResult> getAllExamResults() {
        return examResultService.getAllExamResults();
    }

    // Get results by student ID
    @GetMapping("/student/{studid}")
    public List<ExamResult> getResultsByStudentId(@PathVariable Integer studid) {
        return examResultService.getResultsByStudentId(studid);
    }

    // Get results by exam ID
    @GetMapping("/exam/{examId}")
    public List<ExamResult> getResultsByExamId(@PathVariable Long examId) {
        return examResultService.getResultsByExamId(examId);
    }

    // Get results by subject ID
    @GetMapping("/subject/{subjectId}")
    public List<ExamResult> getResultsBySubjectId(@PathVariable Long subjectId) {
        return examResultService.getResultsBySubjectId(subjectId);
    }

    // Delete result
    @DeleteMapping("/delete/{id}")
    public String deleteExamResult(@PathVariable Long id) {
        examResultService.deleteExamResult(id);
        return "Exam Result Deleted Successfully with ID = " + id;
    }
}
