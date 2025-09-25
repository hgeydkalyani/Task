package com.practies_question;

import java.util.Scanner;

public class Threenum_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the  first number");
		   int a=sc.nextInt();
		   System.out.println("enter the  secound number");
		   int b=sc.nextInt();
		   System.out.println("enter the  third number");
		   int c=sc.nextInt();
		   if(a>b&&a>c) {
			      System.out.println(a+" is greatesh");
		  
		   }
		   else if(b>a&&b>c) {
			   System.out.println(b+" is greatesh");
		   }
		   else {
			   System.out.println(c+" is greatesh");
		   }
	}
}
