package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;


public class m {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://marksandspencer.ru");
        WebElement webElement1 = driver.findElement(By.xpath("//*[@class='prof prof_pic']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        webElement2.sendKeys("rainbow1975-1984@mail.ru");
        WebElement webElement3 = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        webElement3.sendKeys("rainbow1975");
        WebElement webElement4 = driver.findElement(By.xpath("//input[@name='Login']"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath("//span[text()='Мой профиль']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//a[@class='left-menu__link']"));
        webElement6.click();
        driver.quit();




    }
}