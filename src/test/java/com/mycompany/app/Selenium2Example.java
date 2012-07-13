package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example {

    @Test
    public void google() throws Exception {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://192.168.32.41:8080/audit/");
        new WebDriverWait(driver, 10);

        //Filtering Criteria Management actions
        WebElement FCMButton= driver.findElement(By.id("j_idt9:j_idt18"));
        FCMButton.click();
        new WebDriverWait(driver, 10);
        WebElement ANFCButton = driver.findElement(By.name("j_idt27:j_idt28"));
        ANFCButton.click();
        new WebDriverWait(driver, 10);
        WebElement FilterNameField = driver.findElement(By.id("filteringCriterion:filterName"));
        FilterNameField.sendKeys("AlexLITO");
        WebElement ExpressionField = driver.findElement(By.id("filteringCriterion:j_idt32"));
        ExpressionField.sendKeys("AlexLITO and Zebra");
        WebElement TestFilterXMLField = driver.findElement(By.id("filteringCriterion:testFilterXml"));
        TestFilterXMLField.sendKeys("123321");
        WebElement SaveButton = driver.findElement(By.id("filteringCriterion:j_idt37"));
        SaveButton.click();
        new WebDriverWait(driver, 10);

        //Filter Management Actions
        WebElement FMButton = driver.findElement(By.id("j_idt11:j_idt21"));
        FCMButton.click();
        new WebDriverWait(driver, 10);

        //Event Types Management Actions
        WebElement ETMButton = driver.findElement(By.id("j_idt11:j_idt22"));
        ETMButton.click();



        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();
    }


}