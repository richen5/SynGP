package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class e_AddLanguagePage extends CommonMethods {

    @FindBy (id = "menu_admin_viewAdminModule")
    public WebElement adminOption;

    @FindBy (id = "menu_admin_Qualifications")
    public WebElement qualifyOption;

    @FindBy (id = "menu_admin_viewLanguages")
    public WebElement languageOption;

    @FindBy (id = "btnAdd")
    public WebElement addLanguageButton;

    @FindBy (id = "language_name")
    public WebElement languageName;

    @FindBy (id = "btnSave")
    public WebElement btnSave;

    public e_AddLanguagePage(){
        PageFactory.initElements(driver,this);
    }


}
