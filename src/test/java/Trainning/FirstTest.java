package Trainning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    private ChromeDriver driver;

    @Test
    public void testEasy(){
        driver.get("https://testautomationu.applitools.com/");
        driver.manage().window().minimize();

        String title = driver.getTitle();
        AssertJUnit.assertEquals("Test Automation University | Applitools", title);
    }

    @Test
    public void TestTwo(){
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();

        String title1 = driver.getTitle();
        System.out.println("title is "+title1);
        AssertJUnit.assertEquals("Google", title1);
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
