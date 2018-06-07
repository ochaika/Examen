package loginTest;

import org.junit.Test;
import parentTest.ParentTest;


//Registration on the site
public class RegistrationTestPageObject extends ParentTest {

    @Test
    public void validRegistration() {
        homePage.openPage();
        homePage.clickSignIn();
        homePage.clickRegistOneMore();
        homePage.enterEmail("qwerty77@gmail.com");
        homePage.enterPassword("12345678");
        homePage.clickBegin();
        homePage.enterFirstName("Vana");
        homePage.enterLastNAme("Otoze");
        homePage.clickOnbord();
        homePage.enterPhone("675388650");
        homePage.clickContinue();
        homePage.clickDebuging();
        homePage.clickDebugSms();
        homePage.clickCheckbox();




      //  homePage.clickCreateAccount();
//        homePage.enterFirestName("Patric");
//        homePage.enterLastNAme("Otozh");
        //homePage.enterPassword("vanzer11");
       // homePage.clickRegistration();

//        checkAC("Avatar is not present", homePage.isMyProfilPresent(), true);
   }

}
