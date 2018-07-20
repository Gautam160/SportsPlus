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

import com.it.sportsplus.models.Group;
import com.it.sportsplus.repo.GroupRepository;

@RestController
@RequestMapping("/group")
public class GroupController {
	
	@Autowired
	private GroupRepository groupRepository;
	
	@PostMapping("/add")
	public Group addGroup(@RequestBody Group group) {
		Group persistedGroup= groupRepository.save(group);
		return persistedGroup;
	}
	
	
	
	@GetMapping("/getAll")
	public List<Group> getAllGroup(){
		List<Group> groups=groupRepository.findAll();
		return groups;
		
	}

	@DeleteMapping("/delete")
	public void deleteGroup(@RequestBody Group group)
	{
		groupRepository.delete(group);
	}
	

}
