package com.sprigboot.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprigboot.school.service.SchoolService;

@Controller
@RequestMapping("api/students")

public class SchoolController {

	private SchoolService schoolService;
	
	SchoolController(SchoolService schoolService){
		this.schoolService=schoolService;
	}
	
	
	
	
	
	
	
}
