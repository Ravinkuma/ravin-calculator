package com.cal;

public class Division implements Calculator {
       int a,b,c;
       
	

	public Division(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void calculate(int a, int b) {
		if(b==0) {
			try {
				double div1=a/b;
				System.out.println("a/b = "+div1);
			} catch(ArithmeticException e) {
				System.out.println("The exception is "+e.getMessage());
				System.out.println("we can not divide any numbers by zero");
			}
		} else {
			double div1=a/b;
			System.out.println("a/b = "+div1);
		}
		
	}

	@Override
	public void calculate(int a, int b, int c) {
		if(b==0 || c==0) {
			try {
				double div2=(a/b)/c;
				System.out.println("(a/b)/c = "+div2);
			} catch(ArithmeticException e) {
				System.out.println("The exception is "+e.getMessage());
				System.out.println("we can not divide any numbers by zero");

			}
		} else {
			double div2=(double)(a/b)/c;
			System.out.println("(a/b)/c = "+div2);
		}
		
	}

}
