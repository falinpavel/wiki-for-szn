package com.bft.trudvsem.config;

import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Класс конфигурации для приложения.
 * В этом классе содержатся настройки, которые используются в других классах
 */
public class AppConfig {
    // Этот URL будет использоваться для запуска тестов и выполнения действий
    public static final String BASE_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";
    //public static final String HOTFIX_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";
    //public static final String INCIDENT_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";
    //public static final String QUESTION_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";
    //public static final String HOTFIX_MANAGEMENT_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";
    //public static final String INCIDENT_MANAGEMENT_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";
    //public static final String QUESTION_MANAGEMENT_URL = "https://wiki-ts-dev01.k8s.trudvsem.ru/";

    // Имя браузера, который будет использоваться для выполнения тестов.
    // В данном случае, используется Google Chrome.
    public static final String BROWSER = "chrome";

    // Путь к исполняемому файлу драйвера для WebDriver.
    public static final String DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";

    // Время неявного ожидания в секундах.
    // Это время ожидания, которое будет использоваться при выполнении действий с веб-страницами.
    // Например, при ожидании загрузки страницы или ожидании видимости элемента на странице.
    public static final int IMPLICIT_WAIT_TIMEOUT = 5;

    // Время явного ожидания в секундах.
    // Это время ожидания, которое будет использоваться при выполнении действий с веб-страницами.
    // Например, при ожидании загрузки элемента на странице или ожидании отсутствия элемента на странице.
    public static final int EXPLICIT_WAIT_TIMEOUT = 10;

    /**
     * Получить настройки ChromeOptions для приложения.
     * @return объект ChromeOptions с дополнительными настройками
     */
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // Установить путь для загрузки файлов.
        // Это позволит указать путь, по которому будут сохраняться загруженные файлы.
        options.addArguments("--lang=ru");

        return options;
    }
}