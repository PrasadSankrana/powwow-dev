package com.powwow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powwow.entities.User;
import com.powwow.repositories.UserRepository;

@RestController
@RequestMapping(path = "/user") 
public class UserController {

	@Autowired 
	private UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAll(){
		return (List<User>) userRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public User create(@RequestBody User user) {
	    return userRepository.save(user);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="{id}")
	public User getUserById(@PathVariable Long id) {
		return userRepository.findOne(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void delete(@PathVariable Long id) {
		userRepository.delete(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public User update(@PathVariable Long id, @RequestBody User user) {
		User update=userRepository.findOne(id);
		update.setEmailId(user.getEmailId());
		update.setUserName(user.getUserName());
		update.setPassword(user.getPassword());
		return userRepository.save(update);
	}

}
