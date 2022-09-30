package com.constructor.dependency;

public class Parent {
Child child;
Child2 child2;
public Parent(Child child,Child2 child2) {
	this.child=child;
	this.child2 = child2;
	System.out.println("this is parent");
	this.child2.child2method();
	
 }

}
