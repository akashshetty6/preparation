package com.demo.maths;

public class FindNoOfBits {
// complexity logn times   
//	 u can also find no of bits by n>>1 and count
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int base=2;
		int ans=(int) (Math.log(n)/Math.log(base))+1;
		System.out.println(ans);
	}

}
