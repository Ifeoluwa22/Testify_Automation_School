package com.testify.Task17B;

public class TestClass implements TestInterface{

    @Override
    public void testUsername(String username) {
        System.out.println("Enter your username: ");
    }

    @Override
    public void testPassword(String password) {
        System.out.println("Enter your password: ");
    }

    @Override
    public void successfulLogin(String username, String password) {
        System.out.println("Successfully Logged in");
    }
}
