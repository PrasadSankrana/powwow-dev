/**
 * 
 */
package com.powwow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.powwow.entities.User;
import com.powwow.repositories.UserRepository;

/**
 * @author DADITYA
 *
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User finById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User findByName(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		saveUser(user);
		
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public boolean isUserExist(User user) {
		return findByName(user.getUserName())!=null;
	}
	
	

}
