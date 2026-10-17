package com.controller;

import com.entity.TimeTable;
import com.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TimeTableController {

    @Autowired
    private TimeTableService service;

    // ---------------- Add Time Table ----------------
    @PostMapping("/addTimeTable")
    public TimeTable addTimeTable(@RequestBody TimeTable timeTable) {
        return service.addTimeTable(timeTable);
    }

    // ---------------- Get All Time Tables ----------------
    @GetMapping("/getAllTimeTable")
    public List<TimeTable> getAllTimeTables() {
        return service.getAllTimeTables();
    }

    // ---------------- Get Time Table for a Class ----------------
    @GetMapping("/getClassTimeTable")
    public List<TimeTable> getClassTimeTable(
            @RequestParam String department,
            @RequestParam String year,
            @RequestParam String division) {

        return service.getTimeTableForClass(department, year, division);
    }

    // ---------------- Get Time Table by Day ----------------
    @GetMapping("/getTimeTableByDay/{day}")
    public List<TimeTable> getTimeTableByDay(@PathVariable String day) {
        return service.getByDay(day);
    }

    // ---------------- Update Time Table ----------------
    @PutMapping("/updateTimeTable/{id}")
    public TimeTable updateTimeTable(@PathVariable Long id, @RequestBody TimeTable timeTable) {
        return service.updateTimeTable(id, timeTable);
    }

    // ---------------- Delete Time Table ----------------
    @DeleteMapping("/deleteTimeTable/{id}")
    public String deleteTimeTable(@PathVariable Long id) {
        return service.deleteTimeTable(id);
    }
}
