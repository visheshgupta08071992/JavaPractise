package SeleniumPractise.HandlingDropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


//Verify whether the Options within the Dropdown are in Sorted Order

public class ValidationOfSortedDropDownDescending {

    public static void main(String[] args) throws InterruptedException {

        // Launching browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        // Launching URL
        driver.get("file:///Users/vishesh.gupta/Desktop/JavaPractise/src/main/java/SeleniumPractise/HandlingDropDowns/DropDownHTML.html");

        // Locating select tag web element
        WebElement singleSelectTagDropdownWebElement= driver.findElement(By.id("SingleDD"));
        Select dropdown = new Select(singleSelectTagDropdownWebElement);

        // Get all options
        List allOptionsElement = dropdown.getOptions().stream().map(WebElement::getText).collect(Collectors.toList());

        // Removing "Select" option as it is not actual option
        allOptionsElement.remove("Select");

        // Default order of option in drop down
        System.out.println("Options in dropdown with Default order :"+allOptionsElement);

        // Creating a temp list to sort
        List tempList = new ArrayList(allOptionsElement);


        // Sort list Descending
        Collections.sort(tempList,Collections.reverseOrder());

        System.out.println("Descending Sorted List "+ tempList);


        // equals() method checks for two lists if they contain the same elements in the same order.
        boolean ifSortedAscending = allOptionsElement.equals(tempList);

        if(ifSortedAscending)
        {
            System.out.println("List is sorted");
        }
        else
            System.out.println("List is not sorted.");


        driver.quit();

    }
}
