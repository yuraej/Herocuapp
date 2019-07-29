import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.BitSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortableDataTables {
    @Test
    public void checkTableElements(){
        /**
         * DONE 1. открыть страницу http://the-internet.herokuapp.com/tables;
         * DONE 2. создать списки содержимого ячеек для каждой таблицы на этой странице;
         * DONE 3. сравнить содержимое соответствующих ячеек;
         * DONE 4. выйти с браузера.
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement table1 = driver.findElement(By.id("table1"));
        WebElement table2 = driver.findElement(By.id("table2"));
        List<WebElement> listElementTable1 = table1.findElements(By.tagName("td"));
        List<WebElement> listElementTable2 = table2.findElements(By.tagName("td"));
        for(int i=0; i<listElementTable1.size(); i++){
            assertEquals(listElementTable1.get(i).getText(), listElementTable2.get(i).getText());
        }
        driver.quit();
    }
}
