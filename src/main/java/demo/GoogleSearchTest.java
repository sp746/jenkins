package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GoogleSearchTest extends BaseTest {
    @Test
    public void googleSearchTest() {
        ExtentTest extentTest = test.get();
        driver.get("https://www.google.com");
        extentTest.info("Navigated to Google");

        HomePage homePage = new HomePage(driver);
        homePage.search("best tv");
        extentTest.info("Searched for 'best tv'");

        Assert.assertTrue(driver.getTitle().contains("best tv"));
        extentTest.pass("Test Passed");
    }
}