package Java8Practise.LambaFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksWithStream {
    @Test
    public void LinksWithStream() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.freshworks.com/");
        driver.findElements(By.xpath("//ul[@class='footer-nav']//li")).forEach(ele -> System.out.println(ele.getText()));
        //another way of printing
        /*driver.findElements(By.xpath("//ul[@class='footer-nav']//li")).stream().map(WebElement::getText).forEach(System.out::println);*/


        driver.quit();
    }
}
