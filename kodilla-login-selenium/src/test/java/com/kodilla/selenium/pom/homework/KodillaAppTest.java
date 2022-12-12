package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KodillaAppTest{
    //NoteBook
    //School
    //Brand
    //Business
    //Gaming
    //Powerful
    KodillaStorePom searchPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        searchPom = new KodillaStorePom (driver);
    }

    @Test
    public void NotebookSearch() throws InterruptedException {
        String searchWord = "NoteBook";
        searchPom.search(searchWord);
        Thread.sleep(10000);
        List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"elements-wrapper\"]/div"));
        int laptop = find.size();
        assertEquals(2, laptop);

    }
    @Test
    public void SchoolSearch() throws InterruptedException {
        String searchWord = "School";
        searchPom.search(searchWord);
        Thread.sleep(10000);
        List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"elements-wrapper\"]/div"));
        int laptop = find.size();
        assertEquals(1, laptop);
    }

    @Test
    public void BrandSearch() throws InterruptedException {
        String searchWord = "Brand";
        searchPom.search(searchWord);
        Thread.sleep(10000);
        List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"elements-wrapper\"]/div"));
        int laptop = find.size();
        assertEquals(1, laptop);
    }
    @Test
    public void BusinessSearch() throws InterruptedException {
        String searchWord = "Business";
        searchPom.search(searchWord);
        Thread.sleep(10000);
        List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"elements-wrapper\"]/div"));
        int laptop = find.size();
        assertEquals(0, laptop);


    }
    @Test
    public void GamingSearch() throws InterruptedException {
        String searchWord = "Gaming";
        searchPom.search(searchWord);
        Thread.sleep(10000);
        List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"elements-wrapper\"]/div"));
        int laptop = find.size();
        assertEquals(1, laptop);

    }
    @Test
    public void PowerfulSearch() throws InterruptedException {
        String searchWord = "Powerful";
        searchPom.search(searchWord);
        Thread.sleep(10000);
        List<WebElement> find = driver.findElements(By.xpath("//*[@id=\"elements-wrapper\"]/div"));
        int laptop = find.size();
        assertEquals(0, laptop);
    }
    @AfterEach
    public void closing() {
        searchPom.close();
    }
}