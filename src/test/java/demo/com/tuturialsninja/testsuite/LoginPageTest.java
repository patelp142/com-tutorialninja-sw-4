package demo.com.tuturialsninja.testsuite;

import demo.com.tuturialsninja.pages.HomePage;
import demo.com.tuturialsninja.pages.LoginPage;
import demo.com.tuturialsninja.pages.RegisterPage;
import demo.com.tuturialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    RegisterPage registerPage=new RegisterPage();
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        loginPage.enterEmail("prime12345@gmail.com");
        loginPage.enterPassword("test1234");
        loginPage.clickLoginButton();
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Logout");

    }
}
