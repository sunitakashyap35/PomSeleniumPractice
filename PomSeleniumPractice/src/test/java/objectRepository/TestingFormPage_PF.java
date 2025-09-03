package objectRepository;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;
import utilities.BaseClass;

public class TestingFormPage_PF extends BaseClass {

	public TestingFormPage_PF(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "//*[@type ='text' and @name='ts_first_name'  ]")
	WebElement fName;
	
	@FindBy (xpath = "//input[contains(@name,'ts_last')]")
	WebElement lName;
	
	public void formfill(String fname, String lname) {
		entTxt(fName,fname);
		entTxt(lName,lname);
		
	}
	
}
