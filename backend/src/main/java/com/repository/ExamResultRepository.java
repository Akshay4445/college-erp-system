package com.repository;

import com.entity.ExamResult;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamResultRepository extends JpaRepository<ExamResult, Long> {

    // Fetch results by student
	List<ExamResult> findByStudent_Studid(Integer studid);

    // Fetch results by exam
    List<ExamResult> findByExamId(Long examId);

    // Fetch results by subject
    List<ExamResult> findBySubjectId(Long subjectId);
}
