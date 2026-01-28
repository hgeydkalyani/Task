package com.practies_question;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5,1,2,5};
       Set<Integer> a=new LinkedHashSet<>();
       for(int n:arr) {
    	   a.add(n);
       }
       System.out.println(a);
	}

}
