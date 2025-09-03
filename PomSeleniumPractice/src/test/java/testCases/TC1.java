package testCases;

import org.openqa.selenium.By;
import objectRepository.HomePage;
import objectRepository.testingFormPageOR;
import utilities.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		Openbrowser("firefox");

		openBaseUrl();		
		 //click(HomePage.testingFormPage);
		
		
		
		HomePage.clicktestingFormPage();

		testingFormPageOR.formfill("kumari", "sunita", "delhi", 3 , "female","hockey");
		
		Thread.sleep(2000);
		
		alertAction("OK");
		 
		//HomePage.clickshortwait();
		//HomePage.clicklongWait(); 
		//HomePage.clickxpathOperator();
		

			}

}
