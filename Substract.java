package com.cal;

public class Substract implements Calculator {
 int a,b,c;
 
	

	public Substract(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}

	@Override
	public void calculate(int a, int b) {
		double sub1=a-b;
		System.out.println("a-b = "+sub1);
		
	}

	@Override
	public void calculate(int a, int b,int c) {
		double sub2=a-b-c;
		System.out.println("a-b-c = "+sub2);
		
	}

}
