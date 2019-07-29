import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class NotificationMessages {
    @Test
    public void checkMessage() {
        /**
         * Done 1. открыть страницу http://the-internet.herokuapp.com/notification_message;
         * Done 2. найти кннопку Click here, кликнуть;
         * Done 3. кполучить сообщение нал строкой Notification Messages;
         * Done 4. сравнить полученное сообщение с ожидаемым;
         * Done 5. выйти с браузера.
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message");
        driver.findElement(By.linkText("Click here")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text = driver.findElement(By.id("flash")).getText();
        assertEquals(text, "Action unsuccesful, please try again\n" +
                                  "×");
        driver.quit();
    }

}
