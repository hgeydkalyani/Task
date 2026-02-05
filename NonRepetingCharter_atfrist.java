package com.practies_question;

import java.util.HashMap;
import java.util.Map;

public class NonRepetingCharter_atfrist {

	public static void main(String[] args) {
		String s="programming";
		Map<Character,Integer> map=new HashMap<>();
		for( char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch:s.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println(ch);
				
			}
		}

	}

}
