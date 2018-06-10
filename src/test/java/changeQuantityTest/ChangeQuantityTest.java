package changeQuantityTest;

import org.junit.Test;
import parentTest.ParentTest;


//Change quantity product in the cart
public class ChangeQuantityTest extends ParentTest {
    @Test
    public void changeQuant() {
        bookingPage.openPage();
        bookingPage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        addProductPage.clickLogotype();   //Select product
        addProductPage.addProduct();
        addProductPage.addToCart();
        changeQuantityPage.clickCart();    //Open the cartу
        changeQuantityPage.clickPlus();    //Add one more the product
    }
}
