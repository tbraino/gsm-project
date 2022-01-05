package services;

import com.solvd.pages.HomePage;
import com.solvd.pages.LoginPopUp;
import com.solvd.pages.SignInPage;
import org.openqa.selenium.WebDriver;

public interface LogInUtils {
    String email = "tbrainovich@solvd.com";
    String password = "tomasb10";


    default HomePage clickLoginButton(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton1();
        return homePage;
    }

    default SignInPage succesfulLogin(WebDriver driver) {
        HomePage homePage = clickLoginButton(driver);
        LoginPopUp loginPopUp = new LoginPopUp(driver);
        loginPopUp.setEmail(email);
        loginPopUp.setPassword(password);
        loginPopUp.goToLoginPage();
        return new SignInPage(driver);
    }

    default HomePage emptyEmail(WebDriver driver) {
        HomePage homePage = clickLoginButton(driver);
        LoginPopUp loginPopUp = new LoginPopUp(driver);
        loginPopUp.setEmail("");
        loginPopUp.goToLoginPage();
        return loginPopUp.redirect();
    }

    default HomePage emptyPassword(WebDriver driver) {
        HomePage homePage = clickLoginButton(driver);
        LoginPopUp loginPopUp = new LoginPopUp(driver);
        loginPopUp.setPassword("");
        loginPopUp.goToLoginPage();
        return loginPopUp.redirect();
    }


}
