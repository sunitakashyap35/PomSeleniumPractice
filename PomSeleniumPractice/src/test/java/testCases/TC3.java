package testCases;

import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.TestingFormPage_PF;
import objectRepository.testingFormPageOR;
import utilities.BaseClass;

public class TC3 extends BaseClass {
	
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
		
		TestingFormPage_PF tPf = new TestingFormPage_PF(driver);
		tPf.formfill("sunita","sangita");
		
		//Thread.sleep(2000);
		//alertAction("OK");
	}
}
