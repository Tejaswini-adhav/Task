package com.method;

public class Employee {

	public void displayDetails(int id,String name)
	{
		System.out.println("Employee Id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.displayDetails(1, "Teju");
		e.displayDetails(2, "Yash");
		e.displayDetails(3, "John");
	}
}
