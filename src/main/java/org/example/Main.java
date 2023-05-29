package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var drivers = new ArrayList<WebDriver>(Arrays.asList(new ChromeDriver(), new EdgeDriver(),
                new FirefoxDriver()));
        for (var driver:drivers)
        {
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/text-box");
            var nameElement = driver.findElement(By.id("userName"));
            var emailElement = driver.findElement(By.id("userEmail"));
            var currentAddress = driver.findElement(By.id("currentAddress"));
            var permanentAddress = driver.findElement(By.id("permanentAddress"));
            var submit = driver.findElement(By.id("submit"));
            nameElement.sendKeys("aaa");
            emailElement.sendKeys("tr43@ya.ru");
            currentAddress.sendKeys("Address");
            permanentAddress.sendKeys("Permanent Address");
            Thread.sleep(30000);
            submit.click();
        }
        // driver.quit(
    }
}