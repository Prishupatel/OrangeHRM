package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//a[contains(text(),'Welcome Paul')]")
    WebElement verifyWelcome;
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement verifyLogo;
    @FindBy(id = "welcome")
    WebElement clickOnWelcome;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement clickOnLogout;


    public void setUsername(String name) {
        Reporter.log("Entering username :" + username + " in the usernameField :" + username.toString() + "<br>");
        sendTextToElement(username, name);
    }

    public void setPassword(String psw) {
        Reporter.log("Entering password :" + password + " in the passwordField :" + password.toString() + "<br>");
        sendTextToElement(password, psw);
    }

    public void setLoginButton() {
        Reporter.log("click on login button" + username.toString());
        clickOnElement(loginButton);
    }

    public void setVerifyPanel() {
        Reporter.log("verify Welcome Paul" + verifyWelcome.toString());
        verifyText("Welcome Paul", verifyWelcome, "Welcome sra not displayed");

    }

    public void setVerifyLogo() {

        Boolean logoPresent = verifyLogo.isDisplayed();
        Assert.assertTrue(logoPresent, "Logo Present");


    }

    public void setClickWelcome() {
        Reporter.log("click on welcome" + clickOnWelcome.toString());
        clickOnElement(clickOnWelcome);
    }

    public void setClickLogout() {
        Reporter.log("click on logout" + clickOnLogout.toString());
        mouseHoverToElementAndClick(clickOnLogout);
    }


}
