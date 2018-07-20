package com.it.sportsplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.sportsplus.models.Coach;
public interface CoachRepository extends JpaRepository<Coach,Long>{ 

	
}
