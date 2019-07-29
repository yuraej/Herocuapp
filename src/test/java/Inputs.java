import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Inputs {
    @Test
    public void inputElements(){
        /**
         * DONE 1. открыть страницу http://the-internet.herokuapp.com/inputs;
         * DONE 2. найти элемент Input;
         * DONE 3. проверить, что элемент не поддерживает ввод с клавиатуры не численных элементов;
         * DONE 4. проверить, что элемент поддерживате ввод с клавиатуры численных элементов;
         * DONE 5. нажать стрелку вниз;
         * DONE 6. проверить, что введенное число уменьшилось на единицу;
         * DONE 7. нажать стрелку вверх;
         * DONE 8. проверить, что число увеличилось на единицу;
         * DONE 9. выйти с браузера;
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("try");
        String text = input.getAttribute("value");
        assertEquals(text, "");
        input.sendKeys("7");
        text = input.getAttribute("value");
        assertEquals(text, "7");
        input.sendKeys(Keys.ARROW_DOWN);
        text = input.getAttribute("value");
        assertEquals(text, "6");
        input.sendKeys(Keys.ARROW_UP);
        text = input.getAttribute("value");
        assertEquals(text, "7");
        driver.quit();

    }
}
