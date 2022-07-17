package com.fmagoge.fantasyfootball.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fmagoge.fantasyfootball.entity.UserTeam;

@Repository
public interface UserTeamRepository extends CrudRepository<UserTeam, Long>{

}
