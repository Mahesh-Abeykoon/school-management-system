package com.sprigboot.school.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sprigboot.school.model.School;
import com.sprigboot.school.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/schools")

public class SchoolController {

	private SchoolService schoolService;
	
	SchoolController(SchoolService schoolService){
		this.schoolService=schoolService;
	}
	
	//to post details of school managing
	@PostMapping("/saveSchool")
	public School saveSchoolDetails (@RequestBody School school) {
		return schoolService.saveSchool(school);	 
	}
	
	//to get all the exisiting details of school system
	@GetMapping()
	public List<School> getAllDetails(){
		return schoolService.getAllSchoolDetails();
	}
	
	//to get some specific details of the school
	@GetMapping("{id}")
	public Optional<School> getDetailById(@PathVariable ("id") long schId) {
		return schoolService.getSchoolDetailById(schId);
	}
	
	//to delte specific details using the id
	@DeleteMapping("{id}")
	public ResponseEntity <String> deleteSchool(@PathVariable ("id") long id) {
		
		 schoolService.deleteSchoolDetails(id);
		 return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	
	}
	
}
