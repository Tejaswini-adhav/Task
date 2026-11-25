package com.intilize;

public class Demo {

	int rollNo;
	String name;
	float marks;
	
	Demo(int rollNo,String name,float marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		Demo d=new Demo(1,"Tejaswini",90);
		System.out.println("ROLL NO:"+d.rollNo+" "+"NAME: "+d.name+" "+"MARKS: "+d.marks);
		
		Demo d1=new Demo(2,"Sauraksha",95);
		System.out.println("ROLL NO:"+d1.rollNo+" "+"NAME: "+d1.name+" "+"MARKS: "+d1.marks);
		
		Demo d2=new Demo(3,"Sauraksha",85);
		System.out.println("ROLL NO:"+d2.rollNo+" "+"NAME: "+d2.name+" "+"MARKS: "+d2.marks);
	}
}
