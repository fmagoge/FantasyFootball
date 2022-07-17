package com.fmagoge.fantasyfootball.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmagoge.fantasyfootball.entity.UserTeam;
import com.fmagoge.fantasyfootball.repositories.UserTeamRepository;

@Service
public class UserTeamService {

	@Autowired
	private UserTeamRepository userTeamRepository;

	public UserTeam getUserTeamById(Long id) {
		return userTeamRepository.findById(id).orElse(null);
	}

	public List<UserTeam> getAllUserTeams() {
		return StreamSupport.stream(userTeamRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public void saveUserTeam(UserTeam userTeam) {
		userTeamRepository.save(userTeam);
	}

	public void deleteUserTeam(Long id) {
		userTeamRepository.delete(userTeamRepository.findById(id).orElse(null));
	}
}
