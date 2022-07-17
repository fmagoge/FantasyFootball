package com.fmagoge.fantasyfootball.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fmagoge.fantasyfootball.entity.Player;
import com.fmagoge.fantasyfootball.services.PlayerService;

@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/{id}")
	private Player getPlayerById(@PathVariable(value = "id") int id) {
		return playerService.getPlayerById(id);
	}
	
	@GetMapping
	private List<Player> getPlayers(){
		return playerService.getAllPlayers();
	}
	
	@PostMapping
	private void savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}
	
	@DeleteMapping("/{id}")
	private void deletePlayerById(@PathVariable(value = "id") int id) {
		playerService.deletePlayerById(id);
	}
}
