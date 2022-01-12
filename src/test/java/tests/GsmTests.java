package tests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.pages.HomePage;
import com.solvd.pages.SearchField;
import com.solvd.pages.SignInPage;
import com.solvd.pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import services.LogInUtils;
import services.SignUpUtils;
//import services.SearchUtils;
//import services.SignUpUtils;

public class GsmTests implements IAbstractTest, LogInUtils, SignUpUtils {


    @Test
    public void assertWelcomeMessage() {
        SignUpPage signUp = succesfulSignUp(getDriver());
        Assert.assertEquals(signUp.welcomeString(), "Sign Up", "ERROR, NOT THE SAME");
    }

    @Test
    public void loginSuccesful() {
        SignInPage signInPage = succesfulLogin(getDriver());
        Assert.assertEquals(signInPage.userInfo(), " tomasbraino - user account", "NOT THE SAME");
    }

    @Test
    public void validateEmptyEmailLogin() {
        HomePage homePage = emptyEmailLogIn(getDriver());
        Assert.assertEquals(email, "", "The email field is empty");

    }

    @Test
    public void validateEmptyPasswordLogin() {
        emptyPassword(getDriver());
        Assert.assertTrue(true, "The password is empty");
    }

    @Test
    public void validateEmptyEmailSignUp() {
        SignUpPage signUpPage = emptyEmailSignUp(getDriver());
        Assert.assertEquals(signUpPage.getSubmitStatus(), "disable", "The email is empty");
    }

    @Test
    public void validateInvalidEmailSignUp() {
        SignUpPage signUpPage = invalidEmail(getDriver());
        Assert.assertEquals(signUpPage.getSubmitStatus(), "disable", "You must complte all the fields");
    }

    @Test
    public void validateInvalidNameSignUp() {
        SignUpPage signUpPage = emptyNickNameSignUp(getDriver());
        Assert.assertTrue(true, "Nickname invalid");
    }

    /*@DataProvider(name = "brandSearch")
    public Object[] getBrand() {
        return new Object[];
    }*/

    @Test()
    public void validateErrorMessage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.fillSearchField("Samsung");
        homePage.performSearch();
        SearchField searchField = new SearchField(getDriver());
        Assert.assertEquals(searchField.getErrorMesage(), "We're sorry, we found no results", "Are equals");
    }


}
