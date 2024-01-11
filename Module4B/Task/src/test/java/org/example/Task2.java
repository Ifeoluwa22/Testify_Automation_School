package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4B\\Task\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://twitter.com/home");
        driver.manage().window().maximize();

        System.setProperty("webdriver.firefox.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4B\\Task\\src\\geckodriver.exe");
        WebDriver driverTwo = new FirefoxDriver();
        driverTwo.get("https://fast.com/");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driverThree = new ChromeDriver();
        driverThree.get("https://yopmail.com/en/");
        driverThree.manage().window().maximize();
    }
}
