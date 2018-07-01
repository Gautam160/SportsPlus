package com.it.sportsplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.Athlete;
import com.it.sportsplus.repo.AthleteRepository;

@RestController
@RequestMapping("/athlete")

public class AthleteController {

	@Autowired
	private AthleteRepository athleterepo;
	
	@PostMapping("/add")
	public Athlete addAthlete(@RequestBody Athlete athletes) {
		Athlete persistedUser=athleterepo.save(athletes);
		return persistedUser;
		
	}
	@GetMapping("/getAll")
		public List<Athlete> getAll()
		{
			List<Athlete> user=athleterepo.findAll();
			return user;
		}
	
}
