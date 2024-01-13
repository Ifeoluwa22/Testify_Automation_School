package com.testify;

public class task3 {
    public static void main(String[] args) {
        String person = "I am ";
        int age = 57;
        String remaining = " years old.";
        String myAge = person + age + remaining;
        System.out.println(myAge);

        System.out.println(person.concat(age + remaining));

    }
}
