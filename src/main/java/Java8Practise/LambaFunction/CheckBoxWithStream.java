package Java8Practise.LambaFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxWithStream {

    @Test
    public void CheckBoxWithStream() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        List<WebElement> checkboxes=driver.findElements(By.cssSelector("td.select-checkbox"));
        checkboxes.forEach(WebElement::click);

        driver.quit();
    }
}
