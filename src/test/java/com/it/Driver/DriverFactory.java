package com.it.Driver;

import com.it.Common.Constants;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static String UserName = "sdsgffedgdsfg1";
    public static String AccessKey = "GjJptUdBBrxKVxiN7suz";
    public static String URLka = "https://" + UserName + ":" +  AccessKey + "@hub.browserstack.com/wd/hub";


    public static WebDriver getDriver() throws MalformedURLException {

        WebDriver driver = null;

        String name = System.getProperty("driver");

        if ("firefox".equals(name)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else if ("browserStack - Safari".equals(name)) {

            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setPlatform(Platform.MAC);
            capability.setBrowserName("Safari");
            capability.setVersion("7.1");
            capability.setCapability("browserstack.debug", true);
            System.out.println("Бразуерстак инициализация");
            driver = new RemoteWebDriver(new URL(URLka), capability);
        }

        else if ("browserStack - Chrome".equals(name)) {

            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setPlatform(Platform.WINDOWS);
            capability.setBrowserName("Chrome");
            capability.setVersion("66");
            capability.setCapability("browserstack.debug", true);
            System.out.println("Бразуерстак инициализация");
            driver = new RemoteWebDriver(new URL(URLka), capability);
        }

        else {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        return driver;

    }
}
