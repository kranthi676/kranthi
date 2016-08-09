package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;


@Controller
public class HomeController {

	@Autowired
	User user;

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private UserDAO userDAO;

	@Autowired
	private Category category;

	
	@RequestMapping("/")
	public ModelAndView onLoad(HttpSession session) {
		
		ModelAndView mv = new ModelAndView("/Home");
		
		
		return mv;
	}
	
  
	@RequestMapping(value = "userRegistration", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute User user) {
		userDAO.saveOrUpdate(user);
		ModelAndView mv1  = new ModelAndView("/Login");
		mv1.addObject("successMessage", "You are successfully registered.Please login");
		
		return mv1;
	}

	@RequestMapping("/getregistered")
	public ModelAndView getregistered() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("user", user);
		mv.addObject("ifclickedregister", "true");
		return mv;
	}

	@RequestMapping("/justlogin")
	public ModelAndView justlogin() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("user", new User());
		mv.addObject("ifclickedlogin", "true");
		return mv;
	}
}
