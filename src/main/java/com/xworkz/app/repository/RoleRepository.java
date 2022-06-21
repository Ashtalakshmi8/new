package com.xworkz.app.repository;

import com.xworkz.appl.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Object findAll();

}
