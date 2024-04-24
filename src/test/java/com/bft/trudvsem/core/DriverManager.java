package com.bft.trudvsem.core;

import com.bft.trudvsem.config.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver;

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса
    private DriverManager() {
    }

    // Метод для получения экземпляра WebDriver
    public static WebDriver getDriver() {
        // Если драйвер еще не инициализирован, вызываем метод инициализации
        if (driver == null) {
            initializeDriver();
        }
        // Возвращаем инициализированный драйвер
        return driver;
    }

    // Метод для инициализации WebDriver на основе выбранного браузера
    private static void initializeDriver() {
        // Получаем имя браузера в нижнем регистре
        String browser = AppConfig.BROWSER.toLowerCase();
        // Если выбран браузер Chrome
        if (browser.equals("chrome")) {
            // Устанавливаем системную переменную для пути к драйверу Chrome
            System.setProperty("webdriver.chrome.driver", AppConfig.DRIVER_PATH);
            // Получаем опции Chrome из конфигурации
            ChromeOptions options = AppConfig.getChromeOptions();
            // Создаем экземпляр драйвера Chrome с указанными опциями
            driver = new ChromeDriver(options);
        }
        // Добавьте поддержку других браузеров здесь, если это необходимо
        // else if (browser.equals("firefox")) {
        //     ...
        // }
        // И так далее
        else {
            // Если выбран неподдерживаемый браузер, выбрасываем исключение
            throw new IllegalArgumentException("Неподдерживаемый браузер: " + browser);
        }

        // Развертываем окно браузера, удаляем все cookies и переходим на базовый URL
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(AppConfig.BASE_URL);
    }

    // Метод для завершения работы с WebDriver
    public static void quitDriver() {
        // Если драйвер инициализирован, закрываем его и устанавливаем ссылку на null
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}