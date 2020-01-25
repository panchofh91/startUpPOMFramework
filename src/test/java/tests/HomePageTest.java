package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeDashboardPage;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;
    EmployeeDashboardPage employeeDashboardPage;


    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HomePage();
        employeeDashboardPage = new EmployeeDashboardPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void verifyHomeTitle(){
        SeleniumUtils.waitForVisibilityOfElement(homePage.logI_Btn);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test
    public void testLogInBtn(){
        SeleniumUtils.click(homePage.logI_Btn);
        String expectedTitle = "Dashboard";
        Assert.assertEquals(SeleniumUtils.getText(employeeDashboardPage.dashboardTitle), expectedTitle);
    }


}
