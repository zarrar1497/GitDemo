import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section_8_B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */
		
		/* HANDLING STATIC DROPDOWN */

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
		
		
		
		

		
	}

}
