package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;
import uk.co.library.testdata.TestData;


@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "details", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jTitle, String cityLocation,
                                                           String distance,String minSalary, String maxSalary, String sType, String jobType, String expected)
    {
        SoftAssert softAssert = new SoftAssert();

        // enter job title 'jobTitle'
        homePage.enterJobTitle(jTitle);

        //    enter Location 'location'
        homePage.enterLocation(cityLocation);

        //    select distance 'distance'
        homePage.selectDistance(distance);

        //	click on moreSearchOptionsLink
        homePage.clickOnMoreSearchOptionLink();

        //    enter salaryMin 'salaryMin'
        homePage.enterMinSalary(minSalary);
        //    enter salaryMax 'salaryMax'
        homePage.enterMaxSalary(maxSalary);
        //	select salaryType 'salaryType'
        homePage.selectSalaryType(sType);

        //	select jobType 'jobType'
        homePage.selectJobType(jobType);

        //	click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //	verify the result 'result'
        softAssert.assertEquals(resultPage.verifyTheResults(expected),expected,"Expected text not found");
        softAssert.assertAll();


    }
}
