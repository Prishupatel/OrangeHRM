package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRole;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement empName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement username;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement conPassword;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    public void clickOnAdd(){
        Reporter.log("click on Add button" +addButton.toString());
        clickOnElement(addButton);
    }
    public void setAddUserText(){
        Reporter.log("verify Add User" +addUserText.toString());
        verifyText("Add User",addUserText,"Add User");
    }
    public void setUserRole(String role){
        Reporter.log("Select User role" +addUserText.toString());
        selectByVisibleTextFromDropDown(userRole,role);
    }
    public void setEmpName(String name){
        Reporter.log("Send Username" +empName.toString());

        sendTextToElement(empName,name);
    }
    public void setUsername(){
        Reporter.log("send username" +username.toString());

        randomUserName(username);
    }
    public void setStatus(String sta){
        Reporter.log("Send status" +status.toString());

        selectByVisibleTextFromDropDown(status,sta);
    }
    public void setPassword(String pass){
        Reporter.log("send password" +password.toString());

        sendTextToElement(password,pass);
    }
    public void setConPassword(String conPass){
        Reporter.log("send confirm password" +conPassword.toString());

        sendTextToElement(conPassword,conPass);
    }
    public void setSaveButton(){
        Reporter.log("click on" +saveButton.toString());

        clickOnElement(saveButton);
    }
}
