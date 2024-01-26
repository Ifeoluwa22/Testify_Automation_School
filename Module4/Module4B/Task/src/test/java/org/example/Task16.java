package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Task16 {

        WebDriver driver = null;

        @BeforeClass
        public void launchChrome() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
            driver = new ChromeDriver(); //launch browser
            driver.manage().window().maximize();    // maximize browser
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }
        @Test
        public void assertTestify() throws InterruptedException {
            driver.get("https://testifyltd.com/");
            JavascriptExecutor scroller = (JavascriptExecutor) driver;
            scroller.executeScript("window.scrollBy(0, 5300)");
            Thread.sleep(3000);

           String info = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText();
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(info, "EMAIL: info@testifyltd.co.uk\n" +
                    "LOCATION: Nigeria\n" +
                    "PHONE: (+234)904-882-0971\n");
            sa.assertAll();

        }

        @AfterClass
        public void end(){
            driver.quit();

    }
}
