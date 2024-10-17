package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1_Facebook_Login {

    @Test
    public void login()
    {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testuser@devopsxyz.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc@#12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        boolean displayed = driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]")).isDisplayed();
        Assert.assertTrue("Expected message is true",displayed);
        driver.quit();
    }
}
