package com.cognizant.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project.entity.Contact;
import com.cognizant.project.entity.User;
import com.cognizant.project.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;


	@GetMapping("showlogin")
	public String showLogin(Model theModel) {
		return "login";
		
	}
	
	@RequestMapping("/loginUser")
	@Transactional
	public String loginForm(@RequestParam("username") String user,@RequestParam("password") String pass,Model msg) {
		try {
		if(user.equalsIgnoreCase("user")&&(pass.equals("user123"))) {
			return "redirect:/user/list";
		}
		else {
			msg.addAttribute("msg","Invalid Credentials");
			return "login";
		}
		}
		catch(Exception e) {
			msg.addAttribute("msg","Invalid Credentials");
			return "login";
		}
	}


	@GetMapping("showregister")
	public String showRegister(Model theModel) {
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@Valid @ModelAttribute("user") User user,BindingResult bind) {
		
		if(bind.hasErrors()) {
			System.out.println(bind);
			return "register";
		}
		else {
			userService.saveUser(user);
			return "welcome";
		}

	}

	@GetMapping("/list")
	public String listContacts(Model model) {
	List<Contact> listContacts = userService.getAllContacts();
	model.addAttribute("contact", listContacts);
	System.out.println(listContacts);
	return "contact-list";
	}

	//@RequestMapping("/showFormForAdd")
	@GetMapping("/showFormForAddContact")
	public String showFormForAdd(Model model) {
	User user = new User();
	model.addAttribute("user", user);
	return "contact-form";
	}

	
	@PostMapping("/saveContact")
	public String saveContact(@Valid @ModelAttribute("contact") Contact contact,BindingResult bind) {
		
		if(bind.hasErrors()) {
			System.out.println(bind);
			return "user-form";
		}
		else {
			userService.saveContact(contact);
			return "welcome";
		}

	}
	//@RequestMapping("/showFormForUpdate")
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("userId") int theId, Model themodel) {
	User user = userService.getUser(theId);
	themodel.addAttribute("user", user);
	return "contact-form";

	}

	

	//@RequestMapping("/delete")
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("userId") int theId)
	{
	userService.deleteUser(theId);
	return "redirect:/user/list";
	}
	}




