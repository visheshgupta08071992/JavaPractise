package Java8Practise.LambaFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class RetrieveTextFromListOfElementUsingStreamAPI {

    @Test
    public void RetrieveTextFromListOfElementWithStremAPI()
    {
        // Auto setup of chrome executable file
        WebDriverManager.chromedriver().setup();
        // Launching browser
        WebDriver driver = new ChromeDriver();
        // List of all Product Names
        List<String> allProductNames = new ArrayList<>();
        // Load the URL
        driver.get("http://automationpractice.com/index.php");
        // Locating all product names at home page
         driver.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"))
                 .forEach(productNames -> allProductNames.add(productNames.getText()));
        // Print count of product found
        out.println("Total product found :" + allProductNames.size());
        //Printing Product Names
        allProductNames.forEach(out::println);
        // closing the browser
        driver.quit();
    }

}
