package com.hackbulgaria.programming51.week2;

public class Coffee {
	private String brand="";
	private double price =0;
	
	public String getName(){
		return brand;
	}
	public double getPrice(){
		return price;
	}
	public void setName(String nBrand){
		brand=nBrand;
	}
	public void setPrice(double d){
		price=d;
	}
	
}
