package com.bft.trudvsem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotfixesPage extends BasePage {
    @FindBy(xpath = "//div[@class='hotfixes']")
    private WebElement hotfixesSection;

    // Метод для проверки наличия раздела с хотфиксами на странице
    public boolean isHotfixesSectionDisplayed() {
        return hotfixesSection.isDisplayed();
    }
}