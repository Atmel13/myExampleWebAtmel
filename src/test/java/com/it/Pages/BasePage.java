package com.it.Pages;

import com.it.Driver.DriverFactory;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


public class BasePage {

    protected Logger log = LogManager.getLogger(this.getClass());
    static protected WebDriver driver;

    static {
        try {
            driver = DriverFactory.getDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public BasePage() {
        PropertyConfigurator.configure("log4j2.properties");
        PageFactory.initElements(driver, this);


    }
}
