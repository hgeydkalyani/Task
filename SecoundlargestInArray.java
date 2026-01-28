package com.practies_question;

import java.util.Scanner;

public class SecoundlargestInArray {
   static public void main (String args[]) {
	  Scanner sc=new Scanner(System.in);
	  int[] numbers= new int[5];
	  System.out.println("enter the 5 number"+numbers);
	  for(int i=0;i<numbers.length;i++) {
		  numbers[i]=sc.nextInt();
	  }
	  
  for(int i=0;i<numbers.length;i++) {
	  for(int j=0;j<numbers.length;j++) {
		  if(numbers[j]>numbers[i]) {
			  int temp=numbers[j];
			  numbers[j]=numbers[j+1];
			  numbers[j+1]=temp;
			  
			  
			  }
	  }
  }
   
}
}