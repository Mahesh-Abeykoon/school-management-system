package com.sprigboot.school.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.sprigboot.school.model.School;
import com.sprigboot.school.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public Optional<School> getDetailById(@PathVariable ("id") long id) {
		return schoolService.getSchoolDetailById(id);
	}
	
}
