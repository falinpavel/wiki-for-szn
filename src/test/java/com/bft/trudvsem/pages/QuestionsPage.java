package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionsPage extends BasePage {
    @FindBy(xpath = "//div[@class='questions']")
    private WebElement questionsSection;

    // Метод для проверки наличия раздела с вопросами на странице
    public boolean isQuestionsSectionDisplayed() {
        return questionsSection.isDisplayed();
    }
}