package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Demo Dropdown List']")).click();

        WebElement dropDown = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        WebElement months = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));

        JavascriptExecutor scroller = (JavascriptExecutor) driver;
        scroller.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        Select select = new Select(dropDown);
        select.selectByVisibleText("Nigeria");
        Thread.sleep(3000);


        Select select1 = new Select(months);
        select1.selectByVisibleText("January");
        select1.selectByVisibleText("February");
        select1.selectByVisibleText("March");


    }
}
