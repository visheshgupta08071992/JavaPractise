package Java8Practise.LambaFunction;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveTextFromListOfElement {

    @Test
    public void RetrieveTextFromListOfElementWithoutStremAPI()
    {
        // Auto setup of chrome executable file
        WebDriverManager.chromedriver().setup();
        // Launching browser
        WebDriver driver = new ChromeDriver();
        // Load the URL
        driver.get("http://automationpractice.com/index.php");
        // Locating all product names at home page
        List<WebElement> allProductNameElement = driver.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"));
        // Print count of product found
        System.out.println("Total product found : "+allProductNameElement.size());
        // Logic to iterate webelement to retrieve text and store
        List<String> allProductNames = new ArrayList<>();
        for(WebElement ele : allProductNameElement)
        {
            String name = ele.getText().trim();
            allProductNames.add(name);
        }

        // Printing product names
        System.out.println("All product names are : ");
        for(String s :allProductNames)
        {
            System.out.println(s);
        }

        // closing the browser
        driver.quit();
    }

}
