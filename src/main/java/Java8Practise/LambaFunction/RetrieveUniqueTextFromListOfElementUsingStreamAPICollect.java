package Java8Practise.LambaFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.System.out;

public class RetrieveUniqueTextFromListOfElementUsingStreamAPICollect {
    @Test
    public void RetrieveUniqueTextFromListOfElementWithStremAPI()
    {
        // Auto setup of chrome executable file
        WebDriverManager.chromedriver().setup();
        // Launching browser
        WebDriver driver = new ChromeDriver();
        // Set of Unique Product Names
        Set<String> uniqueProductNames= new HashSet<>();
        // Load the URL
        driver.get("http://automationpractice.com/index.php");
        // Locating all product names at home page
        driver.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"))
                .forEach(productNames -> uniqueProductNames.add(productNames.getText()));
        // Print count of product found
        out.println("Total product found :" + uniqueProductNames.size());
        //Printing Product Names
        uniqueProductNames.forEach(out::println);
        // closing the browser
        driver.quit();
    }

}
