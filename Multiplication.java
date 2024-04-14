package com.cal;

public class Multiplication implements Calculator {
            int a,b,c;
            
	
	public Multiplication(int a, int b, int c) {
				super();
				this.a = a;
				this.b = b;
				this.c = c;
			}

	@Override
	public void calculate(int a, int b) {
		double mul1=a*b;
		System.out.println("a*b = "+mul1);
		
	}

	@Override
	public void calculate(int a, int b, int c) {
		double mul2=a*b*c;
		System.out.println("a*b*c = "+mul2);
		
	}

}
