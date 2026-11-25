package com.bank;

import java.util.Scanner;

public class BankAccount {

	//Write a Java program to create a BankAccount class with 
	//private balance and methods for deposit, withdrawal, and balance inquiry.
	
	private double balance;
	Scanner sc=new Scanner(System.in);
	
	
	public void deposit()
	{
		System.out.println("Enter the balance: ");
		balance=sc.nextDouble();
		
		System.out.println("Enter the amount to be Deposit: ");
		double dep=sc.nextDouble();
		
		if(dep<=0)
		{
			System.out.println("Invalid amount.Enter valid amount...!");
		}
		else
		{
			balance+=dep;
			System.out.println("Balance: "+balance);
		}
	}
	
	
	public void withdraw()
	{
		
		System.out.println("Enter the amount to Withdraw: ");
		double withdrawl=sc.nextDouble();
		
		if(withdrawl<=balance && withdrawl>=0)
		{
			System.out.println("WithDrawal Successfull...!");
			balance-=withdrawl;
			//System.out.println("Balance: "+balance);
		}
		else
		{
			System.out.println("Amount greater than balance..!");
		}
	}
	
	public void balanceEnquiry()
	{
		if(balance<=0)
		{
			System.out.println("Not sufficient balance..!");
		}
		else
		{
			System.out.println("BALANCE: "+balance);
		}
	}
	
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		bank.deposit();
		bank.withdraw();
		bank.balanceEnquiry();
	}
	
}
