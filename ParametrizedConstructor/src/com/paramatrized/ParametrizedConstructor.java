package com.paramatrized;

public class ParametrizedConstructor {

	//Write a Java program to demonstrate a parameterized constructor.
	int age;
	String name;
	
	ParametrizedConstructor(int studAge,String studName)
	{
		age=studAge;
		name=studName;
	}
	
	public static void main(String[] args) {
		ParametrizedConstructor pc=new ParametrizedConstructor(22,"Tejaswini");
		System.out.println(pc.age);
		System.out.println(pc.name);
		
	}
}
