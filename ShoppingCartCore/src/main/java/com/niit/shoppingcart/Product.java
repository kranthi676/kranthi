package com.niit.shoppingcart;

import org.springframework.stereotype.Component;

@Component
public class Product {
 private String Id;
 private String Name;
 private int Price;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
 
}
