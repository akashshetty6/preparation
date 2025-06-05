package com.demo.maths;

public class ReverseANumber {

	public static void main(String[] args) {
		reverse(1304);
		System.out.println(ans);
	}

	static int ans=0;
	static void reverse(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		ans=ans*10+rem;
		reverse(n/10);
	}
	
	static void rev(int n) {
		
	}
}
