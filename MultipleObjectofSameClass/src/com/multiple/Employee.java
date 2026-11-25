package com.multiple;

public class Employee {

	//Write a Java program to demonstrate multiple objects of the same class.
	int empId;
	String name;
	double salary;
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empId=1;
		e1.name="Tejaswini";
		e1.salary=400000;
		System.out.println(e1.empId+" "+e1.name+" "+e1.salary);
		
		Employee e2=new Employee();
		e2.empId=2;
		e2.name="Sauraksha";
		e2.salary=200000;
		System.out.println(e2.empId+" "+e2.name+" "+e2.salary);
		
		Employee e3=new Employee();
		e3.empId=3;
		e3.name="Sakshi";
		e3.salary=300000;
		System.out.println(e3.empId+" "+e3.name+" "+e3.salary);
	}
}
