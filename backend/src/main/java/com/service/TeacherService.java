package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Teacher;
import com.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository trep;

    // SAVE
    public String save(Teacher t) {
        trep.save(t);
        return "Teacher record added successfully";
    }

    // FIND ALL
    public List<Teacher> findAll() {
        return trep.findAll();
    }

    // DELETE BY ID
    public String deleteById(int id) {
        Teacher existing = trep.findById(id).orElse(null);
        if (existing == null) {
            return "No record found for delete operation";
        }
        trep.deleteById(id);
        return "Teacher record deleted successfully";
    }

    // UPDATE BY ID
    public String updateById(int tid, Teacher newTeacher) {

        Teacher existing = trep.findById(tid).orElse(null);

        if (existing == null) {
            return "No record found for given teacher id";
        }

        // NO new data provided
        if (newTeacher.getFirstname() == null && newTeacher.getMidname() == null
                && newTeacher.getLastname() == null && newTeacher.getGender() == null
                && newTeacher.getEmail() == null && newTeacher.getContactno() == null
                && newTeacher.getAddress() == null && newTeacher.getQualification() == null
                && newTeacher.getDepartment() == null && newTeacher.getSpecialization() == null
                && newTeacher.getSalary() == null && newTeacher.getExperience() == null
                && newTeacher.getTimg() == null) {

            return "No new record provided for updation";
        }

        // FIELD-WISE UPDATE
        if (newTeacher.getFirstname() != null)
            existing.setFirstname(newTeacher.getFirstname());

        if (newTeacher.getMidname() != null)
            existing.setMidname(newTeacher.getMidname());

        if (newTeacher.getLastname() != null)
            existing.setLastname(newTeacher.getLastname());

        if (newTeacher.getGender() != null)
            existing.setGender(newTeacher.getGender());

        if (newTeacher.getEmail() != null)
            existing.setEmail(newTeacher.getEmail());

        if (newTeacher.getContactno() != null)
            existing.setContactno(newTeacher.getContactno());

        if (newTeacher.getAddress() != null)
            existing.setAddress(newTeacher.getAddress());

        if (newTeacher.getQualification() != null)
            existing.setQualification(newTeacher.getQualification());

        if (newTeacher.getDepartment() != null)
            existing.setDepartment(newTeacher.getDepartment());

        if (newTeacher.getSpecialization() != null)
            existing.setSpecialization(newTeacher.getSpecialization());

        if (newTeacher.getSalary() != null)
            existing.setSalary(newTeacher.getSalary());

        if (newTeacher.getExperience() != null)
            existing.setExperience(newTeacher.getExperience());

        if (newTeacher.getTimg() != null)
            existing.setTimg(newTeacher.getTimg());

        trep.save(existing);
        return "Teacher record updated successfully";
    }

    // FIND BY ID
    public Teacher findById(int id) {
        return trep.findById(id).orElse(null);
    }

    // SEARCH METHODS
    public List<Teacher> findByFirstname(String fname) {
        return trep.findByFirstname(fname);
    }

    public List<Teacher> findByLastname(String lname) {
        return trep.findByLastname(lname);
    }

    public List<Teacher> findByDepartment(String dept) {
        return trep.findByDepartment(dept);
    }

    public List<Teacher> findBySpecialization(String sp) {
        return trep.findBySpecialization(sp);
    }
}
