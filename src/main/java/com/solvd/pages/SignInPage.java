package com.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"body\"]/div/div[1]/div/div/div[2]/div/h1")
    private ExtendedWebElement userInfo;

    @FindBy(xpath = "//*[@id=\"login-active\"]/i")
    private ExtendedWebElement userButton;


    @FindBy(xpath = "//*[@id=\"body\"]/div/div[2]")
    private ExtendedWebElement errorMessage;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickUserButton() {
        userButton.clickIfPresent();
    }

    public String userInfo(){
        return userInfo.getText();
    }






}
