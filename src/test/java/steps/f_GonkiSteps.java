package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import utils.CommonMethods;

public class f_GonkiSteps extends CommonMethods {

    @When("on website clicks on fastStart button")
    public void on_website_clicks_on_fastStart_button() {
        click(gonkiPage.fastStart);
        click(gonkiPage.closeTelegramLink);
    }

    @When("clicks on random text option")
    public void clicks_on_random_text_option() {
        click(gonkiPage.quickRace);
    }


    @Then("waiting for green light to race start")
    public void waiting_for_green_light_to_race_start() {
        click(gonkiPage.highlightWord);
    }


    @Then("starting type the lighting words in cycle")
    public void starting_type_the_lighting_words_in_cycle() {

        while (true){
            String currentWord = gonkiPage.highlightWord.getText();
            String afterFocusSymbol = gonkiPage.afterFocus.getText();
            sendText(gonkiPage.inputField, (currentWord));
            if (afterFocusSymbol.equals("."));{
                sendText(gonkiPage.inputField,".");
            }
            break;
        }
        sendText(gonkiPage.inputField," ");
    }

    @Then("finishing the game with expected result")
    public void bot_finishing_the_game_with_expected_result() {
        System.out.println("Good");
    }


}
