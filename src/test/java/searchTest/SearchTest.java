package searchTest;

import org.junit.Test;
import parentTest.ParentTest;

//Search product by name
public class SearchTest extends ParentTest {
    @Test
    public void search() {
        bookingPage.openPage();
        bookingPage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        searchPage.enterSearch("Printed Summer Dress");    //Input the name of product
        searchPage.clickSearch();                       //Click Search
    }
}
