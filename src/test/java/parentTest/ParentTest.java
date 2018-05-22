package parentTest;

import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ParentTest {
    WebDriver webDriver;
    protected HomePage homePage;
    protected AuthenticationPage authenticationPage;
    protected SearchPage searchPage;
    protected AddProductPage addProductPage;
    protected ChangeQuantityPage changeQuantityPage;
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(getClass());

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        homePage = new HomePage(webDriver);
        authenticationPage = new AuthenticationPage(webDriver);
        searchPage = new SearchPage(webDriver);
        addProductPage = new AddProductPage(webDriver);
        changeQuantityPage = new ChangeQuantityPage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    @Step
    protected void checkAC(String message, boolean actual, boolean expected) {
        if (!(actual == expected)) {
            logger.error("AV failed:" + message);
        }
        Assert.assertEquals(message, expected, actual);
    }

}
