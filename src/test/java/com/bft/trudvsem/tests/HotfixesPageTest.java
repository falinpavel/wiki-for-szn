package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.HotfixesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotfixesPageTest extends TestBase {

    @Test
    public void verifyHotfixesSectionIsDisplayed() {
        driver.get("URL страницы с хотфиксами");
        HotfixesPage hotfixesPage = new HotfixesPage();
        Assert.assertTrue(hotfixesPage.isHotfixesSectionDisplayed());
    }

    // Добавьте другие тесты для страницы с хотфиксами при необходимости
}