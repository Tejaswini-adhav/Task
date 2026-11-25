package com.settergetter;

public class MainClass {

	public static void main(String[] args) {
		Product p=new Product();
		
		p.setProdId(201);
		p.setProdId("Book");
		p.setProdId(1000.0);
		
		System.out.println(p.getProdId()+" "+p.getProdName()+" "+p.getPrice());
	}
	
}
