package com.testify;

import java.util.InputMismatchException;
import java.util.Scanner;
public class task18 {
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please input your age: ");
                scanner.nextInt();

                scanner.close();

            } catch (InputMismatchException inputException){
                System.out.println("Invalid age syntax");
                System.out.println(inputException);

            }

        }

}
//Write a code that asks the user for age and that accepts the Integer value.
// Handle the error that is encountered when the users tries to enter a name instead of age