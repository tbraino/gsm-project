
package services;

import com.solvd.pages.HomePage;
import com.solvd.pages.SignUpPage;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public interface SignUpUtils {


    default SignUpPage goToSignUpPage(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpButton();
        return new SignUpPage(driver);
    }


    default SignUpPage succesfulSignUp(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.newNickName("super new nickname" + new Random().nextInt(222222));
        signUpPage.emailField("titanpalermo@boca");
        signUpPage.fillPassword("muchasgraciaspalermo");
        signUpPage.checkOne();
        signUpPage.checkTwo();
        signUpPage.clickSubmitButton();

        return signUpPage;
    }

    default SignUpPage invalidEmail(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.newNickName("super new nickname" + new Random().nextInt(222222));
        signUpPage.emailField("titanpalermo@boca");
        signUpPage.fillPassword("muchasgraciaspalermo");
        signUpPage.checkOne();
        signUpPage.checkTwo();
        signUpPage.getSubmitStatus();
        return signUpPage;
    }


    default SignUpPage emptyEmailSignUp(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.newNickName("super new nickname" + new Random().nextInt(222222));
        signUpPage.fillPassword("muchasgraciaspalermo");
        signUpPage.checkOne();
        signUpPage.checkTwo();
        signUpPage.getSubmitStatus();
        return signUpPage;
    }

    default SignUpPage emptyNickNameSignUp(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.fillPassword("muchasgraciaspalermo");
        signUpPage.checkOne();
        signUpPage.checkTwo();
        signUpPage.getSubmitStatus();
        return signUpPage;
    }

    default SignUpPage emptyPassword(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.newNickName("super new nickname" + new Random().nextInt(222222));
        signUpPage.emailField("titanpalermo@boca");
        signUpPage.checkOne();
        signUpPage.checkTwo();
        signUpPage.getSubmitStatus();
        return signUpPage;
    }

    default SignUpPage uncheckFirst(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.newNickName("super new nickname" + new Random().nextInt(222222));
        signUpPage.emailField("titanpalermo@boca");
        signUpPage.fillPassword("asdadad");
        signUpPage.checkTwo();
        signUpPage.getSubmitStatus();
        return signUpPage;
    }

    default SignUpPage uncheckSecond(WebDriver driver) {
        SignUpPage signUpPage = goToSignUpPage(driver);
        signUpPage.newNickName("super new nickname" + new Random().nextInt(222222));
        signUpPage.emailField("titanpalermo@boca");
        signUpPage.fillPassword("asdadad");
        signUpPage.checkOne();
        signUpPage.getSubmitStatus();
        return signUpPage;
    }

}

