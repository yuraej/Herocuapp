package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CarePlanCreationPage;

import java.util.concurrent.TimeUnit;

public class Salesforce {

    @Test
    public void openSalesforce() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(32, TimeUnit.SECONDS);
        driver.get("https://seniorlink--staging.cs41.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fseniorlink--staging.lightning.force.com%252Flightning%252Fo%252FPersonal_Care_Plan__c%252Fnew%253Fcount%253D3%2526ws%253D%25252Flightning%25252Fr%25252FOpportunity%25252F0065500000CJiqqAAD%25252Fview%2526nooverride%253D1%2526useRecordTypeCheck%253D1%2526navigationLocation%253DRELATED_LIST%2526uid%253D1567436538193");
        driver.findElement(By.id("username")).sendKeys("aqa1@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("Password02");
        driver.findElement(By.id("Login")).click();
        CarePlanCreationPage carePlanCreationPageTextFeald = new CarePlanCreationPage(driver);
        carePlanCreationPageTextFeald.createPlan();
        CarePlanCreationPage carePlanCreationPageTextArea = new CarePlanCreationPage(driver);
        carePlanCreationPageTextArea.createPlanArea();
        driver.quit();
    }
}
