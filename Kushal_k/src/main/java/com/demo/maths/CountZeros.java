package com.demo.maths;

public class CountZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count(1233, 0));
	}
	
	static int count(int val,int c) {
		if(val>0) {
			if(val%10==0) {
				return count(val/10, c+1);
			}
			return count(val/10, c);
		}
		return c;
	}

}
