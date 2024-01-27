package org.example.Task19.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassA {
    WebDriver driver = null;


    @Test(groups = {"first"})
    public void verifyHomepage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");

        driver = new ChromeDriver(); //Launch browser
        driver.manage().window().maximize();  //To Maximize the browser

        driver.get(" https://demoqa.com ");
        SoftAssert assertHomepage = new SoftAssert();
        String HomePage = driver.findElement(By.cssSelector(".banner-image")).getText();

        assertHomepage.assertEquals(HomePage, "Selenium Online Training");
        System.out.println("This is the homepage");
        Thread.sleep(5000);
    }


    @Test(priority = 2)
    public void closeBrowser() {
        driver.quit();
    }
}
