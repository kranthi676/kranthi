package com.niit.shoppingcart.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;

public class ProductTest {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		
		Product product = (Product) context.getBean("product");
		product.setId("p003");
		product.setName("bike");
		product.setDescription("pdes003");
		product.setPrice(10000.0);
		productDAO.delete("p001");
		productDAO.saveOrUpdate(product);
		
	
	}

}
