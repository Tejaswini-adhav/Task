package com.instance;

public class Student {

	int sId;
	String name;
	
	void setDetails(int r,String n)
	{
		sId=r;
		name=n;
	}
	
	void displayDetails()
	{
		System.out.println("Roll No: "+sId);
		System.out.println("Name: "+name);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setDetails(1, "Tejaswini");
		s.displayDetails();
		
		s.setDetails(2, "Yash");
		s.displayDetails();
		
		s.setDetails(3, "Sanjay");
		s.displayDetails();
	}
}
