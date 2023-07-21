package uk.co.library.testdata;


import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "details")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow, Greater London","5","30000","500000","Per annum",
                        "Permanent","Permanent Tester jobs in Harrow"},
                {"Developer","London","10","2000","4000","Per month",
                        "Contract","Contract Developer jobs in London"},
                {"Business Analyst","Coventry","2","200","400","Per week",
                        "Part Time","Part Time Business Analyst jobs in Coventry"},
                {"Project Manager","Manchester","1","30","40","Per hour","Permanent","Permanent Project Manager jobs in Manchester"},
                {"Sales Executive","Leeds","25","300","400","Per day","Apprenticeship","Apprenticeship Sales Executive jobs in Leeds"},
                {"Sales Assistant","Bradford","7","300","400","Per annum","Temporary","Temporary Sales Assistant jobs in Bradford"},
        };
        return data;
    }

}
