package addProduct;

import org.junit.Test;
import parentTest.ParentTest;


//Добавить изделие в корзину
public class AddProtuctTest extends ParentTest {
    @Test
    public void addProd (){
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        addProductPage.clickLogotype();  //Клик на логотип чтобы выйти на главную страницу
        addProductPage.addProduct();    //выбор изделия для занесения в корзину
        addProductPage.addToCart();     //Добавить в корзину
    }
}
