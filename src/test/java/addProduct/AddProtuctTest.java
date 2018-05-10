package addProduct;

import org.junit.Test;
import parentTest.ParentTest;

public class AddProtuctTest extends ParentTest {
    @Test
    public void addProd (){
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        addProductPage.clickLogotype();
        addProductPage.addProduct();
        addProductPage.addToCart();
    }
}
