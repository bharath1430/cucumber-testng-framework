package pages;

import org.openqa.selenium.By;
import driver.DriverFactory;
import utils.ConfigReader;

public class SaucePage {

    By searchBox = By.name("q");
    By userName = By.id("user-name");
    By passWord = By.id("password");
    By verifyTitle = By.className("title");
    By loginButton = By.id("login-button");

    public void launchApplication(String url) {
    	DriverFactory.getDriver().get(url);
    }

    public void enterUsername() {
        DriverFactory.getDriver().findElement(userName).sendKeys(ConfigReader.get("userName"));
    }

    public void enterPassword() {
    	DriverFactory.getDriver().findElement(passWord).sendKeys(ConfigReader.get("passWord"));
    }
    
    public void clickLogin() {
    	DriverFactory.getDriver().findElement(loginButton).click();
    }
    
    public void verifyProductsPage() {
    	DriverFactory.getDriver().findElement(verifyTitle).getText().contains("Products");
    }
}