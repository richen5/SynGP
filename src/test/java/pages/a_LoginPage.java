package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class a_LoginPage extends CommonMethods {

    // object repository

    @FindBy (id="txtUsername")
    public WebElement userNameBox;

    @FindBy (name="txtPassword")
    public WebElement passwordBox;

    @FindBy (id="btnLogin")
    public WebElement loginBtn;

    public a_LoginPage(){
        PageFactory.initElements(driver, this);
    }

}
