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
@RequestMapping("/academy")

public class AcademyController {
	@Autowired
	private AcademyRepository academyRepository;
	
	
	@PostMapping("/add")
	public Academy addAcademy(@RequestBody Academy academy) {
		Academy persistedAcademy= academyRepository.save(academy);
		return persistedAcademy;
	}
	
	
	
	@GetMapping("/getAll")
	public List<Academy> getAllAcademy(){
		List<Academy> academies=academyRepository.findAll();
		return academies;
		
	}

	@DeleteMapping("/delete")
	public void deleteAcademy(@RequestBody Academy academy)
	{
		academyRepository.delete(academy);
	}
	
	
	
	
}
