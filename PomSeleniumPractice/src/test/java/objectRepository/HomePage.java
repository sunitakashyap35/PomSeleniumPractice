package objectRepository;

import java.sql.Driver;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;

import utilities.BaseClass;

public class HomePage extends BaseClass {

	public static By testingFormPage = By.xpath("//a[contains(text(),'Testing Form Page')]");
	public static By shortWait = By.xpath("//a[contains(text(),'Short Wait')]");
	public static By longWait = By.xpath("//a[contains(text(),'Long Wait')]");
	public static By xpathOperator =By.xpath("//a[contains(text(),'Xpath Operators')]");
	

	public static void clicktestingFormPage() {
		click(testingFormPage);
	}

	public static void clickshortwait() {
		click(shortWait);

	}

	public static void clicklongWait() {
		click(longWait);
	}
	public static void clickxpathOperator() {
		click(xpathOperator);
	}
}