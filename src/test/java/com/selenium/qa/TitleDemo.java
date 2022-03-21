package com.selenium.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;

public class TitleDemo {

    @Test
    public void testTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Google";
       Assertions.assertEquals(expectedTitle,actualTitle);



    }


}
