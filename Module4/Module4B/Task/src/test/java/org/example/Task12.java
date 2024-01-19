package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();

        driver.switchTo().frame(0);
        WebElement smallBox = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));

        Actions resize = new Actions(driver);
        Thread.sleep(3000);
        resize.clickAndHold(smallBox).moveByOffset(300, 500).build().perform();




    }
}
