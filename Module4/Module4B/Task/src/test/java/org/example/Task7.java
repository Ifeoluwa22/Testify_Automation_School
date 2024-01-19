package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\TESTIFY\\Testify_Automation_School\\Module4\\Module4B\\Task\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#q_search")).sendKeys("Lagos");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/form/input[3]")).click();
        Thread.sleep(4000);

        String date1 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")).getText();
        String forecast1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[4]")).getText();
        System.out.println("The first forecast is on: " + date1 + " showing " + forecast1);

        String date2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]")).getText();
        String forecast2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[4]")).getText();
        System.out.println("The second forecast is on: " + date2 + " showing " + forecast2);

        String date3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]")).getText();
        String forecast3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[3]/div[4]")).getText();
        System.out.println("The third forecast is on: " + date3 + " showing " + forecast3);

        String date4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]")).getText();
        String forecast4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[4]/div[4]")).getText();
        System.out.println("The fourth forecast is on: " + date4 + " showing " + forecast4);


    }
}
