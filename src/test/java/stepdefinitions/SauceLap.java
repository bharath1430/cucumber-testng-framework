package stepdefinitions;

import io.cucumber.java.en.*;
import pages.SaucePage;
import utils.ConfigReader;


public class SauceLap {

	SaucePage page = new SaucePage();

    @Given("the user launches the application")
    public void launchApplication() {
    	page.launchApplication(ConfigReader.get("urlSauce"));
    }

    @When("the user enters valid username")
    public void enterUsername() {
    	page.enterUsername();
    }

    @When("the user enters valid password")
    public void enterPassword() {
    	page.enterPassword();
    }

    @When("the user clicks on login button")
    public void clickLogin() {
    	page.clickLogin();
    }

    @Then("the products page should be displayed")
    public void verifyProductsPage() {
    	page.verifyProductsPage();
    }

}
