package com.bft.trudvsem.tests;

import com.bft.trudvsem.core.TestBase;
import com.bft.trudvsem.pages.QuestionsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuestionsPageTest extends TestBase {

    @Test
    public void verifyQuestionsSectionIsDisplayed() {
        driver.get("URL страницы с вопросами");
        QuestionsPage questionsPage = new QuestionsPage();
        Assert.assertTrue(questionsPage.isQuestionsSectionDisplayed());
    }

    // Добавьте другие тесты для страницы с вопросами при необходимости
}
