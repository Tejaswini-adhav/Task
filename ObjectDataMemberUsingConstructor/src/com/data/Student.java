package com.data;

public class Student {

	int age;
	String name;
	String add;
	
	Student()
	{
		age=22;
		name="Teju";
		add="Pune";
	}
	
	public static void main(String[] args) {
		Student std=new Student();
		System.out.println("AGE: "+std.age+" "+"NAME: "+std.name+" "+"ADDRESS: "+std.add);
	}
}
