package com.fmagoge.fantasyfootball.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fmagoge.fantasyfootball.entity.UserTeam;
import com.fmagoge.fantasyfootball.services.UserTeamService;


@RequestMapping("/teams")
public class UserTeamController {
	
	@Autowired
	private UserTeamService userTeamService;
	
	@GetMapping("/{id}")
	private UserTeam getTeamById(@PathVariable(value = "id")Long id) {
		return userTeamService.getUserTeamById(id);
	}
	
	@GetMapping
	private List<UserTeam> getAllTeams() {
		return userTeamService.getAllUserTeams();
	}

	@PostMapping
	private void saveTeam(@RequestBody UserTeam userTeam) {
		userTeamService.saveUserTeam(userTeam);
	}
	
	@DeleteMapping("/{id}")
	private void deleteTeamById(@PathVariable(value = "id")Long id) {
		userTeamService.deleteUserTeam(id);
	}	
}
