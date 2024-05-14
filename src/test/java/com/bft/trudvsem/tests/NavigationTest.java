package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.HomePage;
import com.bft.trudvsem.pages.HotfixesPage;
import com.bft.trudvsem.pages.IncidentsPage;
import com.bft.trudvsem.pages.QuestionsPage;
import com.bft.trudvsem.pages.IncidentManagementPage;
import com.bft.trudvsem.pages.HotfixManagementPage;
import com.bft.trudvsem.pages.QuestionManagementPage;
//import com.bft.trudvsem.config.AppConfig; - класс конфигурации для приложения, отсюда берутся URL для страниц и настройки ChromeOptions
import org.testng.Assert;
import org.testng.annotations.Test;

/*Тестовый класс для быстрой проверки навигации по всей WiKi, проверяется переход от главной страницы на все имеющиеся*/
public class NavigationTest extends TestBase {
    @Test
    public void navigateToHotfixesPageAndBack() {
        // Открываем главную страницу
        driver.get("URL_главной_страницы");
        HomePage homePage = new HomePage();

        // Переходим на страницу с хотфиксами
        //homePage.clickHotfixesLink(); // МЕТОД НЕ РЕАЛИЗОВАН
        HotfixesPage hotfixesPage = new HotfixesPage();
        Assert.assertTrue(hotfixesPage.isHotfixesSectionDisplayed());

        // Возвращаемся на главную страницу
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "URL_главной_страницы");
    }

    @Test(dependsOnMethods = "navigateToHotfixesPageAndBack") // dependsOnMethods - строгая последовательность выполнения тестов
    public void navigateToIncidentsPageAndBack() {
        // Открываем главную страницу
        driver.get("URL_главной_страницы");
        HomePage homePage = new HomePage();

        // Переходим на страницу с инцидентами
        //homePage.clickIncidentsLink(); // МЕТОД НЕ РЕАЛИЗОВАН
        IncidentsPage incidentsPage = new IncidentsPage();
        Assert.assertTrue(incidentsPage.isIncidentsSectionDisplayed());

        // Возвращаемся на главную страницу
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "URL_главной_страницы");
    }

    @Test(dependsOnMethods = "navigateToIncidentsPageAndBack")
    public void navigateToQuestionsPageAndBack() {
        // Открываем главную страницу
        driver.get("URL_главной_страницы");
        HomePage homePage = new HomePage();

        // Переходим на страницу с вопросами
        //homePage.clickQuestionsLink(); // МЕТОД НЕ РЕАЛИЗОВАН
        QuestionsPage questionsPage = new QuestionsPage();
        Assert.assertTrue(questionsPage.isQuestionsSectionDisplayed());

        // Возвращаемся на главную страницу
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "URL_главной_страницы");
    }

    // Тесты для управления инцидентами, хотфиксами и вопросами.
    // Продолжите добавление тестов для всех остальных страниц

    @Test(dependsOnMethods = "navigateToQuestionsPageAndBack")
    public void navigateToIncidentManagementPageAndBack() {
        driver.get("URL_главной_страницы");
        HomePage homePage = new HomePage();

        //homePage.clickIncidentManagementLink(); // МЕТОД НЕ РЕАЛИЗОВАН
        IncidentManagementPage incidentManagementPage = new IncidentManagementPage();
        Assert.assertTrue(incidentManagementPage.isIncidentManagementSectionDisplayed());

        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "URL_главной_страницы");
    }

    @Test(dependsOnMethods = "navigateToIncidentManagementPageAndBack")
    public void navigateToHotfixManagementPageAndBack() {
        driver.get("URL_главной_страницы");
        HomePage homePage = new HomePage();

        //homePage.clickHotfixManagementLink(); // МЕТОД НЕ РЕАЛИЗОВАН
        HotfixManagementPage hotfixManagementPage = new HotfixManagementPage();
        Assert.assertTrue(hotfixManagementPage.isHotfixManagementSectionDisplayed());

        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "URL_главной_страницы");
    }

    @Test(dependsOnMethods = "navigateToHotfixManagementPageAndBack")
    public void navigateToQuestionManagementPageAndBack() {
        driver.get("URL_главной_страницы");
        HomePage homePage = new HomePage();

        //homePage.clickQuestionManagementLink(); // МЕТОД НЕ РЕАЛИЗОВАН
        QuestionManagementPage questionManagementPage = new QuestionManagementPage();
        Assert.assertTrue(questionManagementPage.isQuestionManagementSectionDisplayed());

        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "URL_главной_страницы");
    }
}
