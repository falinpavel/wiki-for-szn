package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.HomePage;
import com.bft.trudvsem.pages.QuestionsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test(description = "Проверка заголовка", priority = 1)
    public void verifyHomePageTitle() {
        driver.get("URL главной страницы");
        HomePage homePage = new HomePage();
        Assert.assertEquals(driver.getTitle(), "Ожидаемый заголовок главной страницы");
    }
}
