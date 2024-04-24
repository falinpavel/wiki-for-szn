package com.bft.trudvsem.core;

import com.bft.trudvsem.config.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

    private static void initializeDriver() {
        String browser = AppConfig.BROWSER.toLowerCase();
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", AppConfig.DRIVER_PATH);
            ChromeOptions options = AppConfig.getChromeOptions();
            driver = new ChromeDriver(options);
        }
        // Добавьте поддержку других браузеров, если необходимо
        // else if (browser.equals("firefox")) {
        //     ...
        // }
        // И так далее
        else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(AppConfig.BASE_URL);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}