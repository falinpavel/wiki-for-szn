package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.IncidentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncidentsPageTest extends TestBase {

    @Test
    public void verifyIncidentsSectionIsDisplayed() {
        driver.get("URL страницы с инцидентами");
        IncidentsPage incidentsPage = new IncidentsPage();
        Assert.assertTrue(incidentsPage.isIncidentsSectionDisplayed());
    }

    // Добавьте другие тесты для страницы с инцидентами при необходимости
}
