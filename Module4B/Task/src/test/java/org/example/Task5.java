package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4B\\Task\\src\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
            driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/button")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
            Thread.sleep(5000);

    }
}
