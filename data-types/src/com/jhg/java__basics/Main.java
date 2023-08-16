package com.jhg.java__basics;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        //numeric data types
            int num1 = 32;
            short num2 = 9;
            float num3 = 45.006f;
            double num4 = 43.79;
            long num5 = 5;

        //Round decimal to 2 places
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);

	    System.out.println("Value of num1: " + num1 + " - Size of int is " + (Integer.SIZE/8) + " bytes");
        System.out.println("Value of num2: " + num2 + " - Size of short is " + (Short.SIZE/8) + " bytes");
        System.out.println("Value of num3: " + (df.format(num3)) + " - Size of float is " + (Float.SIZE/8) + " bytes");
        System.out.println("Value of num4: " + num4 + " - Size of double is " + (Double.SIZE/8) + " bytes");
        System.out.println("Value of num5: " + num5 + " - Size of long is " + (Long.SIZE/8) + " bytes");
    }
}
