package com.niit.shoppingcart.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;

public class SupplierTest {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		
		context.refresh();
		
		SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		
		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("sp003");
		supplier.setName("madhukar");
	    supplier.setAddress("spadd003");
		supplierDAO.saveOrUpdate(supplier);
		supplierDAO.delete("sp002");
	}

}
