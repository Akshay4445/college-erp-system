package com.service;

import com.entity.ExamSchedule;
import com.repository.ExamScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamScheduleService {

    private final ExamScheduleRepository examScheduleRepository;

    public ExamScheduleService(ExamScheduleRepository examScheduleRepository) {
        this.examScheduleRepository = examScheduleRepository;
    }

    // Get all schedules
    public List<ExamSchedule> getAllSchedules() {
        return examScheduleRepository.findAll();
    }

    // Get schedule by ID
    public Optional<ExamSchedule> getScheduleById(Long id) {
        return examScheduleRepository.findById(id);
    }

    // Add new schedule
    public ExamSchedule addSchedule(ExamSchedule schedule) {
        return examScheduleRepository.save(schedule);
    }

    // Update existing schedule
    public ExamSchedule updateSchedule(Long id, ExamSchedule schedule) {
        return examScheduleRepository.findById(id)
                .map(existing -> {
                    existing.setExamName(schedule.getExamName());
                    existing.setSubjectName(schedule.getSubjectName());
                    existing.setExamDate(schedule.getExamDate());
                    existing.setStartTime(schedule.getStartTime());
                    existing.setEndTime(schedule.getEndTime());
                    existing.setDepartment(schedule.getDepartment());
                    return examScheduleRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("ExamSchedule not found with id " + id));
    }

    // Delete schedule
    public void deleteSchedule(Long id) {
        examScheduleRepository.deleteById(id);
    }

    // Get schedules by department
    public List<ExamSchedule> getSchedulesByDepartment(String department) {
        return examScheduleRepository.findByDepartment(department);
    }
}
