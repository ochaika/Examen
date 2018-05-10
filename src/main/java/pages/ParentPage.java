package pages;

import libs.ActionWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    ActionWithOurElements actionWithOurElements; //обьект для класса ActionWithOurElements
    WebDriver webDriver;

    public ParentPage(WebDriver webDriver) {   //конструктор = на имя класса + Alt INS
        this.webDriver = webDriver;
        actionWithOurElements = new ActionWithOurElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
