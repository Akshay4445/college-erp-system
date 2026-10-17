package com.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

    // Existing Methods
    List<Attendance> findByStudentStudid(Integer studid);
    List<Attendance> findByDate(LocalDate date);

    // New Methods
    List<Attendance> findBySubject(String subject);

    List<Attendance> findByTeacher(String teacher);

    List<Attendance> findByStartTime(LocalTime startTime);

    List<Attendance> findByEndTime(LocalTime endTime);

    // Filter by date + subject
    List<Attendance> findByDateAndSubject(LocalDate date, String subject);

    // Filter by student + date
    List<Attendance> findByStudentStudidAndDate(Integer studid, LocalDate date);

}
