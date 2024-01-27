package org.example.Task19.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class ClassC {
    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        driver = new ChromeDriver(); //Launch browser
        driver.manage().window().maximize();  //To Maximize the browser
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //Add implicit wait
        driver.get(" https://demoqa.com ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        Thread.sleep(5000);

    }

    @Test
    public void BookStoreApplication() throws InterruptedException {
        WebElement bookStore = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/*[1]"));
        bookStore.click();
        String bookStoreApp = driver.findElement(By.cssSelector(".main-header")).getText();
        Thread.sleep(3000);
        SoftAssert assertElements = new SoftAssert();
        assertElements.assertEquals(bookStoreApp, "Book Store");
        System.out.println("We are now on the bookstore app");

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();

    }
}
