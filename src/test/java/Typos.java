import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Typos {
    @Test
    public void findTypos(){
        /**
         * Done 1. открыть страницу http://the-internet.herokuapp.com/typos;
         * Done 2. выбрать текст под заголовком Typos, 2-я строка с верху;
         * Done 3. проверить выбранны2й текст на наличие ошибок;
         * Done 4. выйти с браузера.
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
        String text = driver.findElement(By.xpath("//div//p[2]")).getText();
        String referenceText = "Sometimes you'll see a typo, other times you won't.";
        assertEquals(referenceText, text);
        driver.quit();
    }

}
