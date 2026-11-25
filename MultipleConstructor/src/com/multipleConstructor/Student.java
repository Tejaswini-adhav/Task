package com.multipleConstructor;

public class Student {

	//Write a Java program to create a class Student with multiple constructors to 
	//initialize student details.
	
	int rollNo;
	String name;
	String add;
	char grade;
	float marks;
	
	Student(int rNo)
	{
		System.out.println("Roll No:"+rNo);
	}
	
	Student(String studName,String studAdd)
	{
		System.out.println("Student name: "+studName+" "+"Student Address: "+studAdd);
	}
	
	public static void main(String[] args) {
		Student s=new Student(10);
		Student s1=new Student("Teju","Pune");
	}
	
}
