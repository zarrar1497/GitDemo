import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section_8_C {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* SECTION 8 - SELENIUM WEBDRIVER ->TECHNIQUE */
		
		/* HANDLING DYNAMIC DROPDOWN */
		/* HANDLING DYNAMIC DROPDOWN - PARENT - CHILD RELATIONSHIP */

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		
		// PARENT TO CHILD XPATH - SOURCE
		driver.findElement(By.xpath("//div[@class='search_options_menucontentbg'] //a[@value='BLR']")).click();
		
		
		Thread.sleep(2000L); // WHEN IT AUTO SELECTS DESTINATION
		
		// PARENT TO CHILD XPATH - DESTINATION		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		
		
		
	}

}
