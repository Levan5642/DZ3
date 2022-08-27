package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class B {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://marksandspencer.ru");

        WebElement webElement1 = driver.findElement(By.xpath("//span[text()='Карта магазинов']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//div[@class='jq-selectbox__trigger-arrow']"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//div[@class='jq-selectbox__select']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath("//option[text()='Екатеринбург']"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath("//div[@class='addresses']/div[1]/div[@class='ttl']\n"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//picture/img"));
        webElement6.click();
        driver.quit();








    }
}
