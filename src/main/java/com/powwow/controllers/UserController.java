package com.powwow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.powwow.entities.User;
import com.powwow.repositories.UserRepository;

@Controller // this class is a controller
@RequestMapping(path = "/user") // Url Mappings
public class UserController {

	@Autowired // this makes spring to get the bean called UserRepository
	private UserRepository userRepository;
	
	@GetMapping(path="/add")	//GET
	public @ResponseBody String addUser(@RequestParam String userName, @RequestParam String emailId, @RequestParam String password) {
		//RequestParameters are the form parameters
		User user=new User();
		user.setUserName(userName);
		user.setEmailId(emailId);
		user.setPassword(password);
		userRepository.save(user);
		return "User has been successfully REGISTERED";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();	//returns a JSON of all available users in DB
	}

}
