package com.jhg.java__basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
	int b;
	int result;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	a = scanner.nextInt();
	System.out.println("Enter a number");
	b = scanner.nextInt();

	result = a+b;

	System.out.println("the sum is " + result);
	System.out.printf("the sum is %d", result);

    }
}
