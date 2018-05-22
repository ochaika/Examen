package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//Search product by name
public class SearchPage extends ParentPage {
    @FindBy(id = "search_query_top")
    private WebElement inputtext;
    @FindBy(name = "submit_search")
    private WebElement clickSe;

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterSearch(String text) {
        actionWithOurElements.enterTextInToElement(inputtext, text);
    }

    public void clickSearch() {
        actionWithOurElements.clickOnElement(clickSe);
    }
}
