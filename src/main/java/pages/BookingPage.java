package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static org.openqa.selenium.By.*;

public class BookingPage extends ParentPage {
    @FindBy(xpath = "//*[@id='current_account_create']")
    private WebElement buttonSignIn;
    @FindBy(css = "#b2indexPage > div.modal-wrapper.user-access-menu-lightbox.user-access-menu-lightbox--user-center > div.js-user-access-menu-lightbox.user-access-menu-lightbox--no-password-strength.user-access-menu-lightbox--signup > div > div.user_access_signup_menu.form-section.user_access_menu__password--compact.form-shown-section > form.user_access_form.user_access_form_signup.js-user-access-form--signup.form-subsection > label.bootstrapped-label.user_access_email_section > input")
    private WebElement inputElement;
    @FindBy(xpath = "//*[@id='password']")
    private WebElement inputPassword;
   @FindBy(css = "#b2indexPage > div.modal-wrapper.user-access-menu-lightbox.user-access-menu-lightbox--user-center > div.js-user-access-menu-lightbox.user-access-menu-lightbox--no-password-strength.user-access-menu-lightbox--signup > div > div.user_access_signup_menu.form-section.user_access_menu__password--compact.form-shown-section > form.user_access_form.user_access_form_signup.js-user-access-form--signup.form-subsection > input.bootstrapped-input.btn.btn-primary")
    private WebElement buttonBegin;

   @FindBy(css = "#b2indexPage > div.modal-wrapper.wl252-modal-wrapper--styled > button")
   private WebElement buttonKrest;
   @FindBy(css = "#current_account > a")
   private WebElement buttonAccount;
   @FindBy(css = "#b2indexPage > div.fly-dropdown.fly-dropdown--profile-menu.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.profile-menu__item.profile_menu__item--mysettings > a")
   private WebElement buttonNalashtuvania;
   @FindBy(css = "#when-you-book > div.settings-content > div > div:nth-child(4) > div.settings-item__content.ClickTaleSensitive > div > div.settings-input__input > input")
   private WebElement inputNumberPhone;

    @FindBy(css = "#wl252-firstname")
    private WebElement inputFirstName;
    @FindBy(css = "#wl252-lastname")
    private WebElement inputLastName;
    @FindBy(css = "#wl252-onboard-name > div.wl252-modal__footer > button")
    private WebElement buttonOnbord;
    @FindBy(css = "#gta-sms-sms-widget_footer_sms_button > input")
    private WebElement inputPhone;
    @FindBy(css = "#wl252-onboard-stars > div.wl252-modal__footer > button")
    private WebElement buttonContinue;
    @FindBy(css = "#wl252-modal-done > div > div.wl252-modal__footer > a.wl252-btn.wl252-btn-mysettings")
    private WebElement debuging;

    @FindBy(css = "#formwrap > div.settings-navbar > div > ul > li:nth-child(7) > a > span")
    private WebElement debugsms;
    @FindBy(css = "#sms-subscriptions > div.settings-wrapper.sms-subscription-preferences > div > div > div > div.sms-subscription-settings-wrapper > label > span.settings-checkbox__box > input[type=\"checkbox\"]")
    private WebElement checkbox;


    public BookingPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get("https://www.booking.com/index.uk.html");
            logger.info("BookingPage was opened");
        } catch (Exception e) {
            logger.error("Can not open BookingPage");
            Assert.fail("Can not open BookingPage");
        }
    }
    public void clickSignIn() {
        actionWithOurElements.clickOnElement(buttonSignIn);
    }

    public void enterEmail(String email) {
        actionWithOurElements.enterTextInToElement(inputElement, email);
    }
    public void enterPassword(String password) {
        actionWithOurElements.enterTextInToElement(inputPassword, password);
    }

    public void clickBegin() {actionWithOurElements.clickOnElement(buttonBegin);}


    public void clickKrest(){actionWithOurElements.clickOnElement(buttonKrest);}
    public void clickAccount(){actionWithOurElements.clickOnElement(buttonAccount);}
    public void clickNalashtuvania(){actionWithOurElements.clickOnElement(buttonNalashtuvania);}
    public void enterNumberPhone(String phone){actionWithOurElements.enterTextInToElement(inputNumberPhone,phone);}





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

}