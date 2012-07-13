package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class FilteringCriteriaManagement {



    @Test
    public void google() throws Exception {
        for (int i = 0; i < 5; i++) {
            WebDriver driver = new FirefoxDriver();

            driver.get("http://192.168.32.41:8080/audit/");
            new WebDriverWait(driver, 10);

            //Filtering Criteria Management actions
            WebElement FCMButton = driver.findElement(By.id("j_idt11:j_idt20"));
            FCMButton.click();
            driver.get("http://192.168.32.41:8080/audit/pages/filter/criteria/editFilteringCriterion.jsf");
            //new WebDriverWait(driver, 10);
            //WebElement ANFCButton = driver.findElement(By.xpath("//*[@id="j_idt27:j_idt28"]/span"));
            //WebElement ANFCButton = driver.findElement(By.id("j_idt27:j_idt28"));
            //ANFCButton.click();
            new WebDriverWait(driver, 10);
            WebElement FilterNameField = driver.findElement(By.xpath("//*[@id=\"filteringCriterion:filterName\"]"));
            //WebElement FilterNameField = driver.findElement(By.id("filteringCriterion:filterName"));
            FilterNameField.sendKeys("AlexLITO-" + i);
            WebElement ExpressionField = driver.findElement(By.xpath("//*[@id=\"filteringCriterion:j_idt35\"]"));
            //WebElement ExpressionField = driver.findElement(By.id("filteringCriterion:j_idt32"));
            ExpressionField.sendKeys("AlexLITO and Zebra");
            WebElement TestFilterXMLField = driver
                    .findElement(By.xpath("//*[@id=\"filteringCriterion:testFilterXml\"]"));
            //WebElement TestFilterXMLField = driver.findElement(By.id("filteringCriterion:testFilterXml"));
            TestFilterXMLField.sendKeys("123321");
            WebElement SaveButton = driver.findElement(By.xpath("//*[@id=\"filteringCriterion:j_idt40\"]"));
            //WebElement SaveButton = driver.findElement(By.id("filteringCriterion:j_idt37"));
            SaveButton.click();
            new WebDriverWait(driver, 10);
            //System.out.println("Page title is:" + driver.getTitle());
            assertTrue(driver.getPageSource().contains("AlexLITO"));





                        //Close the browser
        driver.quit();
    }
    }
}

