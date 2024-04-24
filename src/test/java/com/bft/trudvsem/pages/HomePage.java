package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[contains(@href, 'hotfixes')]")
    private WebElement hotfixesLink;

    @FindBy(xpath = "//a[contains(@href, 'incidents')]")
    private WebElement incidentsLink;

    @FindBy(xpath = "//a[contains(@href, 'questions')]")
    private WebElement questionsLink;

    // Методы для взаимодействия с элементами страницы
    public void goToHotfixesPage() {
        hotfixesLink.click();
    }

    public void goToIncidentsPage() {
        incidentsLink.click();
    }

    public void goToQuestionsPage() {
        questionsLink.click();
    }
}