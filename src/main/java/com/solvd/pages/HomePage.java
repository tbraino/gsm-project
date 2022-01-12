package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-active\"]/i")
    private ExtendedWebElement loginButton1;

    @FindBy(xpath = "//*[@id=\"login-popup2\"]")
    private ExtendedWebElement loginDropDown;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "//*[@id=\"upass\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[@id=\"nick-submit\"]")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[8]/i")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//*[@id=\"social-connect\"]/a[8]/i")
    private ExtendedWebElement logOutButton;

    @FindBy(xpath = "//*[@id=\"login-active\"]/i")
    private ExtendedWebElement userButton;

    @FindBy(xpath = "//*[@id=\"topsearch-text\"]")
    private ExtendedWebElement searchField;


    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public void clickLoginButton1() {

        loginButton1.clickIfPresent();
    }

    public SignInPage clickSignInButton() {

        signInButton.clickIfPresent();
        return new SignInPage(driver);
    }

    public void fillEmailField(String email) {
        emailField.type(email);
    }

    public void fillPasswordField(String password) {
        passwordField.type(password);
    }

    public SignUpPage clickSignUpButton() {
        signUpButton.clickIfPresent();
        return new SignUpPage(driver);
    }

    public HomePage clickLogOutButton() {
        logOutButton.clickIfPresent();
        return new HomePage(driver);
    }
    public HomePage clickUserButton() {
        userButton.clickIfPresent();
        return new HomePage(driver);
    }

    public void fillSearchField(String search) {
        searchField.type(search);
    }

    public SearchField performSearch() {
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        return new SearchField(driver);
    }

}
