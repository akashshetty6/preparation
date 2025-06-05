package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		permutation("", "abc");
		System.out.println(permutationList("", "abc"));
	}
	
	static void permutation(String p,String un) {
		if(un.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char c=un.charAt(0);
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0, i);
			String s=p.substring(i, p.length());
			permutation(f+c+s, un.substring(1));
		}
	}
	
	static List<String> permutationList(String p,String un) {
		if(un.isEmpty()) {
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char c=un.charAt(0);
		List<String> list=new ArrayList<>();
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0, i);
			String s=p.substring(i, p.length());
			list.addAll(permutationList(f+c+s, un.substring(1)));
		}
		return list;
	}

}
