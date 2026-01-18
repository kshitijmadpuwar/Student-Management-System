package com.example.demo.service;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	//=================================================================
	// This class is used for Writing Bussiness Logic
	//=================================================================
	
	@Autowired
	StudentRepository studentRepository;
	

	//Save Student Details.
	public void saveStudentData(Student st) {
	this.studentRepository.save(st);
		
	}
	
	//Get Student Data.
	public List<Student> getStudentData() {
		List<Student> list = this.studentRepository.findAll();
		return list;
	}
	
	//Get Student DataById
	public Student getStudentDataById(int id) {
		Student st= this.studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found "+id));
		return st;
	}
	
	//Delete Student Data
	public void deleteStudentData() {
		this.studentRepository.deleteAll();
	}
	
	//Deleted By Id
	public void deleteById(int id) {
		
		this.studentRepository.deleteById(id);
		
	}
	
	// Update Student Data_PUT method
	public Student updateFullStudentData(int id,Student newStudent) {
		
		Student oldStudent= studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found "+id));
		
		oldStudent.setStudentName(newStudent.getStudentName());
		oldStudent.setStudentEmailId(newStudent.getStudentName());
		oldStudent.setCourse(newStudent.getCourse());
		
		return studentRepository.save(oldStudent);// FULL UPDATE;
	}
	
	//Partial Update
	public Student partialUpdate(int id, Map<String, Object> updates) {

	    Student student = studentRepository.findById(id)
	        .orElseThrow(() -> new StudentNotFoundException("Student not found "+id));

	    // Only update provided fields
	    if (updates.containsKey("studentName")) {
	        student.setStudentName((String) updates.get("studentName"));
	    }
	    if (updates.containsKey("course")) {
	        student.setCourse((String) updates.get("course"));
	    }    
	    if (updates.containsKey("studentEmailId")) {
	        student.setStudentEmailId((String) updates.get("studentEmailId"));
	    }
	    
	    return studentRepository.save(student);  // PARTIAL UPDATE
	}

	
	
	
}
