package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// substring is equal to  3 pow n;
public class PhoneNumber17 {

	public static void main(String[] args) {
//		subset("", "12");
//	System.out.println(subsetList("", "23"));
//	System.out.println(subsetCount("", "1"));
	
	System.out.println(subsetLeetCode("","23"));
	}
	
	static void subset(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit =up.charAt(0)-'0';
//		System.out.println(c);
		for(int d=(digit-1)*3;d<(digit*3);d++) {
			char c=(char) ('a'+(d+1));
			subset(p+c, up.substring(1));
		}
		
	}
	
	static List<String> subsetList(String p,String up) {
		if(up.isEmpty()) {
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		List<String> list=new ArrayList<>();
		int digit =up.charAt(0)-'0';
//		System.out.println(c);
		for(int d=(digit-1)*3;d<(digit*3);d++) {
			char c=(char) ('a'+d);
			list.addAll(subsetList(p+c, up.substring(1)));
		}
		return list;
	}
	
	static int subsetCount(String p,String up) {
		if(up.isEmpty()) {
			return 1;
		}
		int count=0;
		int digit =up.charAt(0)-'0';
//		System.out.println(c);
		for(int d=(digit-1)*3;d<(digit*3);d++) {
			char c=(char) ('a'+d);
			count +=subsetCount(p+c, up.substring(1));
		}
		return count;
	}
	
	private static final Map<Character, String> digitToChar = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );
	static List<String> subsetLeetCode(String p,String up) {
		if(up.isEmpty()) {
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		List<String> list=new ArrayList<>();
		char digit =up.charAt(0);
		String string = digitToChar.get(digit);
		
		for(int d=0;d<string.length();d++) {
			char c=(char) (string.charAt(0)+d);
			list.addAll(subsetLeetCode(p+c, up.substring(1)));
		}
		return list;
	}
}
