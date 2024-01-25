package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Task15 {

    WebDriver driver = null;

    @BeforeClass
    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        driver = new ChromeDriver(); //launch browser
        driver.manage().window().maximize();    // maximize browser
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void searchTestify() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("testify ltd");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name=btnK]")).click();
        Thread.sleep(5000);
        System.out.println("Search for Testify");
    }

    @Test
    public void searchColor() {
            driver.get("https://www.mcdonalds.com/us/en-us.html");
         String solordd =   driver.findElement(By.cssSelector("#button-ordernow")).getCssValue("background-color");
            System.out.println(solordd);
    }


    @AfterClass
    public void quitChrome() {
            driver.quit();
    }


}
