package loginTest;

import org.junit.Test;
import parentTest.ParentTest;


//Registration on the site
public class RegistrationTestPageObject extends ParentTest {

    @Test
    public void validRegistration() {
        homePage.openPage();      //Open page
        homePage.clickSignIn();   //Click button "Sing in"
        homePage.enterEmail("qwerty43@gmail.com");   //Registration
        homePage.clickCreateAccount();
        homePage.enterFirestName("Patric");
        homePage.enterLastNAme("Otozh");
        homePage.enterPassword("vanzer11");
        homePage.clickRegistration();

        checkAC("Avatar is not present", homePage.isMyProfilPresent(), true);
    }

}
