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

public class ClassB {
    WebDriver driver = null;


    @BeforeClass
    public void launchChrome() throws InterruptedException {

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
    public void demoAlertFraWindows() throws InterruptedException {
        WebElement Alert = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/*[1]"));

        Alert.click();

        String FrameWindowsPage = driver.findElement(By.cssSelector(".main-header")).getText();

        Thread.sleep(3000);
        SoftAssert assertElements = new SoftAssert();
        assertElements.assertEquals(FrameWindowsPage, "Alerts, Frame & Windows");
        System.out.println("We are now on the Alert, Frames & Windows Page ");

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
