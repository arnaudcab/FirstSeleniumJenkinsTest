package Trainning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    private ChromeDriver driver;

    @Test
    public void TestAutomationUniversitySite_Title(){
        driver.get("https://testautomationu.applitools.com/");
        driver.manage().window().minimize();

        String title = driver.getTitle();
        AssertJUnit.assertEquals("Test Automation University | Applitools", title);
    }

    @Test
    public void TestGoogleSite_Title(){
        driver.get("https://www.google.co.uk/");
        //driver.manage().window().maximize();
        AssertJUnit.assertEquals("Google", driver.getTitle());
    }

    @Test
    public void TestFeedlySite_Title(){
        driver.get("https://feedly.com/");
        //driver.manage().window().maximize();
        AssertJUnit.assertEquals("FeedlyWITHTYPO", driver.getTitle());
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
