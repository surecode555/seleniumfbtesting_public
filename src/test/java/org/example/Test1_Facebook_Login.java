package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1_Facebook_Login {

    @Test
    public void login()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com/");
        System.out.println("URL launched");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testuser@devopsxyz.com");
        System.out.println("Username is entered");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc@#12345");
        System.out.println("Password is entered");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login button is clicked successfully");
        /*WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement errText = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email_container\"]/div[2]/a")));
        System.out.println("wait time is over");
        //boolean displayed = driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]")).isDisplayed();
        boolean displayed = errText.isDisplayed();
        Assert.assertTrue("Expected message is true",displayed);*/
        System.out.println("Test script executed successfully");
        driver.quit();
        System.out.println("Webdriver is closed successfully");
    }
}
