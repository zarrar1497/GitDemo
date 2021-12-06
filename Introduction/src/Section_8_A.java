import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section_8_A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);

		/* HANDLING STATIC DROPDOWNS */

		/*
		 *this is git demo test
		  dropdown.selectByIndex(3);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  dropdown.selectByVisibleText("AED");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  dropdown.selectByValue("USD");
		  System.out.println(dropdown.getFirstzSelectedOption().getText());
		 */
		
		
		/* ACCESSING DROPDOWNS WITHOUT USING FOR LOOP
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		*/
		
		
		
		/* ACCESSING DROPDOWNS USING WHILE LOOP
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		int i =1;
		while(i<9)
		{driver.findElement(By.id("hrefIncAdt")).click();
		i++;
			
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		*/
		
		
		
		/* ACCESSING DROPDOWNS USING FOR LOOP
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i=1;i<9;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		*/
		
	}

}
