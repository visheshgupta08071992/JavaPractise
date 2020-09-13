/*
package SeleniumPractise.HandlingDropDowns;

public class IcertisSelenium {
	Case1 :

	@Test
	public void testHappyFlow(){

		WebDriver driver=new FireFoxDriver();

		WebElement termsAndConditions=driver.findElement(By.Xpath(//a[@text()='terms and conditions']));

				String parentWindow=driver.getWindowHandle();

		termsAndConditions.click();

		for (String winHandle : driver.getWindowHandles()) {

			if(!winHandle.equals(parentWindow))
			{
				driver.switchTo().window(winHandle);
				WebElement acceptButton= driver.findElement(By.Xpath(//input[@id='accept']));
						acceptButton.click();
			}
		}
		driver.switchTo().window(parentWindow);
		WebElement myDocButton= driver.findElement(By.Xpath(//a[@id='mydocpdf']));
				myDocButton.click();

		boolean flag = false;
		File dir = new File("C://downloads");
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				flag=true;
			else
				flag=false;
		}
		Assert.assertTrue(flag,"We are not able to download file successfully");
	}


	Case 2

	@Test
	public void testErrorMessageWhenTermsAndConditionsAreNotSelected(){

		WebDriver driver=new FireFoxDriver();

		WebElement myDocButton= driver.findElement(By.Xpath(//a[@id='mydocpdf']));
				myDocButton.click();

		String Title=driver.getTitle();

		Assert.assertEquals(Title,"403 Error","403 error is not received after clicking on Download button without Terms and COnditions")

		boolean flag = false;
		File dir = new File("C://downloads");
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				flag=true;
			else
				flag=false;
		}

		Assert.assertFalse(flag,"File is Downloaded even without selecting Terms and Conditions");
	}

	Case3 :

	@Test
	public void testRejectTermsAndConditionsAndCheckErrorMessage(){

		WebDriver driver=new FireFoxDriver();

		WebElement termsAndConditions=driver.findElement(By.Xpath(//a[@text()='terms and conditions']));

				String parentWindow=driver.getWindowHandle();

		termsAndConditions.click();

		for (String winHandle : driver.getWindowHandles()) {

			if(!winHandle.equals(parentWindow))
			{
				driver.switchTo().window(winHandle);
				WebElement rejectButton= driver.findElement(By.Xpath(//input[@id='reject']));
						rejectButton.click();
			}
		}
		driver.switchTo().window(parentWindow);
		WebElement myDocButton= driver.findElement(By.Xpath(//a[@id='mydocpdf']));
				myDocButton.click();

		String Title=driver.getTitle();

		Assert.assertEquals(Title,"403 Error","403 error is not received after clicking on Download button even after rejecting  Terms and COnditions")

		boolean flag = false;
		File dir = new File("C://downloads");
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				flag=true;
			else
				flag=false;
		}

		Assert.assertFalse(flag,"File is Downloaded even after rejecting Terms and Conditions");
	}





}
*/
