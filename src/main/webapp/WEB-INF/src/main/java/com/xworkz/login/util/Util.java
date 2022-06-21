package com.xworkz.login.util;

import org.apache.logging.log4j.LogManager;

public class Util {
	private final static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Util.class);
	private static final String EnglishCharacterData = null;

	public static String generatePassword() {

		logger.info("INFO - generate password method PasswordGenerate invoked");

		try {
			throw new Exception("Exception occurs");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;

	}
}
