package com.testify.Task17B;

public interface TestInterface {
    public void testUsername(String username);
    public void testPassword(String password);

    public void successfulLogin(String username, String password);
}
// All testers in your unit must test that the correct username is entered,
// correct password that matches the username and that Login to the homePage or dashboard is successful.
// As the test Lead, create an interface that the testers should