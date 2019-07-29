import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class DropDown {
    /**
     * Done 1. открыть страницу http://the-internet.herokuapp.com/dropdown;
     * Done 2. создать select элемент из вебэлемента;
     * Done 3. проверить выбор элементов дроп-дауна:
     * Done 3.1. выбрать первый элемент;
     * Done 3.2. проверить, что выбран первый элемент;
     * Done 3.3. выбрать второй элемент;
     * Done 3.4. проверить, что выбран второй элемент;
     * Done 4. выйти из браузера.
     */
    @Test
    public  void  dropDown(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        String numberOption = element.getAttribute("value");
        assertEquals(numberOption, "1");
        select.selectByVisibleText("Option 2");
        numberOption = element.getAttribute("value");
        assertEquals(numberOption, "2");
        driver.quit();
    }
}
