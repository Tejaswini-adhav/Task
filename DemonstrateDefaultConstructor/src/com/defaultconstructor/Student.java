package com.defaultconstructor;

public class Student {

	int rollNo;
	String name;
	double marks;
	
	Student()
	{
		rollNo=101;
		name="John";
		marks=90.59;
	}
	
	public static void main(String[] args) {
		Student std=new Student();
		System.out.println("Roll No: "+std.rollNo);
		System.out.println("Name: "+std.name);
		System.out.println("Marks: "+std.marks);
	}
}
