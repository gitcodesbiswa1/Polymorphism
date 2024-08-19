package com.poly;

public class TestMethod {
	static void add(double d, double a) {
		System.out.println("Arg type (double, double)");
	}
	static void add(int a , double d) {
		System.out.println("Arg type (int, double)");
	}
	static void add(double d, int a) {
		System.out.println("Arg type (double, int)");
	}
	
	static void add(int a, float f) {
		System.out.println("Arg type (int, float)");
	}
	static void add(float f, int a) {
		System.out.println("Arg type (float, int)");
	}
	public static void main(String[] args) {
		add(10,32.56);

	}

}
