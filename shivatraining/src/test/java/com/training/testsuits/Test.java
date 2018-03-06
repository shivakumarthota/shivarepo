package com.training.testsuits;
import java.io.FileInputStream;

	
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.training.testsuits.*;
import com.training.resources.*;
import com.training.reusable.*;


public class Test {

	static Properties prop;
	public static void main(String[] args) throws IOException {
		
		  prop = new Properties();
		  
	      InputStream input = new FileInputStream("C:\\Users\\thota\\Desktop\\seleniumP\\com.training.testsuits\\src\\main\\java\\com\\training\\resources\\test.properties");
	       
	      prop.load(input);

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.navigate().to(prop.getProperty("url"));
		
		
		
		
		ReusableMethods.clickButtonusingLinkTest("linktext", Constants.register_Link,driver);
		
		ReusableMethods.enterValue("name", Constants.firstName_name, prop.getProperty("firstName"), driver);
		ReusableMethods.enterValue("name", Constants.lastName_name, prop.getProperty("lastName"), driver);
		ReusableMethods.enterValue("name", Constants.phonenumber, prop.getProperty("phone"), driver);
		ReusableMethods.enterValue("id", Constants.user_name, prop.getProperty("userName"), driver);
		ReusableMethods.enterValue("name", Constants.address, prop.getProperty("address1"), driver);
		ReusableMethods.enterValue("name", Constants.city, prop.getProperty("city"), driver);
		ReusableMethods.enterValue("name", Constants.state1, prop.getProperty("state"), driver);
		ReusableMethods.enterValue("name", Constants.code, prop.getProperty("postalCode"), driver);
		ReusableMethods.enterValue("id", Constants.username, prop.getProperty("email"), driver);
		ReusableMethods.enterValue("name", Constants.pass, prop.getProperty("password"), driver);
		ReusableMethods.enterValue("name", Constants.conpas, prop.getProperty("confirmPassword"), driver);
		
		
		ReusableMethods.countryDropDown("name", Constants.countryDropdown, 2, driver);
		
		ReusableMethods.clickButtonusingLinkTest("name", Constants.rigister_Link,driver);
		
		ReusableMethods.clickButtonusingLinkTest("linktext", Constants.flight_Link,driver);
		ReusableMethods.clickButtonusingLinkTest("xpath", Constants.trip,driver);
		ReusableMethods.countryDropDown("name", Constants.passengers, 3, driver);
		ReusableMethods.countryDropDown("name", Constants.depart, 1, driver);
	
		ReusableMethods.clickButtonusingLinkTest("name", Constants.findlight,driver);
		
		ReusableMethods.clickButtonusingLinkTest("name", Constants.reserflight,driver);
		ReusableMethods.clickButtonusingLinkTest("name", Constants.buyflight,driver);

	}

}



