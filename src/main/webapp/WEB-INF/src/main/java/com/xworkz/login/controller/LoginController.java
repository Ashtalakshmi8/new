package com.xworkz.login.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	private final Logger logger = (Logger) LogManager.getLogger(LoginController.class);
//	@Autowired
//	private LoginService loginService;

	@PostMapping("/login.do")
	public ModelAndView validateUser() {
		logger.info("info-login method invoked");
		try {
			throw new Exception("some Exception");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return new ModelAndView("success");
	}
}

//	public ModelAndView login(LoginDto dto) {
//		logger.info("info-login method invoked");
//		boolean validUser = loginService.validateUser(dto);
//		if (validUser) {
//			return new ModelAndView("success", "dto", dto);
//
//		} else {
//			return new ModelAndView("error", "dto", "invalid credentils");
//		}
//	}
//}		