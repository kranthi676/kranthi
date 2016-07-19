package com.kranthi.niit;

public class TestProduct {
	
	public static void main(String[] args) {
		
		//create instance or object
		//classname objectname=new constructorname();
		
		Product product = new Product();
		
		product.setId("PRD001");
		
		product.setName("mobile phone");
		
		product.setColor("block");
		
		product.setPrice(10001.00);
		
		System.out.println(product.getId());
		
		System.out.println(product.getName());
		
		System.out.println(product.getColor());
		
		System.out.println(product.getPrice());
		
	}

}
