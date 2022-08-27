package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        double grandTotal = 0;
        double num = 0;

        System.out.println("What is the student's name?");
        String name = keyboard.next();
        System.out.println("What is the student's score?");
        double score = keyboard.nextDouble();

        while (!name.equalsIgnoreCase("done")) {
            if (score < 0 || score > 100) {

                System.out.println("Sorry pick a number in the range");
            } else {

                grandTotal = grandTotal + score;
                num++;

            }
            System.out.println("What is the name of the next student?");
            name = keyboard.next();

            System.out.println("What is the score of the next student?");
            score = keyboard.nextDouble();


        }
        if (num > 0) {
            System.out.println(grandTotal / num);
        }
        else {
            System.out.println("No students took the exam!");
        }

    }
}