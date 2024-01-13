package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2edge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4B\\Task\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://twitter.com/home");
        driver.manage().window().maximize();
    }

}
