package com.demo.maths;

public class ProdOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prod(33));
	}
	
	static int prod(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10 * prod(n/10);
	}

}
