package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entity.TimeTable;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, Long> {

    // Custom Methods (optional)

    // Get Timetable by department, year, division
    List<TimeTable> findByDepartmentAndYearAndDivision(String department, String year, String division);

    // Get Timetable by day
    List<TimeTable> findByDay(String day);
}
