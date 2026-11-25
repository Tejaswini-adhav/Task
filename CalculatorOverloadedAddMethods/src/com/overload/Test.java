package com.overload;

public class Test {

	public void add(int i,int j)
	{
		System.out.println("Addition of two numbers: "+(i+j));
	}
	
	public void add(int i,int j,int k)
	{
		System.out.println("Addition of three numbers: "+(i+j+k));
	}
	
	public void add(int i,int j,int k,int l)
	{
		System.out.println("Addition of four numbers: "+(i+j+k+l));
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.add(10, 120);
		t.add(20,50,100);
		t.add(100,30,20,60);
	}
}
