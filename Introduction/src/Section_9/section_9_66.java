package Section_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section_9_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// press CTRL+SHIFT+F for formating the code

		// Toggle breakpoint and run the application in debug mode

		// press Step over for checking every line of code

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemsNeeded = { "Cucumber", "Brocolli" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
