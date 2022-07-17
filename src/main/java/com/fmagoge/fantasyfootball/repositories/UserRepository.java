package com.fmagoge.fantasyfootball.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fmagoge.fantasyfootball.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
