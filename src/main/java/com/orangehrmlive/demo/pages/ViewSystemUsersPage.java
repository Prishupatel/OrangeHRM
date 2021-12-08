package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='head']//h1")
    WebElement systemUserText;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;
    @FindBy(id = "successBodyEdit")
    WebElement saveNotification;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement username;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoll;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchBtn;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteBtn;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popupOK;
    @FindBy(xpath = "//div[@id='successBodyDelete']")
    WebElement deleteMsg;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecord;


    public void setSystemUserText() {
        Reporter.log("verify System Users" + systemUserText.toString());
        verifyText("System Users", systemUserText, "System Users not displayed");
    }

    public void savedNotification() {
        Reporter.log("verify Successfully Saved" + saveNotification.toString());
        Assert.assertEquals("Successfully Saved", saveNotification, "Successfully Saved not displayed");

    }

    public void setUsername(String usname) {
        Reporter.log("send username" + username.toString());
        sendTextToElement(username, usname);
    }

    public void setUserRoll(String ESS) {
        Reporter.log("select user roll" + userRoll.toString());
        selectByVisibleTextFromDropDown(userRoll, ESS);
    }

    public void setStatus(String stus) {
        Reporter.log("select status" + status.toString());
        selectByVisibleTextFromDropDown(status, stus);
    }

    public void setSearchBtn() {
        Reporter.log("click on search button" + searchBtn.toString());
        clickOnElement(searchBtn);
    }

    public void setCheckBox() {
        Reporter.log("click on checkbox" + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void setDeleteBtn() {
        Reporter.log("click on delete button" + deleteBtn.toString());
        clickOnElement(deleteBtn);
    }

    public void clickOnPopUPOk() {
        Reporter.log("click on popup button" + popupOK.toString());
        clickOnElement(popupOK);
    }

    public void verifyDeleteMsg() {
        Reporter.log("verify Successfully Deleted" + deleteMsg.toString());
        verifyText("Successfully Deleted", deleteMsg, "Successfully Deleted");
    }

    public void verifyNoRecordFound() {
        Reporter.log("verify No Records Found" + noRecord.toString());
        verifyText("No Records Found", noRecord, "No Records Found not found");
    }


}
