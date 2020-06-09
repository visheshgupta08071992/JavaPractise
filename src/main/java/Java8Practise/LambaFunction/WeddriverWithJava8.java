package Java8Practise.LambaFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WeddriverWithJava8 {

    @Test
    public void WebDriverWithJava8(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total No of Links on Amazon is " + links.size());

        //Print Name of each link
        //Not Using Java8
//        for (WebElement ele:links
//             ) {
//            System.out.println(ele.getText());
//        }

        //Using Java 8
//        links.forEach(ele -> System.out.println(ele.getText()));

        //Ignore Blank values
//        links.stream().filter(ele -> !ele.getText().equals("")).map(WebElement::getText).forEach(System.out::println);

        //Ignore Blank values and Print all links that contains Amazon
        links.stream().filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon")).map(WebElement::getText).forEach(System.out::println);

        driver.quit();


    }

}
