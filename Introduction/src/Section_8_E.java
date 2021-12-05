import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section_8_E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */

		/* HANDLING CHECKBOX */
		
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // total checkbox in UI

		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //before
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); // select radio button
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //before
		
		
		
	}

}
