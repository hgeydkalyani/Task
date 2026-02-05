package com.practies_question;

public class CountUpperAndLowerCase {

	public static void main(String[] args) {
		String str="AnGUlar";
		int upperCase=0,lowerCase=0;
		for(char ch:str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				upperCase++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCase++;
			}
		}
		System.out.println("Uppercase: "+upperCase);
		System.out.println("Lowercase: "+lowerCase);

	}

}
