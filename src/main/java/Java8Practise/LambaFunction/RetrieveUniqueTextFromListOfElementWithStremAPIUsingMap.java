package Java8Practise.LambaFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class RetrieveUniqueTextFromListOfElementWithStremAPIUsingMap {
    @Test
    public void RetrieveUniqueTextFromListOfElementWithStremAPIUsingMap()
    {
        // Auto setup of chrome executable file
        WebDriverManager.chromedriver().setup();
        // Launching browser
        WebDriver driver = new ChromeDriver();
        // Load the URL
        driver.get("http://automationpractice.com/index.php");
        // Locating all product names at home page
        Set<String> products=driver.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toSet());
        out.println("No of Unique Products are :" + products.size());
        out.println("List of Unique Products :");
        products.forEach(out::println);
        // closing the browser
        driver.quit();
    }
}
