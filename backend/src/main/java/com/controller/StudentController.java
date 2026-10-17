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

import com.entity.Student;
import com.service.StudentService;

@RestController
@CrossOrigin


public class StudentController {
	@Autowired
	StudentService service;
	

	@PostMapping("/addstudent12")
	public String save(@RequestBody Student s)
	{
		return service.save(s);
	}
	@GetMapping("/findallstud")
	public List<Student>findallstud()
	{
		return service.findall();
	}
	@DeleteMapping("/deletebyid")
	public String deletebyid(@RequestParam int id)
	{
		return service.deletebyid(id);
	}
	@PutMapping("/updatebyid")
	public String updatebyid (@RequestParam int sid ,@RequestBody Student newstud)
	{
		return service.updatebyid(sid,newstud);
	}
	@GetMapping("/findsid")
	public Student findbysid(@RequestParam int sid) {
		return service.findstudbyid(sid);
	}
	@GetMapping("/findbyfirstname")
    public List<Student> findbyfirstname(@RequestParam String fname) {
    	return service.findbyfirstname(fname);
    }
    
    @GetMapping("/findbylastname")
    public List<Student> findbylastname(@RequestParam String lname) {
    	return service.findbylastname(lname);
    }
    
    @GetMapping("/findbybranch")
    public List<Student> findByBranch(@RequestParam String branch) {
    	return service.findByBranch(branch);
    }
    
    @GetMapping("/findbyprnno")
    public List<Student>findByPrnno(@RequestParam String prnno) {
    	return service.findByPrnno(prnno);
}
}