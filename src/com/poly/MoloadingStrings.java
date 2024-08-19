package com.poly;

public class MoloadingStrings {
	void method1(String s1) {
		method1(s1,s1+s1);
	}
	void method1(String s1, String s2) {
		method1(s1,s2,s1+s2);
	}
	void method1(String s1, String s2, String s3) {
		System.out.println(s1+s2+s3);
	}
	public static void main(String[] args) {
		MoloadingStrings ob= new MoloadingStrings();
		ob.method1("Micron");

	}

}
