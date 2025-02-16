package com.tnsif.string;

public class test2 {
	public static void main(String[]args) {
		String s1="Abhi";
		String s2=s1;
		String s3=s2;
		System.out.println("before modification");
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		s1="Abhi";
		System.out.println("after modification");
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		
	}

}
