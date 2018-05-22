package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//Change quantity product in the cart
public class ChangeQuantityPage extends ParentPage {
    @FindBy(xpath = ".//*[@class = 'shopping_cart']")
    private WebElement clickCart;
    @FindBy(name = "icon-plus")
    private WebElement clickPl;

    public ChangeQuantityPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCart() {
        actionWithOurElements.clickOnElement(clickCart);
    }

    public void clickPlus() {
        actionWithOurElements.clickOnElement(clickPl);
    }
}
