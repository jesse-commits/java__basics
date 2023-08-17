package com.jhg.java__basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("you are old enough to vote");
        }else{
            System.out.println("Sorry you are not old enough to vote.");
        }
    }
}
