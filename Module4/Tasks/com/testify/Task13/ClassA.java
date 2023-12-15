package com.testify.Task13;

public class ClassA {
        String fruits;
        int number;
        boolean inSeason;

        public ClassA(String newFruits){
            fruits = newFruits;
        }

        public ClassA(String newFruits, int newNumber){
            number = newNumber;
        }

        public ClassA(String newFruits, int newNumber, boolean newInSeason){
            inSeason = newInSeason;
        }
    }

//Create 3 different constructors of a class A.
// Create 3 objects of Class A in class B and
// use the 3 different constructors when creating each of the objects of class A in class B