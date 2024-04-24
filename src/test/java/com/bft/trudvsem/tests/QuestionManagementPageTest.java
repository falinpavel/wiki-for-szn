package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.QuestionManagementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuestionManagementPageTest extends TestBase {

    @Test
    public void verifyQuestionManagementSectionIsDisplayed() {
        driver.get("URL страницы управления вопросами");
        QuestionManagementPage questionManagementPage = new QuestionManagementPage();
        Assert.assertTrue(questionManagementPage.isQuestionManagementSectionDisplayed());
    }

    // Добавьте другие тесты для страницы управления вопросами при необходимости
}
