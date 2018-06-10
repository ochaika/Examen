package bookingTest;

import org.junit.Test;
import parentTest.ParentTest;



public class BookingTest extends ParentTest {

    @Test
    public void validRegistration() {
        bookingPage.openPage();
        bookingPage.clickSignIn();
        bookingPage.enterEmail("Fgh345@gmail.com");
        bookingPage.enterPassword("09876543");
        bookingPage.clickBegin();
//        bookingPage.clickKrest();
//        bookingPage.clickAccount();
//        bookingPage.clickNalashtuvania();
//        bookingPage.enterNumberPhone("675388650");
        bookingPage.enterFirstName("arra");
      bookingPage.enterLastNAme("Loterty");
        bookingPage.clickOnbord();
        bookingPage.enterPhone("675488651");
       bookingPage.clickContinue();
        bookingPage.clickDebuging();
        bookingPage.clickDebugSms();
       //bookingPage.clickCheckbox();
    }
}
