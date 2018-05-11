package searchTest;

import org.junit.Test;
import parentTest.ParentTest;

//Поиск товара за названием
public class SearchTest extends ParentTest {
    @Test
    public void search (){
        homePage.openPage();
        homePage.clickSignIn();
        authenticationPage.enterEmailAu("omchz@gmail.com");
        authenticationPage.enterPassAu("vanzer11");
        authenticationPage.clickAu();
        searchPage.enterSearch("Printed Summer Dress");    //Ввод названия товара
        searchPage.clickSearch();                       //Клик поиск
    }
}
