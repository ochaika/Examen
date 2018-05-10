package searchTest;

import org.junit.Test;
import parentTest.ParentTest;

public class SearchTest extends ParentTest {
    @Test
    public void search (){
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        searchPage.enterSearch("Printed Summer Dress");
        searchPage.clickSearch();
    }
}
