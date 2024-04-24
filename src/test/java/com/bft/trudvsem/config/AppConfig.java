package com.bft.trudvsem.config;

import org.openqa.selenium.chrome.ChromeOptions;

public class AppConfig {
    // URL вашего веб-приложения
    public static final String BASE_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";

    // Настройки для WebDriver
    public static final String BROWSER = "chrome"; // Имя браузера
    public static final String DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe"; // Путь к исполняемому файлу драйвера
    public static final int IMPLICIT_WAIT_TIMEOUT = 5; // Время неявного ожидания в секундах
    public static final int EXPLICIT_WAIT_TIMEOUT = 10; // Время явного ожидания в секундах
    // Дополнительные настройки для ChromeOptions
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // Установка пути для загрузки файлов
        options.addArguments("--lang=ru");

        return options;
    }
}