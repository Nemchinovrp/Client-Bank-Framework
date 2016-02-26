package com.becomejavasenior.mvc.controllers;

import com.becomejavasenior.mvc.dao.daoImpl.UserDaoImpl;
import com.becomejavasenior.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private UserDaoImpl userDao;

	/*@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello, Conroller Spring MVC!");
		return "hello";
	}*/
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		List<User> users = userDao.getAllUser();
		model.addAttribute("users", users);
		return "listUser";
	}
}