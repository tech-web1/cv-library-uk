package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;



    public void enterJobTitle(String jTitle){
        sendTextToElement(jobTitle,jTitle);

    }

    public void enterLocation(String cityLocation) {
        sendTextToElement(location , cityLocation);

    }
    public void selectDistance(String distance){
        selectByValueFromDropDown(distanceDropDown, distance);

    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);

    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);

    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }
}
