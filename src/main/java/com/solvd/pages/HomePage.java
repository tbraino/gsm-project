package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    private WebDriver driver;

    @FindBy (xpath = "//*[@id=\"login-active\"]/span")
    private ExtendedWebElement loginButton1;

    @FindBy (xpath = "//*[@id=\"nick-submit\"]")
    private ExtendedWebElement signUpButton;

    @FindBy (xpath = "//*[@id=\"social-connect\"]/a[8]/i")
    private ExtendedWebElement logOutButton;

    @FindBy (xpath = "//*[@id=\"topsearch-text\"]")
    private ExtendedWebElement searchField;


    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public LoginPopUp clickLoginButton1() {

        loginButton1.clickIfPresent();
        return new LoginPopUp(driver);
    }

    public SignUpPage clickSignUpButton(){
        signUpButton.clickIfPresent();
        return new SignUpPage(driver);
    }

    public HomePage clickLogOutButton(){
        logOutButton.clickIfPresent();
        return new HomePage(driver);
    }

    public SearchField clickSearch(){
        searchField.clickIfPresent();
        return new SearchField(driver);
    }

}
