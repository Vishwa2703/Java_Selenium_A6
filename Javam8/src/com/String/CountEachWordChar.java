package com.String;

public class CountEachWordChar {
public static void main(String[] args) {
	String s= "Java is a Programming Language";
	System.out.println(s);
	System.out.println("          ");
	String arr[]=s.split(" ");
	
	for(int i=0;i<s.length();i++) {
		System.out.println(arr[i]+"Length is : "+ arr[i].length() );
	}
}
}
