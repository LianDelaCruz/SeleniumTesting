package selenium;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import org.junit.Test;

public class GettingStarted {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver(); //uncomment this one
        driver.get("https://duckduckgo.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
    //add junit4 to the classpath by hovering on it.
}

