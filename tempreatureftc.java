package com.practies_question;

import java.util.Scanner;

public class tempreatureftc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter  the tempreature ");
		  double fahrenheit=sc.nextDouble();
		  double calsius=(fahrenheit-32)/1.8F;
		  System.out.println("tempreature calsius"+calsius);
	}

}
