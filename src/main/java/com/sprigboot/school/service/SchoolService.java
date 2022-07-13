package com.sprigboot.school.service;

import org.springframework.stereotype.Service;

import com.sprigboot.school.model.School;
import com.sprigboot.school.repository.SchoolRepository;

@Service
public class SchoolService {

	private SchoolRepository schoolRepository;
	
	SchoolService(SchoolRepository schoolRepository){
		this.schoolRepository= schoolRepository;
	}

	public School saveSchool(School school) {
		
		return schoolRepository.save(school);
	}
}
