package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.By.*;

public class HomePage extends ParentPage{
   @FindBy(xpath = ".//*[@class='login']")
  private WebElement buttonSignIn;
    @FindBy(id = "email_create")
    private WebElement inputElement;
    @FindBy(id = "SubmitCreate")
    private WebElement buttonCreat;
    @FindBy(id = "customer_firstname")
    private WebElement inputFirstName;
    @FindBy(id = "customer_lastname")
    private WebElement inputLastName;
    @FindBy(id = "passwd")
    private WebElement inputPassword;
    @FindBy(id = "submitAccount")
    private WebElement clickRegistr;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get("http://prestashop.qatestlab.com.ua/en/");
            logger.info("HomePage was opened");
        } catch (Exception e) {
            logger.error("Can not open HomePage");
            Assert.fail("Can not open HomePage");
        }
    }
    public void clickSignIn(){
        actionWithOurElements.clickOnElement(buttonSignIn);
    }
    public void enterEmail(String email){
        actionWithOurElements.enterTextInToElement(inputElement, email);
    }
    public void clickCreateAccount(){
        actionWithOurElements.clickOnElement(buttonCreat);
    }
    public void enterFirestName(String firstName){
        actionWithOurElements.enterTextInToElement(inputFirstName, firstName);
    }
    public void enterLastNAme(String lastName){
        actionWithOurElements.enterTextInToElement(inputLastName, lastName);
    }
    public void enterPassword(String pasword){
        actionWithOurElements.enterTextInToElement(inputPassword, pasword);
    }
    public void clickRegistration(){
        actionWithOurElements.clickOnElement(clickRegistr);
    }
}