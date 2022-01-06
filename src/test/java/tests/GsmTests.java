package tests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.pages.HomePage;
import com.solvd.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import services.LogInUtils;
//import services.SearchUtils;
//import services.SignUpUtils;

public class GsmTests implements IAbstractTest, LogInUtils {

/*
    @Test
    public void assertWelcomeMessage(){
        SignUpPage signUp = clickLoginButton(getDriver());
        Assert.assertEquals(signUp.(), "Sign Up", "ERROR, NOT THE SAME");

    }*/

    @Test
    public void loginSuccesful() {
        SignInPage signInPage = succesfulLogin(getDriver());
        Assert.assertEquals(signInPage.userInfo(), " tomasbraino - user account", "NOT THE SAME");
    }


    @Test
    public void validateEmptyEmailLogin() {
        HomePage homePage = emptyEmail(getDriver());
        Assert.assertEquals(email, "", "The email field is empty");

    }

   /* @Test
    public void validateEmptyPasswordLogin() {
        emptyPassword(getDriver());
        Assert.assertTrue(true, "The password is empty");
    }*/


}
