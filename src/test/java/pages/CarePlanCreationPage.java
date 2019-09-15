package pages;

import elements.TextArea;
import elements.TextField;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

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

        new TextArea("Cultural Considerations", driver).typeText("test");
        new TextArea("Caregiver and Consumer Strengths", driver).typeText("test");
        new TextArea("Important Health/Medical Considerations", driver).typeText("test");
        new TextArea("Health Directive Comments", driver).typeText("test");
        new TextArea("Bed Positioning Comments", driver).typeText("test");
        new TextArea("Moving/Transferring Comments", driver).typeText("test");
        new TextArea("Walking/Ambulation Comments", driver).typeText("test");
        new TextArea("Getting Dressed Comments", driver).typeText("test");
        new TextArea("Eating/Drinking Comments", driver).typeText("test");
    }
}
