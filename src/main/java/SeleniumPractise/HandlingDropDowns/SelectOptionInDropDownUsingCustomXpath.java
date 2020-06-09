package SeleniumPractise.HandlingDropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectOptionInDropDownUsingCustomXpath {

    @Test
    public void iterateOverOptions() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Select Day
        WebElement day = driver.findElement(By.id("day"));
        day.click();
        selectOptionInDropDownUsingIteration(driver, "3");

        // Select Month
        WebElement month = driver.findElement(By.id("month"));
        month.click();
        selectOptionInDropDownUsingIteration(driver, "Aug");

        // Select year
        WebElement year = driver.findElement(By.id("year"));
        year.click();
        selectOptionInDropDownUsingIteration(driver, "1990");

    }

    private void selectOptionInDropDownUsingIteration(WebDriver driver, String optionToBeSelected) {
       String customXpath="//option[text()='" +optionToBeSelected+"']";
        driver.findElement(By.xpath(customXpath)).click();
    }
}