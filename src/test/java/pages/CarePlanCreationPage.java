package pages;

import elements.TextArea;
import elements.TextField;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import models.CarePlan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class CarePlanCreationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public CarePlanCreationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void createPlan(CarePlan carePlan) {
        new TextField("Health Directive Other", driver).typeText(carePlan.getHealthDirectiveOther());
        new TextField("Location", driver).typeText(carePlan.getLocation());
        new TextField("Toilet Schedule Description", driver).typeText(carePlan.getToiletScheduleDescription());
        new TextField("Preparing Meals Problem Managing Tips", driver).typeText(carePlan.getPreparingMealsProblemManagingTips());
        new TextField("Light Housework Problem Managing Tips", driver).typeText(carePlan.getLightHouseworkProblemManagingTips());
        new TextField("Caregiver/Family Transports Name", driver).typeText(carePlan.getCaregiverFamilyTransportsName());
        new TextField("Shopping Problem Managing Tips", driver).typeText(carePlan.getShoppingProblemManagingTips());
        new TextField("Equipment Used Other Tips", driver).typeText(carePlan.getEquipmentUsedOtherTips());

        new TextArea("Cultural Considerations", driver).typeText(carePlan.getCulturalConsiderationsCultural());
        new TextArea("Caregiver and Consumer Strengths", driver).typeText(carePlan.getCaregiverAndConsumerStrengths());
        new TextArea("Important Health/Medical Considerations", driver).typeText(carePlan.getImportantHealthMedicalConsiderations());
        new TextArea("Health Directive Comments", driver).typeText(carePlan.getHealthDirectiveComments());
        new TextArea("Bed Positioning Comments", driver).typeText(carePlan.getBedPositioningComments());
        new TextArea("Moving/Transferring Comments", driver).typeText(carePlan.getMovingTransferringComments());
        new TextArea("Walking/Ambulation Comments", driver).typeText(carePlan.getWalkingAmbulationComments());
        new TextArea("Getting Dressed Comments", driver).typeText(carePlan.getGettingDressedComments());
        new TextArea("Eating/Drinking Comments", driver).typeText(carePlan.getEatingDrinkingComments());
    }
}
