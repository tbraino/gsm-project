package services;

import com.google.j2objc.annotations.Weak;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.pages.HomePage;
import com.solvd.pages.SearchField;
import com.solvd.pages.SignInPage;
import org.openqa.selenium.WebDriver;

public interface SearchUtils {


    default void search(WebDriver driver, String query){
        SearchField searchField = new SearchField(driver);
        searchField.
    }

}
