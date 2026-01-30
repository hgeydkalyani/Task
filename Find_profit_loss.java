package com.practies_question;

import java.util.Scanner;

public class Find_profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter selling_price :");
   int selling_price=sc.nextInt();
   System.out.println("enter cost_price :");
   int cost_price=sc.nextInt();
   if(cost_price<selling_price) {
	   int profit=selling_price-cost_price;
	   System.out.println("profit"+profit);
   }
   else {
	   int loss=cost_price-selling_price;
	   System.out.println("loss"+loss);
   }
   }
	
}
