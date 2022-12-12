package com.kodilla.selenium.pom.homework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreAppPom {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.search("Notebook");
        driver.close();
    }
}