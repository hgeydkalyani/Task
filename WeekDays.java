package com.practies_question;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the  number");
		   int a=sc.nextInt();
		   int choies=a;
		   switch(choies) {
		   case 1:
			   System.out.println(a+" monday");
			   break;
		   
	       case 2:
		   System.out.println(a+" tusday");
		   break;
	   
          case 3:
	      System.out.println(a+" wensday");
	      break;

         case 4:
	   System.out.println(a+" thusday");
	   break;

case 5:
	   System.out.println(a+" friday");
	   break;

case 6:
	   System.out.println(a+" Saturday");
	   break;
case 7:
	   System.out.println(a+" Sunday");



	}

	}
}
