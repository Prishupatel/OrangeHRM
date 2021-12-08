package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagementLink;
    @FindBy(id = "menu_admin_Job")
    WebElement jobsLink;
    @FindBy(id = "menu_admin_Organization")
    WebElement organizationLink;

    public void setUserManagementLink() {

        mouseHoverToElement(userManagementLink);
        clickOnElement(userManagementLink);
    }

    public void setJobsLink() {
        mouseHoverToElement(jobsLink);
        clickOnElement(jobsLink);
    }

    public void setOrganizationLink() {
        mouseHoverToElement(organizationLink);
        clickOnElement(organizationLink);
    }

}
