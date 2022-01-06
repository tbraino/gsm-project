package services;

import com.solvd.pages.HomePage;
import com.solvd.pages.SignInPage;
import com.solvd.pages.SignUpPage;
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
        HomePage homePage = new HomePage(driver);
        homePage.fillEmailField(email);
        homePage.fillPasswordField(password);
        homePage.clickSignInButton();
        return new SignInPage(driver);
    }


    default HomePage emptyEmail(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton1();
        homePage.fillPasswordField(password);
        return homePage;

    }

  /*  default HomePage defaultEmail(WebDriver driver) {
        HomePage homePage = new HomePage(driver);

    }

    default HomePage defaultPassword(WebDriver driver) {
        HomePage homePage = new HomePage(driver);

    }


        default HomePage emptyPassword(WebDriver driver) {
            HomePage homePage = new HomePage(driver);
              homePage.clickLoginButton1();
              homePage.fillEmailField(email);
             return homePage;
        }*/


}
