package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");

        Boolean buttonBefore = driver.findElement(By.cssSelector("#create")).isEnabled();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Temilade");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Odukoya");
        driver.findElement(By.cssSelector("#email")).sendKeys("Temtem@yopmail.com");
        driver.findElement(By.cssSelector("#female")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("Temzie123");
        driver.findElement(By.cssSelector("#confirmPass")).sendKeys("Temzie123");
        driver.findElement(By.cssSelector("#xpLevel")).sendKeys("I don't have anything to say so Lorem ipsum");


        Boolean buttonAfter = driver.findElement(By.cssSelector("#create")).isEnabled();
        Thread.sleep(3000);

        System.out.println("The create account button is enabled BEFORE inputting details: " + buttonBefore);
        System.out.println("The create account button is enabled AFTER inputting details: " + buttonAfter);

    }
}
