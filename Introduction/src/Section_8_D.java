import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section_8_D {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */

		/* HANDLING AUTO-SUGGESTIVE DROPDOWN */
		
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
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
		
		
		
		
	}

}
