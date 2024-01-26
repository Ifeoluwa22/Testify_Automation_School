package org.example.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class dNavigateInteractions {
    WebDriver driver = null;

    @BeforeClass
    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        driver = new ChromeDriver(); //launch browser
        driver.manage().window().maximize();    // maximize browser
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void NavigateAndAssertInteractions() throws InterruptedException {
        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[5]")).click();
        Thread.sleep(5000);
        String header = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]")).getText();
        SoftAssert four = new SoftAssert();
        four.assertEquals(header, "Interactions");
        four.assertAll();
    }

    @AfterClass
    public void close() {
        System.out.println("Navigate to forms");
        driver.quit();
    }

}
