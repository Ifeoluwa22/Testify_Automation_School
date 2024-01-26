package org.example.Task19.Task18;

import org.example.SauceDemoLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassA {
    WebDriver driver = null;


    @Test(groups = {"one"})
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Testify\\CI_CD_Clone\\ci_cdtestify\\Module4Bselenium\\src\\chromedriver.exe");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();


        //launch URl
        driver.get("https://www.saucedemo.com/");

        System.out.println("---Launch Website---");

        SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginButton().click();

        Thread.sleep(5000);
        System.out.println("Successful login");

        SoftAssert assertHomepage = new SoftAssert();
        String myHomePage = driver.findElement(By.xpath("//div[@id='']")).getText();

        assertHomepage.assertEquals(myHomePage, "Swag Labs");
        System.out.println("This is the HomePage for Sauce Demo");



    }


    @Test
    public void closeBrowser () {
        driver.quit();
    }
}
