package com.demo.recursion;

public class StringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(question2("baacada"));
		System.out.println(skipApple("akshapplecd"));
	}

	static String question1(String s,String ans) {
		if(s.isEmpty()) {
			return ans;
		}
		if(s.toLowerCase().charAt(0)!='a') {
			return s.charAt(0)+question1(s.substring(1), ans);
		}
		return question1(s.substring(1), ans);
	}
	
	static String question2(String s) {
		if(s.isEmpty()) {
			return "";
		}
		if(s.toLowerCase().charAt(0)!='a') {
			return s.charAt(0)+question2(s.substring(1));
		}
		return question2(s.substring(1));
	}
	
	
	static String skipApple(String s) {
		if(s.isEmpty()) {
			return "";
		}
		if(s.startsWith("apple")) {
			return skipApple(s.substring(5));
		}
		return s.charAt(0)+skipApple(s.substring(1));
	}
}
