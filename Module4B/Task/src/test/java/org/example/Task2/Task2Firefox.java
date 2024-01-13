package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2Firefox {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4B\\Task\\src\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://fast.com/");
    }
}
