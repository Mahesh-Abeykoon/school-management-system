package com.sprigboot.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sprigboot.school.model.School;
import com.sprigboot.school.repository.SchoolRepository;

@Service
public class SchoolServiceImpl {

	private SchoolRepository schoolRepository;
	
	SchoolServiceImpl(SchoolRepository schoolRepository){
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
	
	
	public void deleteSchoolDetails (long id) {
		
		 schoolRepository.deleteById(id);
		 
		
	}

	public School updateStudentDetails(School school, long id) {
		 School existingSchool = schoolRepository.findById(id).orElseThrow(null);
		 
		 existingSchool.setSchoolName(school.getSchoolName());
		 existingSchool.setRegisterdNumber(school.getRegisterdNumber());
		 existingSchool.setStudentName(school.getStudentName());	
		 existingSchool.setStudentGrade(school.getStudentGrade());
		 existingSchool.setGuardianName(school.getGuardianName());
		 existingSchool.setContactDetails(school.getContactDetails());
		 
		 schoolRepository.save(existingSchool);
		 
		return existingSchool;
	}

	
	

	
}
