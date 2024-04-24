package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncidentsPage extends BasePage {
    @FindBy(xpath = "//div[@class='incidents']")
    private WebElement incidentsSection;

    // Метод для проверки наличия раздела с инцидентами на странице
    public boolean isIncidentsSectionDisplayed() {
        return incidentsSection.isDisplayed();
    }
}
