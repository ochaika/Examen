package bookingTest;

import libs.ConfigProperties;
import libs.ExcelDriver;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;
import parentTest.ParentTest;

import java.util.Map;


public class BookingTestExcell extends ParentTest {

    @Test
    public void BookingRegistration() throws Exception {
        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForBookingRegistration = excelDriver.getData(configProperties.DATA_FILE(), "BookingRegistration");

        bookingPage.openPage();
        bookingPage.clickSignIn();
        bookingPage.enterEmail(dataForBookingRegistration.get("Email").toString());
        bookingPage.enterPassword(dataForBookingRegistration.get("Password").toString());
        bookingPage.clickBegin();
//        bookingPage.clickKrest();
//        bookingPage.clickAccount();
//        bookingPage.clickNalashtuvania();
       // bookingPage.enterNumberPhone(dataForBookingRegistration.get("Phone").toString());
        bookingPage.enterFirstName(dataForBookingRegistration.get("Firstname").toString());
        bookingPage.enterLastNAme(dataForBookingRegistration.get("Lastname").toString());
        bookingPage.clickOnbord();
        bookingPage.enterPhone(dataForBookingRegistration.get("Phone").toString());
        bookingPage.clickContinue();
        bookingPage.clickDebuging();
        bookingPage.clickDebugSms();
        bookingPage.clickCheckbox();
    }
}
