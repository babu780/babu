package com.selenium.qa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    WebDriver driver;

    @Test
    public void googleSearchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\ITLearning\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(15000);
        driver.findElement(By.name("q")).sendKeys("Australia");
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().forward();
        Thread.sleep(10000);
        driver.navigate().refresh();
    }


}
