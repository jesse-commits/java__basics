package com.jhg.java__basics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    char upperCase = 'A';
	    char lowerCase = 'b';
	    char numericalCharacter = '3';
	    char number = 80;
	    String myString = "Today is a beautiful day";

	    char[] vowels = {'a','e','i','o','u'};

	    char[] chars = myString.toCharArray();

	    String st = String.valueOf(vowels);
	    String st2 = new String(vowels);

	    System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(numericalCharacter);
		System.out.println(number);

		System.out.println(st);
		System.out.println(st2);

		System.out.println(Arrays.toString(chars));


    }
}
