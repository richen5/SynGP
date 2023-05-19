package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

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
        sendText(addLanguagePage.languageNameField, "Kykyev");
    }

    @When("user clicks on saveLanguage button")
    public void user_clicks_on_save_language_button() {
        click(addLanguagePage.btnSave);
    }

    @Then("language added successfully")
    public void language_added_successfully() {
        System.out.println("Language Added Successfully!");
        ;
    }

    @When("user enters {string}")
    public void user_enters(String languageNameValue) {
        sendText(addLanguagePage.languageNameField, languageNameValue);
    }

    @When("user provides {string}")
    public void user_provides(String languageName) {
        sendText(addLanguagePage.languageNameField, languageName);
    }

    @When("user provides multiple languages data and verify they are added")
    public void user_provides_multiple_languages_data_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String,String>> languageList = dataTable.asMaps();

        for (Map<String, String> language : languageList) {
            System.out.println(language);
            String languageNameValue = language.get("languageName");
            System.out.println(languageNameValue + " ");

            sendText(addLanguagePage.languageNameField, languageNameValue);

            click(addLanguagePage.btnSave);
            Thread.sleep(2000);
            click(addLanguagePage.addLanguageButton);
        }

    }
}


