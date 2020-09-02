package Java8Practise.LambaFunction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxWithStream {

    @Test
    public void CheckBoxWithStream() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        List<WebElement> checkboxes=driver.findElements(By.cssSelector("td.select-checkbox"));
        checkboxes.forEach(WebElement::click);

        //Another way
    //    driver.findElements(By.cssSelector("td.select-checkbox")).forEach(ele -> ele.click());

        driver.quit();
    }
}
