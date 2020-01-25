package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

import java.awt.print.PageFormat;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btnLogin")
    public WebElement logI_Btn;

    public void navigateToHomePage(){
        SeleniumUtils.click(logI_Btn);
    }

}
