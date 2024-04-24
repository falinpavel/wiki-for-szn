package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotfixManagementPage extends BasePage {
    @FindBy(xpath = "//div[@class='hotfix-management']")
    private WebElement hotfixManagementSection;

    // Метод для проверки наличия раздела управления хотфиксами на странице
    public boolean isHotfixManagementSectionDisplayed() {
        return hotfixManagementSection.isDisplayed();
    }
}