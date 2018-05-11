package changeQuantityTest;

import org.junit.Test;
import parentTest.ParentTest;


//Изменение количества товара в корзине
public class ChangeQuantityTest extends ParentTest {
    @Test
    public void changeQuant() {
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        addProductPage.clickLogotype();   //Выбор товара
        addProductPage.addProduct();
        addProductPage.addToCart();
        changeQuantityPage.clickCart();    //Зайти в корзину
        changeQuantityPage.clickPlus();    //Добавить одну штуку товара
    }
}
