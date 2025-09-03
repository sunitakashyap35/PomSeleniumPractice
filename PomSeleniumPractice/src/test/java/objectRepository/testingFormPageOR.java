package objectRepository;

import org.openqa.selenium.By;
import org.testng.annotations.IFactoryAnnotation;

import utilities.BaseClass;

public class testingFormPageOR extends BaseClass{
	
	public static By fName = By.xpath("//*[@type ='text' and @name='ts_first_name'  ]");
	public static By lName = By.xpath("//input[contains(@name,'ts_last')]");
	public static By Add = By.xpath("//textarea[contains(@style,'width: 250px; height: 102px')]");
	public static By nationality= By.xpath("//select[contains(@name,\"ts_country\")]");
	public static By Male = By.xpath("//input[contains(@style,'width: 250px')]");
	public static By Female = By.xpath("//input[contains(@value,'female')]");
	public static By Cricket = By.xpath("//*[@value = 'cricket']");
	public static By Football = By.xpath("//input[contains(@name,'ts_checkbox2')]");
	public static By Hockey = By.xpath("//input[contains(@name,'ts_checkbox3')]");
	public static By submit = By.xpath("//*[@onclick = 'myFunction()']");
	
	public static void formfill(String fname,String lname, String add, int no,String gender,String intrest) {
		
		enterText(fName,fname);
		enterText(lName,lname);
		enterText(Add,add);
		select(nationality,no );
		
		if(gender.equalsIgnoreCase("male")){
			click(Male);
		}else if(gender.equalsIgnoreCase("female")) {
		
		    click(Female);
		
	     }else {
		System.out.println("invalid input:- " + gender );
	    }
		if(intrest.equalsIgnoreCase("cricket")){
			click(Cricket);
		}else if(intrest.equalsIgnoreCase("football")) {
			click(Football);
		}
		else if(intrest.equalsIgnoreCase("hockey")) {
			click(Hockey);
		}else {
			System.out.println("invalid input:- intrest");
		}
		
		click(submit);
		
		
    }
  }
