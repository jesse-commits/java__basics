package com.jhg.java__basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float a;
	float b;
	float result;

        DecimalFormat df = new DecimalFormat();

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	a = scanner.nextInt();
	System.out.println("Enter a number");
	b = scanner.nextInt();

	result = a/b;

	System.out.println("the sum is " + df.format(result));
	System.out.printf("the sum is %.2f", result);

    }
}
