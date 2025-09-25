package com.practies_question;

import java.util.Scanner;

public class Temprecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter  the tempreature ");
		  double calsius=sc.nextDouble();
		  double fahrenheit=(calsius*9.0/5.0)+32.0;
		  System.out.println("tempreature in  fahrenheit"+fahrenheit);
	}

}
