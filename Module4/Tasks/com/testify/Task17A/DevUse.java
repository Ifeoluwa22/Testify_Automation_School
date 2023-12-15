package com.testify.Task17A;

public class DevUse extends LoginPage {
    public DevUse(String username, String password) {
        super(username, password);
    }

    public static void main(String[] args) {
        DevUse developers = new DevUse("hhk", "gguyu");
        developers.RememberMeCheckbox();
       /* developers.ContinueToHomePageLink();
        developers.OAuthButton(); */
    }

    @Override
    public void RememberMeCheckbox() {
        System.out.println("Select the Remember me box");

    }

    @Override
    public void ContinueToHomePageLink() {
        System.out.println("Click to continue to the company Home page");

    }

    @Override
    public void OAuthButton() {
        System.out.println("Click on the OAuth button");

    }
}

