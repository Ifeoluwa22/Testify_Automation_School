package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckOverviewPage {
    WebDriver Sdriver = null;
    public SauceDemoCheckOverviewPage(WebDriver driver) {
        Sdriver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]")
    private WebElement bikeLight;
    public WebElement bikeLightHeader(){
        return bikeLight;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")
    private WebElement backPack;
    public WebElement backPackHeader(){
        return backPack;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]")
    private WebElement redShirt;
    public WebElement redShirtHeader(){
        return redShirt;
    }

    @FindBy(css = "#finish")
    private WebElement finishButton;
    public WebElement clickFinishButton(){
        return finishButton;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h2[1]")
    private WebElement Thanks;
    public WebElement thanksText(){
        return Thanks;
    }



}
