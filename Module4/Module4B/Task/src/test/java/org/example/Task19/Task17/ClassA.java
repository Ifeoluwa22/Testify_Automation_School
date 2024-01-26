package org.example.Task19.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassA {
    WebDriver driver = null;


    @Test(groups = {"one"})
    public void verifyUserOnDemoPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();


        driver.get(" https://demoqa.com ");

        SoftAssert assertHomepage = new SoftAssert();
        String myHomePage = driver.findElement(By.cssSelector(".banner-image")).getText();

        assertHomepage.assertEquals(myHomePage, "Selenium Online Training");
        System.out.println("HomePage for Demo QA site");

        Thread.sleep(5000);
    }


    @Test(priority = 2)
    public void closeBrowser() {
        driver.quit();
    }
}
