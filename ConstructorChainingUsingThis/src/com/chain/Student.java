package com.chain;

public class Student {

	Student()
	{
		this(20,"PQR");
		System.out.println("Default Constructor");
	}
	
	Student(int i)
	{
		this(90.0,true,"Abc");
		System.out.println("Single Parameter Constructor");
	}
	
	Student(int i,String name)
	{
		this(10);
		System.out.println("Two Parameter Constructor");
	}
	
	Student(double d,boolean flag,String n)
	{
		System.out.println("Three Parameter Constructor");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
	}
}
