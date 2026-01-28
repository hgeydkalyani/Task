package com.practies_question;

public class CheckPalindorn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="madam";
    String temp="";
    for(int i=str.length()-1;i>=0;i--) {
    	temp+=str.charAt(i);
    }
    if(str.equals(temp)) {
    	System.out.println(str + "is Palindrome");
    }
    else {
    	System.out.println(str +  "is not Palindrome");
    }
	}

}
