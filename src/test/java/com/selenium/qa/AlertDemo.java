package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class AlertDemo {
    @Test
    public void alerTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(10000);
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(10000);
        System.out.println("alerTest");
        driver.close();




    }
}
