package com.xworkz.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.login.Entity.UserEntity;

@Repository
public class RegistrationDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;
	private final Logger logger = LogManager.getLogger(RegistrationDao.class);

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;

	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public boolean saveData(UserEntity entity) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
//		logger.info("INFO-save method of registrationdao ");
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}
