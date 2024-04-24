package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.HotfixManagementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotfixManagementPageTest extends TestBase {

    @Test(description = "Проверка заголовка", priority = 1)
    public void verifyHotfixManagementSectionIsDisplayed() {
        driver.get("URL страницы управления хотфиксами");
        HotfixManagementPage hotfixManagementPage = new HotfixManagementPage();
        Assert.assertTrue(hotfixManagementPage.isHotfixManagementSectionDisplayed());
    }

    // Добавьте другие тесты для страницы управления хотфиксами при необходимости
}