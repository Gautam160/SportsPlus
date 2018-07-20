package com.it.sportsplus.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.Coach;
import com.it.sportsplus.repo.CoachRepository;

@RestController
@RequestMapping("/coach")
public class CoachController {
	@Autowired
	private CoachRepository coachRepository;
	
	@PostMapping("/add")
	public Coach addCoach(@RequestBody Coach coach) {
		Coach persistedCoach= coachRepository.save(coach);
		return persistedCoach;
	}
	
	
	@GetMapping("/getAll")
	public List<Coach> getAllCoach(){
		List<Coach> coaches=coachRepository.findAll();
		return coaches;
		
	}

	@DeleteMapping("/delete")
	public void deleteCoach(@RequestBody Coach coach)
	{
		coachRepository.delete(coach);
	}
	

}
