package com.practies_question;

import java.util.Scanner;

public class Swap_without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the  first number");
		   int a=sc.nextInt();
		   System.out.println("enter the  secound number");
		   int b=sc.nextInt();
		   System.out.println("before swaping");
		   System.out.println(a);
		   System.out.println(b);
		   a=a+b;
		   b=a-b;
		   a=a-b;
		   System.out.println("after swaping");
		   System.out.println(a);
		   System.out.println(b);
	}

}
