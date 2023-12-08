package com.testify;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please input the Principal amount: ");
        short Principal = userinput.nextShort();
        System.out.println("Please input the assumed annual interest rate: ");
        short Interest = userinput.nextShort();
        System.out.println("Please input the time in years: ");
        short time = userinput.nextShort();


        int simpleInterest = (Principal * Interest * time)/100;

        System.out.println("The simple interest in percentage is: " + simpleInterest);


    }
}

// Build a Simple interest calculator.
// Write a program to ask the user for the necessary field you need in calculating the simple interest and
// then communicate the simple interest back to the user in a good sentence