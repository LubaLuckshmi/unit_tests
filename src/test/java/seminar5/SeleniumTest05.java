package seminar5;

import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest05 {
    @Test
    void authorizationTest() {
        BasicConfigurator.configure();
        String login = "standard_user";
        String password = "secret_sauce";
        WebDriver webDriver = new SafariDriver();
        webDriver.get("https://www.saucedemo.com/");
        WebElement loginBox = webDriver.findElement(By.id("user-name"));
        loginBox.sendKeys(login);
        WebElement passBox = webDriver.findElement(By.id("password"));
        passBox.sendKeys(password);
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();


        WebElement productLabel = webDriver.findElement(By.className("title"));
        String findText = productLabel.getText();
        webDriver.quit();
        assertThat(findText).isEqualTo("Products");

    }
}
