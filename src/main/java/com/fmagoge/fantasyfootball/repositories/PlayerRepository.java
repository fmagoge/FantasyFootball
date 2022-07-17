package com.fmagoge.fantasyfootball.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fmagoge.fantasyfootball.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
