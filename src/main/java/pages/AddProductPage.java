package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//Add product to cart
public class AddProductPage extends ParentPage {
    @FindBy(xpath = ".//*[@class='logo img-responsive']")
    private WebElement buttonLogo;
    @FindBy(xpath = ".//*[contains(text(),'Black blouse with flowers')]")
    private WebElement nameProduct;
    @FindBy(name = "Submit")
    private WebElement AddButton;

    public AddProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickLogotype() {
        actionWithOurElements.clickOnElement(buttonLogo);
    }

    public void addProduct() {
        actionWithOurElements.clickOnElement(nameProduct);
    }

    public void addToCart() {
        actionWithOurElements.clickOnElement(AddButton);
    }

}
