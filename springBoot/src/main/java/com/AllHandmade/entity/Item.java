package com.AllHandmade.entity;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "items")
public class Item {
     String Name ;
     String Discription;
     String Price;
     String Url ;
     
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String name, String discription, String price,String url) {
		super();
		Name = name;
		Discription = discription;
		Price = price;
		Url = url;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
     
     
     
}
