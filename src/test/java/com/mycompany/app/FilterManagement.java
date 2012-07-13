package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterManagement {


    @Test
    public void google() throws Exception {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://192.168.32.41:8080/audit/");
        new WebDriverWait(driver, 10);
        WebElement FMButton = driver.findElement(By.id("j_idt11:j_idt21"));
        FMButton.click();
        new WebDriverWait(driver, 10);

        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();
    }
}
