import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Hovers {
    /**
     * Done     1. открыть страницу http://the-internet.herokuapp.com/hovers;
     * Done     2. создать Action для 1-го профиля, выполнить его;
     * Not Done 3. создать Action для 2-го профиля, выполнить его;
     * Not Done 4. создать Action для 3-го профиля, выполнить его;
     *  пункты 3 и 4 не выполнены из-за того, что не получилось "зацепиться" за профиля 2 и 3;
     */
    @Test
    public void letHover(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div/img")))
                .moveToElement(driver.findElement(By.xpath("//*[text()='View profile']")))
                .click().build().perform();
        String result = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Not Found", result);
    }
}
