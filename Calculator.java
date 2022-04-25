package com.simplilearn;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1, num2, res=0.0;
		int ch;
		
		System.out.println("Which of the following operation you want to perform?");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		ch = sc.nextInt();
		if(ch > 4 || ch < 1)
		{
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Enter the first number : ");
		num1 = sc.nextDouble();
		System.out.println("Enter the second number : ");
		num2 = sc.nextDouble();
		switch(ch)
		{
			case 1 : res = num1 + num2; break;
			case 2 : res = num1 - num2; break;
			case 3 : res = num1 * num2; break;
			case 4 : res = num1 / num2; break;
		}
		System.out.println("Result is "+res);

	}

}
