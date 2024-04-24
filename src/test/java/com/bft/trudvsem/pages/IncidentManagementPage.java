package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncidentManagementPage extends BasePage {
    @FindBy(xpath = "//div[@class='incident-management']")
    private WebElement incidentManagementSection;

    // Метод для проверки наличия раздела управления инцидентами на странице
    public boolean isIncidentManagementSectionDisplayed() {
        return incidentManagementSection.isDisplayed();
    }
}