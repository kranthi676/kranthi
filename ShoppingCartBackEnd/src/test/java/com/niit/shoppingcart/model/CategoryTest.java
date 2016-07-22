package com.niit.shoppingcart.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;

public class CategoryTest {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		Category category = (Category) context.getBean("category");
		category.setId("ct003");
		category.setName("madhukar");
		category.setDescription("ctdes003");
		categoryDAO.delete("ct001");
		categoryDAO.saveOrUpdate(category);
		
		
		
	}

}
