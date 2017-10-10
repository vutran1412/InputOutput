package com.vu;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Please enter your name");
        Scanner strings = new Scanner(System.in);
        String name = strings.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How many students in your class? ");
        Scanner num = new Scanner(System.in);
        int numOfStudents = num.nextInt();
        if (numOfStudents > 20) {
            System.out.println("That's a big class!");
        } else {
            System.out.println("That's a small class!");
        }


        System.out.println("How many rooms are in your house? ");
        int rooms = num.nextInt();
        if (rooms > 5) {
            System.out.println("Wow that's a big house!");
        } else if (rooms < 5 && rooms > 3) {
            System.out.println("That's a medium sized house");

        } else if (rooms < 3) {
            System.out.println("That's a small house!");
        }

        System.out.println("What is the temperature today?");
        double temp = num.nextDouble();
        if (temp > 80) {
            System.out.println("It's a hot day!");
        } else if (temp > 60 && temp < 80) {
            System.out.println("Perfect day!");
        } else if (temp < 60) {
            System.out.println("It's a chilly day!");
        }

        System.out.println("Where do you go to school? ");
        String school = strings.nextLine();
        System.out.println(school + " is a good school!");

        strings.close();
        num.close();
    }
}
