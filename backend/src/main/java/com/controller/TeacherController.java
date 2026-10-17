package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Teacher;
import com.service.TeacherService;

@RestController
@CrossOrigin
public class TeacherController {

    @Autowired
    TeacherService service;

    // SAVE TEACHER
    @PostMapping("/addteacher")
    public String save(@RequestBody Teacher t) {
        return service.save(t);
    }

    // FIND ALL TEACHERS
    @GetMapping("/findallteacher")
    public List<Teacher> findAllTeacher() {
        return service.findAll();
    }

    // DELETE TEACHER BY ID
    @DeleteMapping("/deleteteacher")
    public String deleteById(@RequestParam int id) {
        return service.deleteById(id);
    }

    // UPDATE TEACHER BY ID
    @PutMapping("/updateteacher")
    public String updateTeacher(@RequestParam int tid, @RequestBody Teacher newtch) {
        return service.updateById(tid, newtch);
    }

    // FIND TEACHER BY ID
    @GetMapping("/findteacherbyid")
    public Teacher findTeacherById(@RequestParam int tid) {
        return service.findById(tid);
    }

    // FIND BY FIRSTNAME
    @GetMapping("/findteacherbyfirstname")
    public List<Teacher> findByFirstname(@RequestParam String fname) {
        return service.findByFirstname(fname);
    }

    // FIND BY LASTNAME
    @GetMapping("/findteacherbylastname")
    public List<Teacher> findByLastname(@RequestParam String lname) {
        return service.findByLastname(lname);
    }

    // FIND BY DEPARTMENT
    @GetMapping("/findteacherbydepartment")
    public List<Teacher> findByDepartment(@RequestParam String department) {
        return service.findByDepartment(department);
    }

    // FIND BY SPECIALIZATION
    @GetMapping("/findteacherbyspecialization")
    public List<Teacher> findBySpecialization(@RequestParam String specialization) {
        return service.findBySpecialization(specialization);
    }
}
