package SeleniumSaucelabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;

	String abc;

	@Parameters({"browser","version","platform"})
	@BeforeMethod
	public void setup(String browserName,String versionName,String platformName) throws MalformedURLException {
		System.out.println("Browser Name is " + browserName);
		MutableCapabilities sauceOpts = new MutableCapabilities();
	//	sauceOpts.setCapability("name", methodName);
		sauceOpts.setCapability("build", "Java-W3C-Examples");
		sauceOpts.setCapability("seleniumVersion", "3.141.59");
		sauceOpts.setCapability("username", "vishesh");
		sauceOpts.setCapability("accessKey", "b1cc242a-a5b6-4990-840b-da3488ab5cdf");
		sauceOpts.setCapability("tags", "w3c-chrome-tests");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("sauce:options", sauceOpts);
		cap.setCapability("browserVersion", versionName);
		cap.setCapability("platformName", platformName);
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			cap.setCapability("browserName", "chrome");
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			cap.setCapability("browserName", "firefox");
		}

		driver=new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"),cap);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(){
		driver.quit();
	}
}
