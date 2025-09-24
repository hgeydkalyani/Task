package com.practies_question;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter first number:");
		   int a=sc.nextInt();
		   System.out.println("enter secound number:");
		   int b=sc.nextInt();
		  int addition=a+b;
		  System.out.println("Addition of two number"+addition);
		  int subtraction=a-b;
		  System.out.println("Subtraction of two number"+subtraction);
		  int multiplication=a*b;
		  System.out.println("multiplicationof two number"+multiplication);
		   
		   }
	}


