package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/dialog/");

        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[1]/button[1]")).click();
    }
}
