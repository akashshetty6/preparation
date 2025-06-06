package com.demo.recursion;

public class DiceAmazon {

	public static void main(String[] args) {
		diceAmazon("", 3);
	}
	
	static void diceAmazon(String p, int up) {
		if(up==0) {
			System.out.println(p);
			return;
		}
		for(int i=1;i<=6 && i<=up;i++) {
			diceAmazon(p+i, up-i);
		}
	}
	

}
