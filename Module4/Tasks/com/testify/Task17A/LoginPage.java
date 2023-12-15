package com.testify.Task17A;

public abstract class LoginPage {
    private String username;
    private String password;


    public LoginPage(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public void insertUsername() {
        System.out.println("Please enter your username: " + username);
    }

    public void insertPassword() {
        System.out.println("Please enter your password: " + password);
    }

    public void forgotPasswordButton() {
        System.out.println("Forgot Password");
    }

    public void signInButton() {
        System.out.println("Sign In Here");
    }

    // Abstract methods for optional element
    public abstract void RememberMeCheckbox();

    public abstract void ContinueToHomePageLink();

    public abstract void OAuthButton();
}

//You are required to build the blueprint for your company's login page.
// From the discussions with the product team, all login pages will have a username field, password field,
// forgot password field, and sign-in button while other elements like remember me checkbox, continue to homePage,
// OAuth button will not be applicable to all login pages.
// with your knowledge of Abstract classes, Create a class that others developers will have to inherit from