package com.powwow.services;

import java.util.List;

import com.powwow.entities.User;

public interface UserService {
	
	User finById(Long id);
	
	User findByName(String user_name);
	 
    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);

}
