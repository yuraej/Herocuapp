import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckBoxes {
    @Test
    public void checkElements(){
        /**
         * Done 1. открыть страницу http://the-internet.herokuapp.com/checkboxes;
         * Done 2. найти элемент checkboxes;
         * Done 3. проверить, что первый пункт чек-бокса не выбран;
         * Done 4. выбрать первый элемент;
         * Done 5. проверить, что первый пункт чек-бокса выбран;
         * Done 6. проверить, что второй пункт чек-бокса выбран;
         * Done 7. снять выбор со второго пункта чек-болса;
         * Done 8. проверить, что второй пункт чек-бокса не выбран;
         * Done 9. выйти с браузера.
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement element = driver.findElement(By.id("checkboxes"));
        List<WebElement> listElementsCheckbox = element.findElements(By.tagName("input"));
        String condition = listElementsCheckbox.get(0).getAttribute("checked");
        assertEquals(condition, null);
        element.findElement(By.tagName("input")).click();
        listElementsCheckbox = element.findElements(By.tagName("input"));
        condition = listElementsCheckbox.get(0).getAttribute("checked");
        assertEquals(condition, "true");
        WebElement element1 = listElementsCheckbox.get(1);
        element1.click();
        listElementsCheckbox = element.findElements(By.tagName("input"));
        condition = listElementsCheckbox.get(1).getAttribute("checked");
        assertEquals(condition, null);
        driver.quit();
    }
}
