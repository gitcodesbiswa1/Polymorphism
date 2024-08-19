package com.override;

public class ChildClass extends ParentClass {
	
	public void display() {
		System.out.println("This is child class display method");
	}
	
	public void show() {
		System.out.println("This is child class show method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj1= new ChildClass();
		obj1.display();
		obj1.show();
		obj1.disp();
		
		ParentClass obj2= new ParentClass();
		obj2.display();
		obj2.show();
		
		ParentClass obj3= new ChildClass();
		obj3.display();
		obj3.show();
	}

}
