package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductPage extends ParentPage {
    @FindBy(xpath = ".//*[@class='logo img-responsive']")
    private WebElement clickLogo;
    @FindBy(xpath = ".//*[contains(text(),'Black blouse with flowers')]")
    private WebElement nameProduct;
    @FindBy(name = "Submit")
    private WebElement cliclAdd;

    public AddProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickLogotype(){
        actionWithOurElements.clickOnElement(clickLogo);
    }
    public void addProduct (){
        actionWithOurElements.clickOnElement(nameProduct);
    }
    public void addToCart(){
        actionWithOurElements.clickOnElement(cliclAdd);
    }

}
