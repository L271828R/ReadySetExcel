package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import com.mycompany.pages.ReadySetExcelPage;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public String url = "https://www.readysetexcel.net/";
    public WebDriver driver;
    public ReadySetExcelPage page;

    @BeforeTest
    public void setBaseUrl() {
        System.setProperty("webdriver.chrome.driver", ".//chromedriver");
        driver = new ChromeDriver();
        page = new ReadySetExcelPage(driver);
        page.go();
        System.out.println("Working Directory = " +
              System.getProperty("user.dir"));
    }


    @AfterTest
    public void endSession(){
        driver.quit();
    }


    @Test
    public void verifyHomePageTitle() {
        String title = page.getTitle();
        Assert.assertEquals("Ready.Set.Excel.", title);
    }

    @Test
    public void verifyGetInTouchMain(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Long value1 = (Long) executor.executeScript("return window.pageYOffset;");
        page.clickGetInTouchMain();
        Long value2 = (Long) executor.executeScript("return window.pageYOffset;");
        System.out.println("value1=" + value1.toString());
        System.out.println("value2=" + value2.toString());
        Assert.assertNotEquals(value1, value2);
    }
}
