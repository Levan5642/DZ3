package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class P{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://marksandspencer.ru");
        WebElement webElement1 = driver.findElement(By.xpath(".//input[@name='q']"));

        webElement1.click();
        webElement1.sendKeys("футболка");
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@name =\"s\"]"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//span[text() = 'Трикотажная рубашка-поло из хлопка']"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath("//div[@class= 'to_favorite']"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath("//span[@class='fav fav_pic']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//a[@class='button_green mini']"));
        webElement6.click();
        driver.quit();





    }


}