package com.xworkz.login.dao;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LoginDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
