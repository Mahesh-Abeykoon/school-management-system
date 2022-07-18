package com.sprigboot.school.service;



import java.util.List;
import java.util.Optional;


import com.sprigboot.school.model.School;



public interface SchoolService {

	
	public School saveSchool(School school);
		
	public List <School>getAllSchoolDetails();
	
	public Optional<School> getSchoolDetailById(long id) ;
	
	public void deleteSchoolDetails (long id);

    public School updateStudentDetails(School school, long id);
	
}
