package org.example.Task19.Task18;

import org.example.SauceDemoLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClassB {
    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Add implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);


        //launch URl
        driver.get("https://www.saucedemo.com/");

        System.out.println("Launch Website");

        SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginButton().click();

        Thread.sleep(3000);
        System.out.println("Successful login");

    }

    @Test
    public void hamburgerCloseButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='react-burger-cross-btn']")).click();

        Thread.sleep(3000);

    }

    @AfterClass
    public void closeBrowser () {
        driver.quit();
    }
}
