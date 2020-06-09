package Java8Practise.LambaFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleStream {
    @Test
    public void WindowHandleStream() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://popuptest.com/goodpopups.html");
        driver.findElement(By.linkText("Good PopUp #1"));


        driver.quit();
    }




}
