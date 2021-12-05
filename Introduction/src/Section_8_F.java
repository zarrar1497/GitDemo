import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Section_8_F {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */

		/* IMPORTANCE OF ASSERTIONS */

		// TESTNG IS ONE OF THE TESTING FRAMEWORK

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // total checkbox in
																									// UI
/*
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // before
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // purposely
																												// making
																												// false*/

		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // before
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
		
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); // select radio button

		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // after
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		
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
		
	
		
	}

}
