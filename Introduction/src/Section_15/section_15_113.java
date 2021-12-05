package Section_15;

import java.util.List;
import java.util.stream.Collectors;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class section_15_113 {
	//THIS CODE IS NOT WORKING FINE 
		public static void main(String args[]) {
			
			System.setProperty("webdriver.chrome.driver",
					"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			//WEB TABLE SORTING

			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			driver.findElement(By.id("search-field")).sendKeys("an");
			List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
			List<WebElement> filteredList=veggies.stream().filter(veg->veg.getText().contains("an"))
			.collect(Collectors.toList());
			Assert.assertEquals(veggies.size(), filteredList.size());
			
		
		
		
		}
			
		
		}
			