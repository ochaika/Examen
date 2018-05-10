package changeQuantityTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ChangeQuantityTest extends ParentTest {
    @Test
    public void changeQuant() {
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        addProductPage.clickLogotype();
        addProductPage.addProduct();
        addProductPage.addToCart();
        changeQuantityPage.clickCart();
        changeQuantityPage.clickPlus();

    }
}
