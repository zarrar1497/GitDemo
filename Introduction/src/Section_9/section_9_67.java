package Section_9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section_9_67 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// press CTRL+SHIFT+F for formating the code

		// Toggle breakpoint and run the application in debug mode

		// press Step over for checking every line of code

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get the actual vegitable name

			// convert array into arraylist for easy search

//check whether name you extracted is present or not in arraylist

			Thread.sleep(3000);
			List itmesNeededList = Arrays.asList(itemsNeeded);

			if (itmesNeededList.contains(formattedName)) {// do not depend upon text when you build locators
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				//	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); for parent to child traversal

				if (j == itemsNeeded.length)
					break;
			}
		}
	}

}
