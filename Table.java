package com.practies_question;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number which you want to print the table:");
		Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   for(int i=1;i<=10;i++) {
			   int t=n*i;
			   System.out.println(n+"*"+i+"="+t);
		   }
	}

}
