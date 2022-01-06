package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"uname\"]")
    private ExtendedWebElement nickNameField;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private ExtendedWebElement email;

    @FindBy(xpath = "//*[@id=\"upass\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[@id=\"frmOpin\"]/fieldset[2]/div[1]/label")
    private ExtendedWebElement switchButton1;

    @FindBy(xpath = "//*[@id=\"frmOpin\"]/fieldset[2]/div[2]/label")
    private ExtendedWebElement switchButton2;

    @FindBy(xpath = "//*[@id=\"nick-submit\"]")
    private ExtendedWebElement submitButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        open();
    }

    public void newNickName(String nickname) {
        nickNameField.type(nickname);

    }
    public void emailField(String email) {
        email.type(email);

    }

    public void fillPassword(String password) {
        passwordField.type(email);

    }

    public HomePage returnHome() {
        return new HomePage(driver);
    }

    public void checkOne() {
        switchButton1.click();
    }

    public void checkTwo() {
        switchButton2.click();
    }

    public void clickSubmitButton() {
        submitButton.clickIfPresent();
    }


}
