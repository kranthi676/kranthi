package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

@Controller
public class UserController {


	@Autowired
	UserDAO userDAO;

	@Autowired
	User user;

	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password, HttpSession session) {
		

		
	
		ModelAndView mv = new ModelAndView("/Home");
		boolean isValidUser = userDAO.isValidUser(name, password);

		if (isValidUser == true) {
			
			session.setAttribute("nameofloggedinuser",name);
			if (user.getAdmin() == 1) {
				mv.addObject("isAdmin", "true");

			} 

		} else {

			mv.addObject("invalidCredentials", "true");
			mv.addObject("errorMessage", "Invalid Credentials");
			

		}
		
		return mv;
	}

	 
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("/Home");
		session.invalidate();
		
		
	
		mv.addObject("logoutMessage", "You successfully logged out");
		mv.addObject("loggedOut", "true");
	
		return mv;
	 }
}
