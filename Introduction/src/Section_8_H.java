import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Section_8_H {

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
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		
		/* --------------------------COUNTRY SELECTION ------------------------------------*/

		driver.findElement(By.id("autosuggest")).sendKeys("ind"); //india search krna hai to
		Thread.sleep(3000); // thoda wait krne k liyeh taki crash na ho jay

		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] "));

		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break; // bahar nikal jane k liyeh taki loop ghumte na rahe
			}
		}

		
		/* --------------------------SOURCE & DESTINATION------------------------------------*/

		// SOURCE SELECTION
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		// DESTINATION SELECTION
		driver.findElement(By.xpath("//input[@value='Arrival City']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		/* --------------------------CALENDER HANDLING ------------------------------------*/

		// BEFORE CLICKING ON RADIO BUTTON
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// SELECTING RADIO BUTTONS
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();

		// AFTER CLICKING ON RADIO BUTTON
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// CHECK IF RETURN DATE FIELD IS ENABLED
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// HOW TO SELECT CURRENT DATE
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("IT IS ENABLED. YESSSSS!!!");
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}

		/* --------------------------CHECKBOX SELECTION ------------------------------------*/

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // total checkbox in
		// UI

		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // before
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); // select radio button

		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // before
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		/* --------------------------PASSENGER SELECTION ------------------------------------*/
		
		
		/* ACCESSING DROPDOWNS USING FOR LOOP & USING ASSERTIONS*/
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i=1;i<8;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click(); // click on done button
		
		Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()), "8 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		

		/* --------------------------CURRENCY SELECTION ------------------------------------*/
		
		/* HANDLING STATIC DROPDOWNS */
		
		  dropdown.selectByIndex(3);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  dropdown.selectByVisibleText("AED");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  dropdown.selectByValue("USD");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  /* --------------------------SEARCH BUTTON------------------------------------*/
		  
		  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 


	}

}
