package seminar5;


import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException  {

        BasicConfigurator.configure();
        WebDriver webDriver =new SafariDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("GeekBrains");
        searchBox.submit();
        Thread.sleep(10000);
        webDriver.quit();

    }

}
