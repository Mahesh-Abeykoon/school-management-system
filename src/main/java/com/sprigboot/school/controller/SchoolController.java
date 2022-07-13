package com.sprigboot.school.controller;



import org.springframework.web.bind.annotation.PostMapping;


import com.sprigboot.school.model.School;
import com.sprigboot.school.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schools")

public class SchoolController {

	private SchoolService schoolService;
	
	SchoolController(SchoolService schoolService){
		this.schoolService=schoolService;
	}
	
	@PostMapping()
	public School saveSchoolDetails (@RequestBody School school) {
		return schoolService.saveSchool(school);
		 
		 
	}
	
	
	
	
	
}
