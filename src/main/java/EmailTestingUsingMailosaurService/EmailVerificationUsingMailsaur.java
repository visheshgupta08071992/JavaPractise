package EmailTestingUsingMailosaurService;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.SearchCriteria;
import io.github.bonigarcia.wdm.WebDriverManager;


public class EmailVerificationUsingMailsaur {

	private static MailosaurClient mailosaur;

	@Test
	public void retrieveSignUpLinkFromEmail() throws IOException, MailosaurException {
		//1.Provide you Mailsour Account API key and Server Name
		mailosaur = new MailosaurClient("ZG7eiCHLNDPYWSL");
		String server = "2f614kke";
		System.out.println(server);

		//2. Generate a unique email address for this test
		String emailAddress = mailosaur.servers().generateEmailAddress(server);

		//3. **Your automation code that triggers an email to `emailAddress`**
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://networkacme.test.devappdirect.me/signup");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//4.Retrieve emails sent to your mailsour server
		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo(emailAddress);
		Message email = mailosaur.messages().get(server, criteria);

		// 4. Perform assertions on the email subject
		System.out.println(email.subject());
		Assert.assertEquals("Activate your new account. 338 updated", email.subject());

		//5.Retreive signuplink
		String signupLink = email.html().links().get(0).href();
		System.out.println("Links in email are : " + signupLink);
		driver.navigate().to(signupLink);

		//6.User Signing up
		String input="Test@12345";
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(input);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(input);
		driver.findElement(By.className("password")).sendKeys(input);
		driver.findElement(By.className("confirm-password")).sendKeys(input);
		driver.findElement(By.className("phone-number")).sendKeys(input);
		driver.findElement(By.id("termsAndConditions")).click();
		driver.findElement(By.id("idd")).click();

		System.out.println("Email Address is : " + emailAddress);
		System.out.println("Email Variable is : "+ email);


		//Retrieve Google Credentials from email

		SearchCriteria criteria1 = new SearchCriteria();
		criteria1.withSubject("Welcome to your G Suite admin " +
				"account");
		Message email1 = mailosaur.messages().get(server, criteria1);
		System.out.println("Email body is : " + email1.html().body());
		String emailBody = Jsoup.parse(email1.html().body()).toString();
		System.out.println(emailBody);

		String[] usernameSplitedValues = getFirstMatchFromString(emailBody, "Username:(\\W)([^\\s]+)").split(":");
		String[] passwordSplitedValues = getFirstMatchFromString(emailBody, "Password:(\\W)([^\\s]+)").split(":");
		String googleUsername = usernameSplitedValues[1].trim().split("<")[0];
		String googlePassword = passwordSplitedValues[1].trim().split("<")[0];

		System.out.println("Google Username is : " + googleUsername);
		System.out.println("Google Password is : " + googlePassword);


		driver.quit();

	}

	public static String getFirstMatchFromString(String input, String regex) {
		if (input == null || regex == null) {
			return null;
		}
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			return matcher.group(0).toString();
		} else {
			throw new IllegalStateException("Match for regex " + regex + " not found");
		}
	}
}
