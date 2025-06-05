package com.demo.maths;

public class Palindrome {

	public static void main(String[] args) {
		String val="abbca";
		System.out.println(isPalindrome(val,0,val.length()-1));
		
	}

	static boolean isPalindrome(String val,int s,int e) {
		if( s>e || (val.charAt(s)!=val.charAt(e))) {
			return false;
		}
		isPalindrome(val,s+1,e-1);
		return true;
	}
}
