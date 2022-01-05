package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"uname\"]")
    private WebElement nickName;


    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"upass\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"nick-submit\"]")
    private ExtendedWebElement submitButton;


    public SignUpPage(WebDriver driver) {
        super(driver);
        open();
    }


}
