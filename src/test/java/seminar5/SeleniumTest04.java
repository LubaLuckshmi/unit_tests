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

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest04 {
    @Test
    void browserTest() {
        BasicConfigurator.configure();
        WebDriver webDriver = new SafariDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div cite")));

        String searchResultText = searchResult.getText();
        boolean isFind = searchResultText.contains("selenium.dev");
        webDriver.quit();
        assertTrue(isFind);
    }
}


