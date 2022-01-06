package tests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import services.LogInUtils;
//import services.SearchUtils;
//import services.SignUpUtils;

public class GsmTests implements IAbstractTest, LogInUtils {


    @Test
    public void goToLogInButton(){
        HomePage homePage = clickLoginButton(getDriver());

    }


   /* @Test
    public void validateEmptyEmailLogin() {
        HomePage homePage = emptyEmail(getDriver());
        Assert.assertEquals(,"","The email field is empty");


    }*/

   /* @Test
    public void validateEmptyPasswordLogin() {
        emptyPassword(getDriver());
        Assert.assertTrue(true, "The password is empty");
    }*/


}
