package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void verifyHomePageTitle() {
        driver.get("URL главной страницы");
        HomePage homePage = new HomePage();
        Assert.assertEquals(driver.getTitle(), "Ожидаемый заголовок главной страницы");
    }

    // Добавьте другие тесты для главной страницы при необходимости
}
