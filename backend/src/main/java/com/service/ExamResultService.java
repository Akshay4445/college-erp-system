package com.service;

import com.entity.ExamResult;
import com.entity.Student;
import com.repository.ExamResultRepository;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamResultService {

    @Autowired
    private ExamResultRepository examResultRepository;

    @Autowired
    private StudentRepository studentRepository;

    // Save Exam Result
    public ExamResult saveExamResult(ExamResult examResult) {

        // Fetch full student data using student id
        Student student = studentRepository.findById(
                examResult.getStudent().getStudid()
        ).orElseThrow(() -> new RuntimeException("Student Not Found"));

        examResult.setStudent(student);

        return examResultRepository.save(examResult);
    }

    // Get result by id
    public ExamResult getExamResultById(Long id) {
        return examResultRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Result Not Found"));
    }

    // Get all results
    public List<ExamResult> getAllExamResults() {
        return examResultRepository.findAll();
    }

 
    // Delete result
    public void deleteExamResult(Long id) {
        examResultRepository.deleteById(id);
    }
    public List<ExamResult> getResultsByStudentId(Integer studid) {
        return examResultRepository.findByStudent_Studid(studid);
    }
    public List<ExamResult> getResultsByExamId(Long examId) {
        return examResultRepository.findByExamId(examId);
    }
    public List<ExamResult> getResultsBySubjectId(Long subjectId) {
        return examResultRepository.findBySubjectId(subjectId);
    }


}
