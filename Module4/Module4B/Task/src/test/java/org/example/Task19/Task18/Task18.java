package org.example.Task19.Task18;

import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Task18 {

    WebDriver driver = null;


        @BeforeClass
        public void launchChrome() {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
            driver = new ChromeDriver(); //Launch browser
            driver.manage().window().maximize();//To Maximize the browser
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);  //Add implicit wait
            //launch URl
            driver.get("https://www.saucedemo.com/");
            System.out.println("Launch Webpage");

        }


        @Test(priority = 1)
        public void loginTest() throws InterruptedException {
            SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
            login.getUsername().sendKeys("standard_user");
            login.getPassword().sendKeys("secret_sauce");
            login.getLoginButton().click();

            Thread.sleep(5000);
            System.out.println("You have logged in successfully");

        }

        @Test(priority = 2)
        public void selectItems () throws InterruptedException {
            SauceDemoProductPage items = new SauceDemoProductPage(driver);
            items.addBackPack().click();
            items.addBikeLight().click();
            items.addRedShirt().click();
            items.clickCartIcon().click();
            System.out.println("You have a backpack, bikelight and a red shirt in your cart");
            Thread.sleep(5000);
        }

        @Test(priority = 3)
        public void checkoutAssertion() throws InterruptedException {
            SauceDemoCartPage myCart = new SauceDemoCartPage(driver);
            String firstCartText = myCart.addBikeLight().getText();
            String secondCartText = myCart.addBackPack().getText();
            String thirdCartText = myCart.addRedShirt().getText();
            SoftAssert confirm = new SoftAssert();
            confirm.assertEquals(firstCartText, "Sauce Labs Bike Light");
            confirm.assertEquals(secondCartText, "Sauce Labs Backpack");
            confirm.assertEquals(thirdCartText, "Test.allTheThings() T-Shirt (Red)");
            System.out.println(firstCartText + " " + secondCartText + " " + thirdCartText);
            myCart.checkoutButton().click();
            System.out.println("Successfully verified item");
            confirm.assertAll();

            Thread.sleep(5000);
        }

        @Test(priority = 4)
        public void checkoutForm() throws InterruptedException {
            SauceDemoCheckoutPage checkoutForm = new SauceDemoCheckoutPage(driver);
            checkoutForm.inputFirstName().sendKeys("Ifeoluwa");
            checkoutForm.inputLastName().sendKeys("Adeboye");
            checkoutForm.inputZipCode().sendKeys("100102");
            Thread.sleep(3000);
            checkoutForm.clickContinue().click();
            System.out.println("You successfully checked out some items");

            Thread.sleep(5000);

        }

        @Test(priority = 5)
        public void finalAssertion() throws InterruptedException {
            SauceDemoCheckOverviewPage cartSummary = new SauceDemoCheckOverviewPage(driver);
            String cartTextOne = cartSummary.bikeLightHeader().getText();
            String cartTextTwo = cartSummary.backPackHeader().getText();
            String cartTextThree = cartSummary.redShirtHeader().getText();
            String thanks = cartSummary.thanksText().getText();
            SoftAssert confirmText = new SoftAssert();
            confirmText.assertEquals(cartTextOne, "Sauce Labs Bike Light");
            confirmText.assertEquals(cartTextTwo, "Sauce Labs Backpack");
            confirmText.assertEquals(cartTextThree, "Test.allTheThings() T-Shirt (Red)");
            System.out.println("The Cart Summary page is displayed");
            cartSummary.clickFinishButton().click();
            System.out.println("Final Thank you screen displayed");
            confirmText.assertEquals(thanks, "Thank you for your order!" );
            confirmText.assertAll();

            Thread.sleep(5000);
        }
        @AfterClass
        public void closeBrowser(){
            driver.quit();
        }

    }
