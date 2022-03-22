package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    @Test
    public void mouseTest()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().fullscreen();
        WebElement element = driver.findElement(By.linkText("Sign in"));
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.doubleClick(element).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.id("identifierId")).sendKeys("Nasrullah Bari");




    }
}
