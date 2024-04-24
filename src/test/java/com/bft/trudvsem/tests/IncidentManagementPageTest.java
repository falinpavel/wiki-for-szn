package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.IncidentManagementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncidentManagementPageTest extends TestBase {

    @Test(description = "Проверка заголовка", priority = 1)
    public void verifyIncidentManagementSectionIsDisplayed() {
        driver.get("URL страницы управления инцидентами");
        IncidentManagementPage incidentManagementPage = new IncidentManagementPage();
        Assert.assertTrue(incidentManagementPage.isIncidentManagementSectionDisplayed());
    }

    // Добавьте другие тесты для страницы управления инцидентами при необходимости
}
