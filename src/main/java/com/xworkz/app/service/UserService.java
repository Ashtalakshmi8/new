package com.xworkz.app.service;

import com.xworkz.appl.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);
}
