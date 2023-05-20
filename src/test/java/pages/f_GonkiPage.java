package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class f_GonkiPage extends CommonMethods {

    @FindBy(id = "startbutton")
    public WebElement fastStart;

    @FindBy (xpath = "//*[@id=\"follow-me-app\"]/div[2]/div[3]")
    public WebElement closeTelegramLink;

    @FindBy (xpath = "//*[@id=\"quickrace\"]/div[1]/div[2]/div/div/div[1]/h4/a")
    public WebElement quickRace;


    @FindBy (xpath = "//*[@id=\"startimer\"]/span[4]")
    public WebElement highlightWord;

    @FindBy (xpath = "//*[@id=\"editor\"]/div[3]/form/input[1]")
    public WebElement inputField;

    @FindBy (xpath = "/html/body/div[2]/div[5]/div[1]/div/p[2]")
    public WebElement afterFocus;


    public f_GonkiPage(){
        PageFactory.initElements(driver,this);
    }

}
