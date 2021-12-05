package Section_10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class section_10_73 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// EXPLICIT WAIT

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver() ;
		
		WebDriverWait w = new WebDriverWait(driver,5);
		

		driver.manage().window().maximize();

		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		addItems(driver,itemsNeeded);
		//change the return type to STATIC because we can call method without creating objects of that class
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		//---------COMMON FORMAT FOR EXPLICIT WAIT---------//
		//WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

		
	}
	
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException
	{int j = 0;
	
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get the actual vegitable name

			// convert array into arraylist for easy search

//check whether name you extracted is present or not in arraylist

			//Thread.sleep(2000);
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


