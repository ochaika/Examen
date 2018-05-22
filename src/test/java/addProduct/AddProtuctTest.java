package addProduct;

import org.junit.Test;
import parentTest.ParentTest;


//Add product to the cart
public class AddProtuctTest extends ParentTest {
    @Test
    public void addProd() {
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        addProductPage.clickLogotype();  //Click on the Logo
        addProductPage.addProduct();    //Select product for add to the cart
        addProductPage.addToCart();     //Add to the cart
    }
}
