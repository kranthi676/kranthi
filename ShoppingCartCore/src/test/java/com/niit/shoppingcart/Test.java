package com.niit.shoppingcart;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		Product p=(Product)context.getBean("product");
		
		p.setId("101");
		p.setName("mobile");
		p.setPrice(100000);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		
		context.getBean("category");
		System.out.println("successfully is created");
	}

}
