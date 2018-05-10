package parentTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    protected HomePage homePage;
    protected AuthenticationPage authenticationPage;
    protected SearchPage searchPage;
    protected AddProductPage addProductPage;
    protected ChangeQuantityPage changeQuantityPage;

    @Before
    public void setUp(){
        File file = new File ("./src/drivers/chromedriver.exe");
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
    public void tearDown(){webDriver.quit(); }

}
