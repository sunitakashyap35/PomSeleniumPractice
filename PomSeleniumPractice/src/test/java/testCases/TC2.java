package testCases;

import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.testingFormPageOR;
import utilities.BaseClass;

public class TC2 extends BaseClass {
	
	@Test(priority = 0)
 public  void Presetup() {
		Openbrowser("firefox");
		openBaseUrl();
		
}
	@Test(priority=1)
	public void navigatetoFormpage() {
		HomePage.clicktestingFormPage();
	}
	@Test(priority=2)
	public void formfill() throws InterruptedException {
		testingFormPageOR.formfill("sangita", "kumari", "pune", 4 , "female","cricket");
		Thread.sleep(2000);
		alertAction("OK");
	}
}
