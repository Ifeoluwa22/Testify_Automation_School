package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("testify ltd");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name=btnK]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();
        Thread.sleep(5000);

        JavascriptExecutor scroller = (JavascriptExecutor) driver;
        scroller.executeScript("window.scrollBy(0, 5500)");
        Thread.sleep(5000);

        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);

        Set<String> windows = driver.getWindowHandles();
        for (String window: windows){
            driver.switchTo().window(window);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());

            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg")){
                driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/section[1]/button[1]/icon[1]/*[1]")).click();
                System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/section[1]/div[1]/p[1]")).getText());
            }
        }


    }
}
