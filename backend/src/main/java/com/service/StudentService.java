package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository sresp;
	//save
	public String save(Student s)
	{
		
		sresp.save(s);
		return "Student record added successfully";
	}
	//find all
	public List<Student>findall()
	{
		return sresp.findAll();
	}

	
	//deletebyid
	public String deletebyid(int id)
	{
		Student existingstud=sresp.findById(id).orElse(null);
		if(existingstud==null)
		{
			return "no record found for delete operation";
		}
		else
		{
			sresp.deleteById(id);
			return"Student record deleted successfully";
		}
	}
	//updatebyid
	public String updatebyid(int sid,Student newstud)
	{
		Student existingstud=sresp.findById(sid) .orElse(null);
		  if(existingstud==null)
		  {
			  return "No record found for given sid";
		  }
		  if(newstud.getFirstname()==null&&newstud.getLastname()==null&&
				  newstud.getGender()==null
				  &&newstud.getEmail()==null&&newstud.getContactno()==0&&
						  newstud.getAdarcardno()==0
				  &&newstud.getMidname()==null&&newstud.getPrnno()==null
				  &&newstud.getDob()==null&&newstud.getAddress()==null
				  &&newstud.getPanno()==null&&newstud.getBranch()==null&&newstud.getStudimg()==null
				  &&newstud.getReportingauthority()==null&&newstud.getCurrentyear()==0)
			  
		  {
			  return "No new record provided for updation";
		  }
		  if(newstud.getFirstname()!=null)
		  {
			  existingstud.setFirstname(newstud.getFirstname());
		  }
		  if(newstud.getLastname()!=null)
		  {
			  existingstud.setLastname(newstud.getLastname());
		  }
		  if(newstud.getGender()!=null)
		  {
			  existingstud.setGender(newstud.getGender());
		  }
		  if(newstud.getEmail()!=null)
		  {
			  existingstud.setEmail(newstud.getEmail());
		  }
		  if(newstud.getContactno()!=0)
		  {
			  existingstud.setContactno(newstud.getContactno());
		  }
		  if(newstud.getMidname()!=null)
		  {
			  existingstud.setMidname(newstud.getMidname());
		  }
		  if(newstud.getAddress()!=null)
		  {
			  existingstud.setAddress(newstud.getAddress());
		  }
		  if(newstud.getAdarcardno()!=0)
		  {
			  existingstud.setAdarcardno(newstud.getAdarcardno());
		  }
		  if(newstud.getPanno()!=null)
		  {
			  existingstud.setPanno(newstud.getPanno());;
		  }
		  if(newstud.getDob()!=null)
		  {
			  existingstud.setDob(newstud.getDob());
		  }
		  if(newstud.getBranch()!=null)
		  {
			  existingstud.setBranch(newstud.getBranch());
		  }
		  if(newstud.getCurrentyear()!=0)
		  {
			  existingstud.setCurrentyear(newstud.getCurrentyear());
		  }
		  if(newstud.getReportingauthority()!=null)
		  {
			  existingstud.setReportingauthority(newstud.getReportingauthority());
		  }
		  if(newstud.getStudimg()!=null)
		  {
			  existingstud.setStudimg(newstud.getStudimg());
		  }
		  if(newstud.getPrnno()!=null)
		  {
			  existingstud.setPrnno(newstud.getPrnno());
		  }
		  
		  sresp.save(existingstud);
		  return "Student record updated sucessfully";
	}
	public Student findstudbyid(int empid) {
		   return sresp.findById(empid).orElse(null);
	   }
	   
	   public List<Student>findbyfirstname(String fname){
		   return sresp.findByFirstname(fname);
	   }
	   
	   public List<Student>findbylastname(String lname){
		   return sresp.findByLastname(lname);
	   }
	   
	   public List<Student>findByBranch(String branch){
		   return sresp.findByBranch(branch);
	   }
	   
	   public List<Student>findByPrnno(String prnno){
		   return sresp.findByPrnno(prnno);
	   }


}