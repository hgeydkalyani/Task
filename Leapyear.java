package com.practies_question;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the year");
		   int a=sc.nextInt();
		   if((a%4==0) && (a%100!=0)||(a%400==0)){
			   System.out.println(a+" leap year");
		   }
		   else {
			   System.out.println(a+" is not leap year");
		   }
	}

}
