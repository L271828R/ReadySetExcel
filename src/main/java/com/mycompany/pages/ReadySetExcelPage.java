package com.mycompany.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ReadySetExcelPage {
    private WebDriver pagedriver;
    private String url = "https://www.readysetexcel.net";
    private WebElement get_in_touch;

    public ReadySetExcelPage(WebDriver driver) {
        pagedriver = driver;
    };

    public void go() {
        pagedriver.get(url);
    };

    public String getTitle(){
        return pagedriver.getTitle();
    }

    public void clickGetInTouchMain(){
        pagedriver.switchTo().frame(0);
        get_in_touch = pagedriver.findElement( By.cssSelector(".button a.btn.btn-primary"));
        get_in_touch.click();
    }




}