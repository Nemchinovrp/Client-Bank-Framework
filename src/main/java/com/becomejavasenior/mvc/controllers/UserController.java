package com.becomejavasenior.mvc.controllers;

import com.becomejavasenior.mvc.repository.UserRepository;
import com.becomejavasenior.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		List<User> users = userRepository.getAllUser();
		model.addAttribute("users", users);
		return "listUser";
	}

	@RequestMapping("/addUserForm")
	public String addUserForm(ModelMap model) {
		return "addUser";
	}

	@RequestMapping("/addUser")
	public String addUser(@ModelAttribute User user) {
		userRepository.createUser(user);
		return "listUser";
	}

}