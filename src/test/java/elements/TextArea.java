package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextArea {
    WebElement element;
    WebDriver driver;
    WebDriverWait wait;
    String label;

    public TextArea(String label, WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        this.label = label;
        element = driver.findElement(By.xpath("//span[text()='" + label + "']/../..//following-sibling::textarea"));
    }

    public TextArea typeText(String text) {
        element.clear();
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(String.format("Writing text '%s' into input '%s'", text, label));
        element.sendKeys(text);
        return this;
    }
}
