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

import com.it.sportsplus.models.Academy;
import com.it.sportsplus.models.Athlete;
import com.it.sportsplus.models.Coach;
import com.it.sportsplus.models.Group;
import com.it.sportsplus.repo.AcademyRepository;
import com.it.sportsplus.repo.AthleteRepository;
import com.it.sportsplus.repo.CoachRepository;
import com.it.sportsplus.repo.GroupRepository;

@RestController
@RequestMapping("/athlete")

public class AthleteController {
	
	@Autowired
	private AthleteRepository athleteRepository;

	
	@PostMapping("/add")
	public Athlete addAthlete(@RequestBody Athlete athlete) {
		Athlete persistedAthlete= athleteRepository.save(athlete);
		return persistedAthlete;
	}
	
	
	
	@GetMapping("/getAll")
	public List<Athlete> getAllAthlete(){
		List<Athlete> athletes=athleteRepository.findAll();
		return athletes;
		
	}

	@DeleteMapping("/delete")
	public void deleteAthlete(@RequestBody Athlete athlete)
	{
		athleteRepository.delete(athlete);
	}
}
