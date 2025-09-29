package com.practies_question;

import java.util.Scanner;

public class Swap_Using {

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
		   int temp=0;
		   temp=a;
		   a=b;
		   b=temp;
		   System.out.println("after swaping");
		   System.out.println(a);
		   System.out.println(b);
	}

}
