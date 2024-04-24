package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionManagementPage extends BasePage {
    @FindBy(xpath = "//div[@class='question-management']")
    private WebElement questionManagementSection;

    // Метод для проверки наличия раздела управления вопросами на странице
    public boolean isQuestionManagementSectionDisplayed() {
        return questionManagementSection.isDisplayed();
    }
}