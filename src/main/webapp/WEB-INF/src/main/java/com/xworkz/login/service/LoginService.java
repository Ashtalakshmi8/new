package com.xworkz.login.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.login.Entity.UserEntity;
import com.xworkz.login.dao.LoginDao;
import com.xworkz.login.dao.RegistrationDao;
import com.xworkz.login.dto.LoginDto;
import com.xworkz.login.dto.RegistractionDto;

@Service
public class LoginService {

	private final Logger logger=LogManager.getLogger(LoginDao.class);
//	@Autowired
//	private LoginDao loginDao;
//	public boolean validateUser(LoginDto logindto) {
//		logger.info("INFO" - validate user method invoked");
//			syso	
//				
				
@Autowired
	private RegistrationDao registrationDao;

	public void saveData(RegistractionDto registrationDto) {
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(registrationDto, entity);
		{
			registrationDao.saveData(entity);
		}
	}
}

//	public boolean validateUser(LoginDto dto) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//}
