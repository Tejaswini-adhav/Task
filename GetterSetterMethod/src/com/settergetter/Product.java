package com.settergetter;

public class Product {

	private int prodId;
	private String prodName;
	private double price;
	
	public int getProdId()
	{
		return prodId;
	}
	
	public void setProdId(int id)
	{
		prodId=id;
	}
	
	public String getProdName()
	{
		return prodName;
	}
	
	public void setProdId(String name)
	{
		prodName=name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setProdId(double price)
	{
		this.price=price;
	}
	
	
}
