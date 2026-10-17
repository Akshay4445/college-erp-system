package com.service;

import com.entity.TimeTable;
import com.repository.TimeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTableService {

    @Autowired
    private TimeTableRepository repo;

    // ------- Add Time Table -------
    public TimeTable addTimeTable(TimeTable timeTable) {
        return repo.save(timeTable);
    }

    // ------- Get All Time Tables -------
    public List<TimeTable> getAllTimeTables() {
        return repo.findAll();
    }

    // ------- Get Time Table by Department / Year / Division -------
    public List<TimeTable> getTimeTableForClass(String department, String year, String division) {
        return repo.findByDepartmentAndYearAndDivision(department, year, division);
    }

    // ------- Get Time Table by Day -------
    public List<TimeTable> getByDay(String day) {
        return repo.findByDay(day);
    }

    // ------- Update Time Table -------
    public TimeTable updateTimeTable(Long id, TimeTable updated) {
        TimeTable existing = repo.findById(id).orElse(null);
        if (existing != null) {

            existing.setDay(updated.getDay());
            existing.setSubjectName(updated.getSubjectName());
            existing.setTeacherName(updated.getTeacherName());
            existing.setStartTime(updated.getStartTime());
            existing.setEndTime(updated.getEndTime());
            existing.setRoomNo(updated.getRoomNo());
            existing.setDepartment(updated.getDepartment());
            existing.setYear(updated.getYear());
            existing.setDivision(updated.getDivision());

            return repo.save(existing);
        }
        return null;
    }

    // ------- Delete Time Table -------
    public String deleteTimeTable(Long id) {
        repo.deleteById(id);
        return "Time table entry deleted: " + id;
    }
}
