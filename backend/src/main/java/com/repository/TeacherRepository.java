package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    //  Find by Firstname
    List<Teacher> findByFirstname(String firstname);

    //  Find by Lastname
    List<Teacher> findByLastname(String lastname);

    //  Find by Department
    List<Teacher> findByDepartment(String department);

    // Find by Specialization
    List<Teacher> findBySpecialization(String specialization);

  
}
