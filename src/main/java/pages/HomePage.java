package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.*;

public class HomePage extends ParentPage {
//    @FindBy(xpath = "//h1[@class='page-heading']")
//    private WebElement myprofil;
    @FindBy(xpath = "//*[@id=\"b_tt_holder_1\"]/div/span")
    private WebElement buttonSignIn;
    @FindBy(xpath = "//*[@id=\"b2indexPage\"]/div[16]/div[1]/div/div[1]/div[2]")
    private WebElement buttonRegistration;
    @FindBy(xpath = "//*[@id=\"b2indexPage\"]/div[16]/div[1]/div/div[4]/form[1]/label[1]/input")
    private WebElement inputElement;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[@id=\"b2indexPage\"]/div[16]/div[1]/div/div[4]/form[1]/input[12]")
    private WebElement buttonBegin;
    @FindBy(xpath = "//*[@id=\"wl252-firstname\"]")
    private WebElement inputFirstName;
    @FindBy(id = "//*[@id=\"wl252-lastname\"]")
    private WebElement inputLastName;
    @FindBy(xpath = "//*[@id=\"wl252-onboard-name\"]/div[2]/button")
    private WebElement buttonOnbord;
    @FindBy(xpath = "//*[@id=\"gta-sms-sms-widget_footer_sms_button\"]/input")
    private WebElement inputPhone;
    @FindBy(xpath = "//*[@id=\"wl252-onboard-stars\"]/div[2]/button")
    private WebElement buttonContinue;
    @FindBy(xpath = "//*[@id=\"wl252-modal-done\"]/div/div[3]/a[1]")
    private WebElement debuging;
    @FindBy(xpath = "//*[@id=\"formwrap\"]/div[1]/div/ul/li[7]/a/span")
    private WebElement debugsms;
    @FindBy(xpath = "//*[@id=\"sms-subscriptions\"]/div[2]/div/div/div/div[2]/label/span[1]/input")
    private WebElement checkbox;


//    @FindBy(id = "SubmitCreate")
//    private WebElement buttonCreat;
//    @FindBy(id = "customer_firstname")
//    private WebElement inputFName;
//    @FindBy(id = "customer_lastname")
//    private WebElement inputLastName;
//    @FindBy(id = "passwd")
//    private WebElement inputPassword;
//    @FindBy(id = "submitAccount")
//    private WebElement clickRegistr;
//    @FindBy(id = "//h1[@class='page-heading']")
//    private WebElement myprofil;


    //Registration on the site

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get("https://www.booking.com/index.uk.html");
            logger.info("HomePage was opened");
        } catch (Exception e) {
            logger.error("Can not open HomePage");
            Assert.fail("Can not open HomePage");
        }
    }


    public void clickSignIn() {
        actionWithOurElements.clickOnElement(buttonSignIn);
    }

    public void clickRegistOneMore() {
        actionWithOurElements.clickOnElement(buttonRegistration);
    }

    public void enterEmail(String email) {
        actionWithOurElements.enterTextInToElement(inputElement, email);
    }

    public void enterPassword(String password) {
        actionWithOurElements.enterTextInToElement(inputPassword, password);
    }

    public void clickBegin() {actionWithOurElements.clickOnElement(buttonBegin);}

    public void enterFirstName(String firstname) {actionWithOurElements.enterTextInToElement(inputFirstName, firstname);}

    public void enterLastNAme(String lastName) {
        actionWithOurElements.enterTextInToElement(inputLastName, lastName);
    }

    public void clickOnbord(){actionWithOurElements.clickOnElement(buttonOnbord);}

    public void enterPhone(String phone) {actionWithOurElements.enterTextInToElement(inputPhone, phone);}

    public void clickContinue(){actionWithOurElements.clickOnElement(buttonContinue);}

    public void clickDebuging(){actionWithOurElements.clickOnElement(debuging);}

    public void clickDebugSms(){actionWithOurElements.clickOnElement(debugsms);}

    public void clickCheckbox(){actionWithOurElements.clickOnElement(checkbox);}





//    public void clickCreateAccount() {
//        actionWithOurElements.clickOnElement(buttonCreat);
//    }

//    public void enterFirestName(String firstName) {
//        actionWithOurElements.enterTextInToElement(inputFirstName, firstName);
//    }

//    public void enterLastNAme(String lastName) {
//        actionWithOurElements.enterTextInToElement(inputLastName, lastName);
//    }

//    public void enterPassword(String password) {
//        actionWithOurElements.enterTextInToElement(inputPassword, password);
//    }

//    public void clickRegistration() {
//        actionWithOurElements.clickOnElement(clickRegistr);
//    }
//
//    public boolean isMyProfilPresent() {
//        return actionWithOurElements.isElementPresent(myprofil);
//    }
}