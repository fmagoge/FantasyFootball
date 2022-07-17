package com.fmagoge.fantasyfootball.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmagoge.fantasyfootball.entity.Player;
import com.fmagoge.fantasyfootball.repositories.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public Player getPlayerById(int id) {
		return playerRepository.findById(id).orElse(null);
	}

	public List<Player> getAllPlayers() {
		return StreamSupport.stream(playerRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public void savePlayer(Player player) {
		playerRepository.save(player);
	}

	public void deletePlayerById(int id) {
		playerRepository.delete(playerRepository.findById(id).orElse(null));
	}
}
