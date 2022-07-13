package com.sprigboot.school.service;

import java.util.List;
import java.util.Optional;

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
	
	public List <School>getAllSchoolDetails(){
		return schoolRepository.findAll();
	}
	
	public Optional<School> getSchoolDetailById(long id) {
		return schoolRepository.findById(id);
	}
}
