package utilities;

import java.security.PublicKey;
import java.sql.Driver;

import org.checkerframework.checker.units.qual.degrees;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.devtools.idealized.OpaqueKey;
import org.openqa.selenium.devtools.v109.tethering.Tethering;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.IFactoryAnnotation;

//import net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaInstanceFactory.LambdaMethodImplementation.Appender.Dispatcher.UsingDirectInvocation;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class BaseClass {
	public static WebDriver driver ;
    public static WebElement dropdown;
		//open browser
	public static void Openbrowser(String browserName ) {

	if (browserName.equalsIgnoreCase("Chrome"))
	{		
		System.out.println("My name is Sunita");
		 driver = new ChromeDriver();	 
		 System.out.println(browserName + " " + "browserName Is up and runnig" );	 
	}	
	else if (browserName.equalsIgnoreCase("firefox")) 
	{	
		driver = new FirefoxDriver();		
		System.out.println(browserName + " " + "browserName Is up and runnig");
	}
	else 
	{
		System.out.println("unable to lauch"+ browserName + "invalid input !" );
	}
	}
	// AUT-for open the application
	public static void openBaseUrl() {

		try {
			//driver.get("https://seleniumautomationpractice.blogspot.com/");
			driver.navigate().to("https://seleniumautomationpractice.blogspot.com/");
		} catch (Exception e) {
			System.out.println("unable to open URL" + e.getMessage());
		}
	}	
	//click methods 	-to click the element 
	public static void click(By locValue) {
      driver.findElement(locValue).click();
  }
	//type
	public static void enterText(By locvalue,String data) {
		driver.findElement(locvalue).clear();
		driver.findElement(locvalue).sendKeys(data);
	}
	// creating this function for pagefactory by webelement class
	
	public static void entTxt(WebElement element, String data) {
		
		try {
			element.clear();
			element.sendKeys(data);
			System.out.println("entered the data-" + data + "into the textbox having the element name as" + element);
			
		} catch (Exception e) {
			System.out.println("unable to entered the data-" + data + "into the textbox having the element name as" + element);
			
		}
	}
	//select
//	public static void select(By locvalue,String data) {
//		try {
//			
//			WebElement dropdown = driver.findElement(locvalue); // Locate the dropdown
//             Select select = new Select(dropdown); // Create a Select object
//             select.selectByVisibleText(data); // Select the option by visible tex
//            
//			 //new Select(driver.findElement(locvalue).selectByVisibleText());
//			 System.out.println("select the "+ data + "Using locvalue" + locvalue);
//			 
//		}catch(Exception e)
//		{
//			System.out.println("unable to select the "+ data + "Using locvalue" + locvalue);
//		}
//	}
	
	public static void select(By locvalue, int no) {
		try {
			 dropdown = driver.findElement(locvalue); // Locate the dropdown
            Select select = new Select(dropdown); // Create a Select object
            select.selectByIndex(no);
			 //new Select(driver.findElement(locvalue).SelectByIndex());
			 System.out.println("select the "+ no + "Using locvalue"  );
			 
		}catch(Exception e)
		{
			System.out.println("unable to select the option having index no "+ no + "Using locvalue" + locvalue);
		}
	}
	//wait
	//shutdown
	//alert
	public static void alertAction(String action) {
		try {
		if(action.equalsIgnoreCase("OK")){
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
		}else if(action.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
				
	}catch(Exception e) {
		System.out.println("error in performing in Alert box:" + action + "fail" );
	}
	
}
	
}
