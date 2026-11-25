package com.argument;

public class Main {

	public void showDetails(Employee e)
	{
		System.out.println(e.empId);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	
	public static void main(String[] args) {
		Main main=new Main();
		Employee emp=new Employee(10,"Teju",10000);
		main.showDetails(emp);
	}
}
