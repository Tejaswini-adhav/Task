package com.returnvalue;

public class Calculator {

	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int i=cal.add(100,50);
		System.out.println("Addition:"+i);
		int j=cal.sub(100,50);
		System.out.println("Subtraction:"+j);
		int k=cal.mul(100,50);
		System.out.println("Multiplication:"+k);
		int l=cal.div(100,50);
		System.out.println("Division:"+l);
	}
	
}
