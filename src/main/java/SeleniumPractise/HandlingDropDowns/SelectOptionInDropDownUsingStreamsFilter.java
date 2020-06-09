package SeleniumPractise.HandlingDropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectOptionInDropDownUsingStreamsFilter {

    @Test
    public void iterateOverOptions() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Select Day
        WebElement day = driver.findElement(By.id("day"));
        day.click();
        List<WebElement> allDayDropDownOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
        selectOptionInDropDownUsingIteration(allDayDropDownOptions, "3");

        // Select Month
        WebElement month = driver.findElement(By.id("month"));
        month.click();
        List<WebElement> allMonthDropDownOptions = driver.findElements(By.xpath("//select[@id='month']/option"));
        selectOptionInDropDownUsingIteration(allMonthDropDownOptions, "Aug");

        // Select year
        WebElement year = driver.findElement(By.id("year"));
        year.click();
        List<WebElement> allYearDropDownOptions = driver.findElements(By.xpath("//select[@id='year']/option"));
        selectOptionInDropDownUsingIteration(allYearDropDownOptions, "1990");

    }

    private void selectOptionInDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {
        dropDownOptions.stream()
                .filter(option -> option.getText().equals(optionToBeSelected))
                .forEach(WebElement::click);
    }
}