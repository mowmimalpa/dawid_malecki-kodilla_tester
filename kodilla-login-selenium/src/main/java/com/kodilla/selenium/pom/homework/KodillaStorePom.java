package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom extends KodillaAbstractPom {
    @FindBy(css = "#searchField")
    WebElement searchField;
    WebElement results;

    WebDriver driver;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SearchContext search(String word) {
        searchField.sendKeys(word);
        return results;
    }

    public void close() {
        driver.close();
    }
}