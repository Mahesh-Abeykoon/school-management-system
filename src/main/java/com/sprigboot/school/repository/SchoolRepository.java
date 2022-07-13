package com.sprigboot.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprigboot.school.model.School;

public interface SchoolRepository extends JpaRepository<School, Long>{

}
