package demo.com.tuturialsninja.testsuite;

import demo.com.tuturialsninja.pages.HomePage;
import demo.com.tuturialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        Assert.assertEquals(homePage.getHeadingText(),"Register Account","Navigation is not successful");
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        Assert.assertEquals(homePage.getLoginHeadingText(),"Returning Customer","Navigation is not successful");
    }
}
