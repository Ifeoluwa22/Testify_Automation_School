package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoProductPage {
    WebDriver Sdriver = null;
    public SauceDemoProductPage(WebDriver driver) {
        Sdriver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLight;
    public WebElement addBikeLight(){
        return bikeLight;
    }

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement backPack;
    public WebElement addBackPack(){
        return backPack;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement redShirt;
    public WebElement addRedShirt(){
        return redShirt;
    }

    @FindBy(css = "div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")
    private WebElement cart;
    public WebElement clickCartIcon(){
        return cart;
    }

}
