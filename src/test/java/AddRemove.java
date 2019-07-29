import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddRemove {
    @Test
    public void addRemove () {
        /**
         * DONE 1. открываем страницу http://the-internet.herokuapp.com/add_remove_elements;
         * DONE 2. переводим браузер в полноэранный формат;
         * DONE 3. находим элемент Add Element, нажимаем его;
         * DONE 4. создаем List для учета количества элементов added-manually;
         * DONE 5. проверяем, что колчество added-manually равно одному;
         * DONE 6. добавляем еще один элемент added-manually;
         * DONE 7. проверяем колчество элементов added-manually равно двум;
         * DONE 8. удаляем один элемент added-manually;
         * DONE 9. проверяем кол. элементов added-manually, должно быть один;
         * DONE 10. выходим из браузера.
         */
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        List<WebElement> deleteElement =  driver.findElements((By.className("added-manually")));
        assertEquals(deleteElement.size(), 1);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        deleteElement =  driver.findElements((By.className("added-manually")));
        assertEquals(deleteElement.size(), 2);
        driver.findElement(By.className("added-manually")).click();
        deleteElement =  driver.findElements((By.className("added-manually")));
        assertEquals(deleteElement.size(), 1);
        driver.quit();
    }
}
