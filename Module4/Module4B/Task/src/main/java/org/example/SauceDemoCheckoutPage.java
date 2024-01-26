package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckoutPage {
    WebDriver Sdriver = null;
    public SauceDemoCheckoutPage(WebDriver driver) {
        Sdriver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#first-name")
    private WebElement firstName;
    public WebElement inputFirstName(){
        return firstName;
    }

    @FindBy(css = "#last-name")
    private WebElement lastName;
    public WebElement inputLastName(){
        return lastName;
    }

    @FindBy(css = "#postal-code")
    private WebElement zipCode;
    public WebElement inputZipCode(){
        return zipCode;
    }

    @FindBy(css = "#continue")
    private WebElement continueButton;
    public WebElement clickContinue(){
        return continueButton;
    }
}
