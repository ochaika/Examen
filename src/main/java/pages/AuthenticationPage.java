package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends ParentPage {
    @FindBy(id = "email")
    private WebElement inputEmailAuth;
    @FindBy(id = "passwd")
    private WebElement inputPassAuth;
    @FindBy(id = "SubmitLogin")
    private WebElement buttonAuth;

    public AuthenticationPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void enterEmailAu(String emailAuth){
        actionWithOurElements.enterTextInToElement(inputEmailAuth, emailAuth);
    }
    public void enterPassAu(String passAuth){
        actionWithOurElements.enterTextInToElement(inputPassAuth, passAuth);
    }
    public void clickAu(){
        actionWithOurElements.clickOnElement(buttonAuth);
    }
}