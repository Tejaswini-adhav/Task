package com.constructor;

public class Student {

	Student()
	{
		System.out.println("Student constructor created");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("First constructor created");
		System.out.println();
		
		Student s2=new Student();
		System.out.println("Second constructor created");
		System.out.println();
		
		Student s3=new Student();
		System.out.println("Third constructor created");
		System.out.println();
	}
}
