package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchField extends AbstractPage {
    WebDriver driver;

    @FindBy(name = "sSearch")
    private ExtendedWebElement sSearch;

    @FindBy(className = "section")
    private ExtendedWebElement errorMessage;

    public SearchField(WebDriver driver) {
        super(driver);
    }

    public String getErrorMesage() {
        return errorMessage.getText();
    }

}
