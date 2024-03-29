package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Task15 {

    WebDriver driver = null;

    @BeforeMethod
    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        driver = new ChromeDriver(); //launch browser
        driver.manage().window().maximize();    // maximize browser
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Start Browser");
    }
    @Test
    public void google() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("testify ltd");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name=btnK]")).click();
        Thread.sleep(5000);
        System.out.println("Search for Testify");
    }

    @Test
    public void searchColor() throws InterruptedException {
            driver.get("https://www.mcdonalds.com/us/en-us.html");
            Thread.sleep(5000);
         String colordd =   driver.findElement(By.cssSelector("#button-ordernow")).getCssValue("background-color");
            System.out.println(colordd);
        System.out.println("Mcdonalds run");
    }


    @AfterMethod
    public void quitChrome() {

        driver.quit();
        System.out.println("Close browser");
    }


}
