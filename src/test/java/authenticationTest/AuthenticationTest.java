package authenticationTest;

import org.junit.Test;
import parentTest.ParentTest;


//Autorisation on the site
public class AuthenticationTest extends ParentTest {

    @Test
    public void validAuthentication() {
        bookingPage.openPage();
        bookingPage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
    }
}
