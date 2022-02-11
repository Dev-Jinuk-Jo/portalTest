package com.test.portaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/home.do", method = { RequestMethod.GET })
	public String home(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "home";
	}
	
	
}
