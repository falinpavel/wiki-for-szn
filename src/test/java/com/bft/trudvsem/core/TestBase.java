package com.bft.trudvsem.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    // Объявляем экземпляр WebDriver, который будет использоваться в тестах
    protected WebDriver driver;

    // Метод, выполняемый перед каждым тестовым методом
    @BeforeMethod
    public void setUp() {
        // Инициализируем экземпляр WebDriver перед каждым тестом
        driver = DriverManager.getDriver();
    }

    // Метод, выполняемый после каждого тестового метода
    @AfterMethod
    public void tearDown() {
        // Завершаем сеанс WebDriver после каждого теста
        DriverManager.quitDriver();
    }
}