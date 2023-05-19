package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class e_AddLanguageSteps extends CommonMethods {

    @When("user clicks on Admin option")
    public void user_clicks_on_admin_option() {
        click(addLanguagePage.adminOption);
    }

    @When("user clicks on Qualifications option")
    public void user_clicks_on_qualifications_option() {
        click(addLanguagePage.qualifyOption);
    }

    @When("user clicks on Languages option")
    public void user_clicks_on_languages_option() {
        click(addLanguagePage.languageOption);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addLanguagePage.addLanguageButton);
    }

    @When("user enters languageName")
    public void user_enters_language_name() {
        sendText(addLanguagePage.languageName,"Floridian");
    }

    @When("user clicks on saveLanguage button")
    public void user_clicks_on_save_language_button() {
        click(addLanguagePage.btnSave);
    }

    @Then("language added successfully")
    public void language_added_successfully() {
        System.out.println("Language Added Successfully!");;

    }
}
