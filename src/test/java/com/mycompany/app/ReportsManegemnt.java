package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: alexandr.tkachuk
 * Date: 13.07.12
 * Time: 13:30
 * To change this template use File | Settings | File Templates.
 */
public class ReportsManegemnt {
    @Test
    public void google() throws Exception {
            for ( ; ; ){
            WebDriver driver = new FirefoxDriver();

            driver.get("http://192.168.32.41:8080/audit/");
            new WebDriverWait(driver, 10);
            Actions actions = new Actions(driver);
            WebElement drag = driver.findElement(By.xpath("//*[@id=\"j_idt11:j_idt15\"]/ul/li[2]"));
            WebElement to = driver.findElement(By.id("j_idt11:j_idt18"));
            actions.dragAndDrop(drag, to);
            actions.perform();

            driver.get("http://192.168.32.41:8080/audit/pages/report/reportGeneration.jsf");
        new WebDriverWait(driver, 10);


        WebElement Design1 = driver.findElement(By.id("reportGeneration:j_idt29"));
        Design1.click();
        WebElement Design2 = driver.findElement(By.xpath("//*[@id=\"reportGeneration:j_idt29_panel\"]/ul/li[3]"));
        Design2.click();
        WebElement inputName = driver.findElement(By.id("reportGeneration:searchFilterName"));
        inputName.sendKeys("AlexLITO");
        WebElement ButtonGen = driver.findElement(By.id("reportGeneration:runReportButton"));
        ButtonGen.click();
        new WebDriverWait(driver, 30);

        driver.get("http://192.168.32.41:8080/audit/pages/report/reports.jsf");
        new WebDriverWait(driver,10);
        new WebDriverWait(driver, 30);















            }

        //Close the browser
            driver.quit();
        }
    }

