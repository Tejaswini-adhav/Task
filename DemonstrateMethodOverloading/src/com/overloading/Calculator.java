package com.overloading;

public class Calculator {

	public void Subtraction(int a, int b)
	{
		System.out.println("Subtraction of two numbers: "+(a-b));
	}
	
	public void Subtraction(int a, int b,int c)
	{
		System.out.println("Subtraction of three numbers: "+(a-b-c));
	}
	
	public void Subtraction(int a, int b,int c,int d)
	{
		System.out.println("Subtraction of four numbers: "+(a-b-c-d));
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.Subtraction(100, 20);
		cal.Subtraction(80, 40, 10);
		cal.Subtraction(90, 20, 50, 5);
	}
}
