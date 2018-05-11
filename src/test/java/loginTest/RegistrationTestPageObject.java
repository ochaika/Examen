package loginTest;

import org.junit.Test;
import parentTest.ParentTest;


//Процесс регистрации на сайте
public class RegistrationTestPageObject extends ParentTest{

    @Test
    public void validRegistration (){
        homePage.openPage();      //Открытие страницы
        homePage.clickSignIn();   //нажатие кнопки SignIn
        homePage.enterEmail("qwerty41@gmail.com");   //Регистрация
        homePage.clickCreateAccount();
        homePage.enterFirestName("Patric");
        homePage.enterLastNAme("Otozh");
        homePage.enterPassword("vanzer11");
        homePage.clickRegistration();
    }
}
