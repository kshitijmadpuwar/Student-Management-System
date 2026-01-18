package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	//=================================================================
	// This class is used for Writing API and where handle the request.
	//=================================================================
	
	
	@Autowired StudentService studentService;
	
	//============== Post:- SaveAllData ==============================
	@PostMapping("/saveData")
	public ResponseEntity<String> saveStudentData(@RequestBody Student st) {
		this.studentService.saveStudentData(st);
		return new ResponseEntity<>("Data Saved..!",HttpStatus.OK);
	}
	
	//============= Get:-GetAllData ==============================
	@GetMapping("/getAllData")
	public List<Student> getStudentData() {
		List<Student> st = this.studentService.getStudentData();
		return st;
	}
	 
	//============== Get:- GetDataByID ==============================
	@GetMapping("/getDataById/{id}")
	public Student getDataById(@PathVariable int id) {
		Student st = this.studentService.getStudentDataById(id);
		return st;
	}
	
	//============== Delete:- DeleteStudentRecord ==============================
	@DeleteMapping("/delectRecord")
	public String delectStudentRecord() {
		this.studentService.deleteStudentData();
		return "Data Deleted..!";
	}
	
	
	//============== Delete:- DeleteStudentRecordByID ==============================
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentRecordById(@PathVariable int id) {
		this.studentService.deleteById(id);
		return "Data Deleted...!";
	}
	
	//============== Put:- UpdateFullRecord  ==============================
	@PutMapping("/updateFullData/{id}")
	public Student UpdateFullStudentData(@PathVariable int id, @RequestBody Student student) {
		     return this.studentService.updateFullStudentData(id, student);
		
	}
	
	
	//============== Patch:- UpdateStudent partial Data ==============================
	@PatchMapping("/updateDetails/{id}")
	public Student upadtepartialStudentData(@PathVariable int id, @RequestBody Map<String, Object> student) {
		return this.studentService.partialUpdate(id, student);
		
	}
	
}
