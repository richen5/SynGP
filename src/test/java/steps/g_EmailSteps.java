package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import utils.CommonMethods;
import utils.Constants;

import java.io.File;

public class g_EmailSteps extends CommonMethods {

    @When("mailUser enters valid credentials")
    public void mail_user_enters_valid_credentials() {
        sendText(emailPage.loginField, "mailin@i.ua");
        sendText(emailPage.passwordField,"fhrflbz8");
    }

    @When("mailUser clicks on login button")
    public void mail_user_clicks_on_login_button() {
        click(emailPage.enterButton);
    }

    @Then("mailUser user is successfully logged in")
    public void mail_user_user_is_successfully_logged_in() {
        Assert.assertTrue(emailPage.loginConfirmation.isDisplayed());
        System.out.println("Login verified");
    }

    @When("mailUser clicks on create email button")
    public void mail_user_clicks_on_create_email_button() {
        click(emailPage.createEmail);
    }
    @When("mailUser fill out the emailTo field")
    public void mail_user_fill_out_the_email_to_field() {
        sendText(emailPage.emailToField,"mailin@i.ua");
    }
    @When("mailUser fill out the subjectEmail field")
    public void mail_user_fill_out_the_subject_email_field() {
        sendText(emailPage.subjectEmailField,"New Test Email!");
    }

    @When("mailUser fill out the textEmail field")
    public void mail_user_fill_out_the_text_email_field() throws InterruptedException {
        sendText(emailPage.textEmailField,"Hi, nice to meet you;-)");
        Thread.sleep(3000);
    }

    @When("mailUser clicks on sendEmail button")
    public void mail_user_clicks_on_send_email_button() throws InterruptedException {
        click(emailPage.sendEmailButton);
        Thread.sleep(3000);
    }

    @Then("mailUser got emailSent confirmation")
    public void mail_user_got_email_sent_confirmation() {
        String expUserSentEmail = "Лист успішно відправлено адресатам";
        String expWebSendEmail = emailPage.emailSentConfirmation.getText();
        Assert.assertEquals(expUserSentEmail,expWebSendEmail);

        System.out.println("Email sent verified as web: " + expWebSendEmail);
    }

    @When("mailUser clicks on settings button")
    public void mail_user_clicks_on_settings_button() throws InterruptedException {
        click(emailPage.settingsButton);
        Thread.sleep(2000);
    }

    @When("mailUser clicks on exit option")
    public void mail_user_clicks_on_exit_option(){
        click(emailPage.exitOption);
    }

    @When("mailUser exit to start menu")
    public void mail_user_exit_to_start_menu() {
        click(emailPage.startPage);
    }

    @Then("mailUser got emailExit confirmation")
    public void mail_user_got_email_exit_confirmation() {
        String currentUrl = "https://www.i.ua/";
        Assert.assertEquals(currentUrl, driver.getCurrentUrl());
        System.out.println("Exit verified as web: " + driver.getCurrentUrl());


    }

}
