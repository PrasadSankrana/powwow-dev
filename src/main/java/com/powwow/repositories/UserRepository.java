package com.powwow.repositories;

import org.springframework.data.repository.CrudRepository;

import com.powwow.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	// This creates Repository implementations automatically -CRUD (only)

}
