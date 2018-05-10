package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class RegistrationTestPageObject extends ParentTest{

    @Test
    public void validRegistration (){
        homePage.openPage();
        homePage.clickSignIn();
        homePage.enterEmail("qwerty41@gmail.com");
        homePage.clickCreateAccount();
        homePage.enterFirestName("Patric");
        homePage.enterLastNAme("Otozh");
        homePage.enterPassword("vanzer11");
        homePage.clickRegistration();
    }
}
