package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement category = driver.findElement(By.cssSelector("#gh-cat"));
        Select type = new Select(category);
        type = new Select(category);
        type.selectByIndex(6);

        WebElement itemName = driver.findElement(By.cssSelector("#gh-ac"));
        itemName.sendKeys("mini mavic");
        Thread.sleep(2000);

        WebElement clickButton = driver.findElement(By.cssSelector("#gh-btn"));
        clickButton.click();

        Thread.sleep(2000);


        List<WebElement> elementFound = driver.findElements(By.cssSelector("#srp-river-results > ul > li"));
        for (WebElement element : elementFound) {
            System.out.println(element.getText());


        }
        driver.close();
    }
}