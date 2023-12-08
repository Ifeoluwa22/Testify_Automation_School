package com.testify;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        verifyVisitors();
    }

    public static void verifyVisitors() {

        Scanner visitorV = new Scanner(System.in);

        System.out.print("What is the name of the Slack channel you wish to join:  ");
        String userInput = visitorV.nextLine();

        if (userInput.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome To Testify Academy.");
        } else {

            System.out.println("You are not a registered member. Please contact support.");
        }


    }

}
//Create a method that verify that visitors on the slack channel are coming fot testify Trainings.
// If they write" Testify" then print out a  welcome messsage if not , the user should be shown rejection message.
// after creating this method,then invoke the created method in your main method