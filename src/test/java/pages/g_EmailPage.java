package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class g_EmailPage extends CommonMethods {


    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input")
    public WebElement loginField;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/input")
    public WebElement passwordField;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")
    public WebElement enterButton;

    @FindBy (xpath = "/html/body/div[1]/div[6]/div[1]/div[1]/p/a")
    public WebElement loginConfirmation;

    @FindBy(xpath = "/html/body/div[1]/div[5]/ul/li[2]/a")
    public WebElement createEmail;

    @FindBy(id = "to")
    public WebElement emailToField;

    @FindBy(xpath = "/html/body/div[4]/div[6]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")
    public WebElement subjectEmailField;

    @FindBy(id = "text")
    public WebElement textEmailField;

    @FindBy(xpath = "/html/body/div[4]/div[6]/div[1]/div[1]/p[1]/input[1]")
    public WebElement sendEmailButton;

    @FindBy(xpath = "/html/body/div[1]/div[6]/div[2]/div/div/div[1]/div/div[5]")
    public WebElement emailSentConfirmation;

    @FindBy(xpath = "//*[@id=\"header_overall\"]/div[1]/ul[3]/li[4]")
    public WebElement settingsButton;

    @FindBy(xpath = "//*[@id=\"accountSettingsPopup\"]/ul/li[7]/a")
    public WebElement exitOption;

    @FindBy (xpath = "/html/body/div[3]/div[3]/div[3]/div[1]/div[1]/a")
    public WebElement startPage;

    public g_EmailPage(){
        PageFactory.initElements(driver,this);
    }


}
