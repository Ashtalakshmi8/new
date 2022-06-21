package com.xworkz.app.repository;

import com.xworkz.appl.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

	void save(User user);
}
