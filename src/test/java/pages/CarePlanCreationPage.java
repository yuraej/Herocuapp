package pages;

import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarePlanCreationPage {
    WebDriver driver;
    WebDriverWait wait;


    public CarePlanCreationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void createPlan() {
        new TextField("Health Directive Other", driver).typeText("test");
        new TextField("Location", driver).typeText("test");
        new TextField("Toilet Schedule Description", driver).typeText("test");
        new TextField("Preparing Meals Problem Managing Tips", driver).typeText("test");
        new TextField("Light Housework Problem Managing Tips", driver).typeText("test");
        new TextField("Caregiver/Family Transports Name", driver).typeText("test");
        new TextField("Bath/Shower Assist Provided By Name", driver).typeText("test");
        new TextField("Shopping Problem Managing Tips", driver).typeText("test");
        new TextField("Equipment Used Other Tips", driver).typeText("test");
    }
}
