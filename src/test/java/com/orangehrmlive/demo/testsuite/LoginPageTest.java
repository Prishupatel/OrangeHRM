package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true ,groups = {"sanity","smoke","regression"})
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyUserShouldLoginSuccessFully() throws InterruptedException {
        loginDetails();
        loginPage.setVerifyPanel();
    }

    @Test
    public void VerifyThatTheLogoDisplayOnHomePage() throws InterruptedException {
        loginDetails();
        loginPage.setVerifyLogo();

    }
    @Test
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {
        loginDetails();
        loginPage.setClickWelcome();
        loginPage.setClickLogout();


    }
    public void loginDetails() throws InterruptedException {
        loginPage.setUsername("Admin");
        Thread.sleep(3000);
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();

    }


}
