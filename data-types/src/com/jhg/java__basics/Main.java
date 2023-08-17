package com.jhg.java__basics;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        //numeric data types
        int num1 = 59;
        short num2 = 5;
        float num3 = 49.007f;
        double num4 = 49.04;
        long num5 = 9;

        //2 decimal points
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Value of num1: " + num1 + " - Size of int: " + (Integer.SIZE/8) + " Bytes");
        System.out.println("Value of num2: " + num2 + " - Size of Short " + (Short.SIZE/8) + " Bytes");
        System.out.println("Value of num3: " + df.format(num3) + " - Size of Float " + (Float.SIZE/8) + " Bytes");
        System.out.println("Value of num4: " + num4 + " - Size of Double " + (Double.SIZE/8) + " Bytes");
        System.out.println("Value of num5: " + num5 + " - Size of Long " + (Long.SIZE/8) + " Bytes");
    }
}
