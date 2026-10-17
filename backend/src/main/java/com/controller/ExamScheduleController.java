package com.controller;

import com.entity.ExamSchedule;
import com.service.ExamScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/exams/schedule")
@CrossOrigin
public class ExamScheduleController {

    private final ExamScheduleService examScheduleService;

    public ExamScheduleController(ExamScheduleService examScheduleService) {
        this.examScheduleService = examScheduleService;
    }

    // Get all exam schedules
    @GetMapping
    public List<ExamSchedule> getAllSchedules() {
        return examScheduleService.getAllSchedules();
    }

    // Get exam schedule by ID
    @GetMapping("/{id}")
    public Optional<ExamSchedule> getScheduleById(@PathVariable Long id) {
        return examScheduleService.getScheduleById(id);
    }

    // Add new exam schedule
    @PostMapping
    public ExamSchedule addSchedule(@RequestBody ExamSchedule schedule) {
        return examScheduleService.addSchedule(schedule);
    }

    // Update exam schedule
    @PutMapping("/{id}")
    public ExamSchedule updateSchedule(@PathVariable Long id, @RequestBody ExamSchedule schedule) {
        return examScheduleService.updateSchedule(id, schedule);
    }

    // Delete exam schedule
    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        examScheduleService.deleteSchedule(id);
    }

    // Get exam schedules by department
    @GetMapping("/department/{department}")
    public List<ExamSchedule> getSchedulesByDepartment(@PathVariable String department) {
        return examScheduleService.getSchedulesByDepartment(department);
    }
}
