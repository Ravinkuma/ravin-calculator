package com.cal;

public class Addition implements Calculator {
         int a,b,c;
         
	

	public Addition(int a, int b, int c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}



	@Override
	public void calculate(int a, int b) {
		System.out.println("sum of a and b is "+(a+b));
		
	}



	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("sum of a,b and c is: "+(a+b+c));
		
	}


}
