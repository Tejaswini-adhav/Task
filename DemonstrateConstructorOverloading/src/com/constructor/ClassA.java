package com.constructor;

public class ClassA {

	public void add(int i,int j)
	{
		System.out.println("Addition Using two numbers: "+(i+j));
	}
	
	public void add(int i,int j,int k)
	{
		System.out.println("Addition Using three numbers: "+(i+j+k));
	}
	
	public void add(int i,int j,int k,int l)
	{
		System.out.println("Addition Using four numbers: "+(i+j+k+l));
	}
	
	public static void main(String[] args) {
		
		ClassA a=new ClassA();
		a.add(10, 20);
		a.add(10, 20, 30);
		a.add(10, 20, 30, 40);
	}
}
