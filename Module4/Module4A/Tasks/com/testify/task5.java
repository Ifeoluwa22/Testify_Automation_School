package com.testify;

public class task5 {
    public static void main(String[] args) {
        //Write a code to: If the number is divisible by 3, print Fizz instead of the number.
        //If the number is divisible by 5, print Buzz instead of the number.
        //If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.

        int number = 22;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if (number % 5 == 0){
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }

    }

}
