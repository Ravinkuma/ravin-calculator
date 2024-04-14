package com.cal;
import java.util.Scanner;
public class MainCalculator {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter d: "); 
		 // we can use diff or same variable here that will override class constructor or method 
	        int d = sc.nextInt();
	        System.out.print("Enter e: ");
	        int e = sc.nextInt();
	        System.out.print("Enter f: ");
	        int f = sc.nextInt();
	        Addition add = new Addition(d, e, f);
	        add.calculate(d, e);
	        add.calculate(d, e, f);
	        Substract sub = new Substract(d, e, f);
	        sub.calculate(d, e);
	        sub.calculate(d, e, f);
	        Multiplication mul = new Multiplication(d, e, f);
	        mul.calculate(d, e);
	        mul.calculate(d, e, f);
	        Division div = new Division(d, e, f);
	        div.calculate(d, e);
	        div.calculate(d, e, f);
		}
            
	}


