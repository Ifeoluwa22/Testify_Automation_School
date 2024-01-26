package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCartPage {
    WebDriver Sdriver = null;
    public SauceDemoCartPage(WebDriver driver) {
        Sdriver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]")
    private WebElement bikeLight;
    public WebElement addBikeLight(){

        return bikeLight;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")
    private WebElement backPack;
    public WebElement addBackPack(){

        return backPack;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]")
    private WebElement redShirt;
    public WebElement addRedShirt(){

        return redShirt;
    }


    @FindBy(css = "#checkout")
    private WebElement checkout;
    public WebElement checkoutButton(){
        return checkout;
    }

}
