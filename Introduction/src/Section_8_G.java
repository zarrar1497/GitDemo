import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Section_8_G {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */

		/* HANDLING CALENDER */

		// TESTNG IS ONE OF THE TESTING FRAMEWORK

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


		//SOURCE SELECTION
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		//DESTINATION SELECTION		
		driver.findElement(By.xpath("//input[@value='Arrival City']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		//BEFORE CLICKING ON RADIO BUTTON
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		//SELECTING RADIO BUTTONS
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//AFTER CLICKING ON RADIO BUTTON
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//CHECK IF RETURN DATE FIELD IS ENABLED
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		//HOW TO SELECT CURRENT DATE
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("IT IS ENABLED. YESSSSS!!!");
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
