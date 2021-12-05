package Section_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class section_15_111 {
//WEBTABLE SORTING 
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//WEB TABLE SORTING

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
		
		//capture all webelements into list
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//capture text of all webelements into new [original] list
		List<String> original=list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3->sorted list
		List<String> sortedlist=original.stream().sorted().collect(Collectors.toList());
		
		
		//compare original list vs sorted list
		Assert.assertTrue(original.equals(sortedlist));
		
		
		
	}
}
