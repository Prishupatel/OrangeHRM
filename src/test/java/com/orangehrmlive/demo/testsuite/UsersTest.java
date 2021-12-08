package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class UsersTest extends TestBase {
    LoginPageTest loginPageTest;
    HomePage homePage;
    AddUserPage addUserPage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUsersPage;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt() {
        homePage = new HomePage();
        loginPageTest = new LoginPageTest();
        addUserPage=new AddUserPage();
        loginPage = new LoginPage();
        viewSystemUsersPage=new ViewSystemUsersPage();
    }

    @Test(groups = {"smoke","regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginDetails();
        homePage.setAdmin();
        viewSystemUsersPage.setSystemUserText();
        addUserPage.clickOnAdd();
        Thread.sleep(2000);
        addUserPage.setAddUserText();
        addUserPage.setUserRole("Admin");
        addUserPage.setEmpName("Ananya Dash");
        Thread.sleep(2000);
        addUserPage.setUsername();
        addUserPage.setStatus("Disabled");
        addUserPage.setPassword("prime@123");
        addUserPage.setConPassword("prime@123");
        addUserPage.setSaveButton();
        Thread.sleep(2000);

    }

    @Test(groups = {"sanity","regression"})
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginDetails();
        homePage.setAdmin();
        viewSystemUsersPage.setSystemUserText();
        viewSystemUsersPage.setUsername("Kishan");
        viewSystemUsersPage.setStatus("Enabled");
        viewSystemUsersPage.setSearchBtn();
        Thread.sleep(2000);

    }

    @Test(groups = {"sanity","regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFull() throws InterruptedException {
        loginDetails();
        homePage.setAdmin();
        viewSystemUsersPage.setSystemUserText();
        viewSystemUsersPage.setUsername("Charlie.Carter");
        viewSystemUsersPage.setUserRoll("ESS");
        viewSystemUsersPage.setStatus("Enabled");
        viewSystemUsersPage.setSearchBtn();
        viewSystemUsersPage.setCheckBox();
        viewSystemUsersPage.setDeleteBtn();
        viewSystemUsersPage.clickOnPopUPOk();


    }

    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginDetails();
        homePage.setAdmin();
        viewSystemUsersPage.setSystemUserText();
        viewSystemUsersPage.setUsername("kishan");
        viewSystemUsersPage.setUserRoll("ESS");
        viewSystemUsersPage.setStatus("Enabled");
        viewSystemUsersPage.setSearchBtn();
        viewSystemUsersPage.verifyNoRecordFound();



    }


    public void loginDetails() throws InterruptedException {
        loginPage.setUsername("Admin");
        Thread.sleep(3000);
        loginPage.setPassword("admin123");
        loginPage.setLoginButton();

    }
}
