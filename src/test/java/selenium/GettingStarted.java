package selenium;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GettingStarted {
    @Test
    public void testAddTwoNumbers() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver(); //uncomment this one
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
        Thread.sleep(5000);  // Let the user actually see something!

        List<WebElement> elements = driver.findElements(By.className("regfont"));

        int counter = 0;
        for (WebElement e : elements) {
            e.sendKeys("1" +counter);
            counter++;
        }



        //searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!


        driver.quit();

        /*WebElement second = driver.findElement(By.name("n02"));
        second.sendKeys("20");

        WebElement button = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[7]/table/tbody/tr/td/table/tbody/tr/td/form/div[2]/div/div/input"));
        button.click();

        WebElement answer = driver.findElement(By.name("answer"));
        String actual = answer.getAttribute("value");

        String expected = "50";
        assertEquals(expected, actual);*/
    }
    //add junit4 to the classpath by hovering on it.
}

