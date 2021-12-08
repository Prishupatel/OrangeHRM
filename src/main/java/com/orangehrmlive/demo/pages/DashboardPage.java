package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends Utility {
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardTxt;

    public String verifyDashboard(){
        getTextFromElement(dashBoardTxt);
        return dashBoardTxt.getText();

    }
}
