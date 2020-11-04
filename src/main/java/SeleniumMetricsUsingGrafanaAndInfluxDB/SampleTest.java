package SeleniumMetricsUsingGrafanaAndInfluxDB;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(description = "login")
	public void login(){

	}

	@Test(description = "search for flights", dependsOnMethods = "login")
	public void search(){

	}

	@Test(description = "select flight", dependsOnMethods = "search")
	public void select(){

	}

	@Test(description = "book flight", dependsOnMethods = "select")
	public void book(){

	}

	@Test(description = "logout", dependsOnMethods = "book")
	public void logout(){

	}
}
