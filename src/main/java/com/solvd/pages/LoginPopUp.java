package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopUp extends AbstractPage {
    WebDriver driver;


    @FindBy(id = "login-popup2")
    private ExtendedWebElement loginPopUp;

    @FindBy(id = "email")
    private ExtendedWebElement emailField;

    @FindBy(id = "upass")
    private ExtendedWebElement upass;

    @FindBy(id = "nick-submit")
    private ExtendedWebElement submitButton;

    public LoginPopUp(WebDriver driver) {
        super(driver);
        open();
    }


    public void setEmail(String email) {
        emailField.type(email);
    }

    public void setPassword(String password) {
        upass.type(password);
    }

    public SignInPage goToLoginPage() {
        submitButton.clickIfPresent();
        return new SignInPage(driver);
    }

    public HomePage redirect(){
        return new HomePage(driver);
    }

}
