package com.jhg.java__basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Double principle;
	    Double interestRate = 0.035;
	    Double interestEarned;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principle: ");
        principle = scanner.nextDouble();
        interestEarned = principle*interestRate;
        System.out.printf("Interest earned:  $%.2f", interestEarned);
    }
}
