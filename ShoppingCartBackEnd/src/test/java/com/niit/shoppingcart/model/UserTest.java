package com.niit.shoppingcart.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;

public class UserTest {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		UserDAO userDAO = (UserDAO)context.getBean("userDAO");
		
		User user = (User) context.getBean("user");
		user.setId("us004");
		user.setName("suri");
		user.setPassword("1028");
		user.setMobile("8985758144");
		user.setMail("suri67@gmail.com");
		user.setAddress("hyd");
		userDAO.delete("us003");
		
		userDAO.saveOrUpdate(user);
		
		
		
	}

}
