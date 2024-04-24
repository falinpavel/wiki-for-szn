package com.bft.trudvsem.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Этот класс служит базовым для всех тестовых классов. Он предоставляет экземпляр WebDriver, который может использоваться в тестах,
 * и обрабатывает установку и завершение сеанса WebDriver перед и после каждого тестового метода.
 */
public class TestBase {
    // Экземпляр WebDriver, который будет использоваться в тестах.
    protected WebDriver driver;

    /**
     * Этот метод выполняется перед каждым тестовым методом. Он инициализирует экземпляр WebDriver перед каждым тестом.
     */
    @BeforeMethod
    public void setUp() {
        // Получаем экземпляр WebDriver из DriverManager и присваиваем его полю 'driver'.
        driver = DriverManager.getDriver();
    }

    /**
     * Этот метод выполняется после каждого тестового метода. Он завершает сеанс WebDriver после каждого теста.
     */
    @AfterMethod
    public void tearDown() {
        // Завершаем сеанс WebDriver после каждого теста.
        DriverManager.quitDriver();
    }
}